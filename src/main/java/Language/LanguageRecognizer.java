package Language;

import Language.ANTLRGenerated.MyLanguageLexer;
import Language.ANTLRGenerated.MyLanguageParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.antlr.v4.runtime.tree.ParseTree;
import org.json.simple.JSONObject;

import java.io.*;

public class LanguageRecognizer {
    private InputStream codeInput;
    private JSONGenerator jsonWriter;

    public LanguageRecognizer(InputStream in) {
        codeInput = in;
    }

    public void checkSyntax() {
        try {
            //InputStream in = new ByteArrayInputStream(testText.getBytes());
            CharStream inputStreamFinal = CharStreams.fromStream(codeInput);
            MyLanguageLexer lexer = new MyLanguageLexer(inputStreamFinal);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            MyLanguageParser parser = new MyLanguageParser(tokens);
            ParseTree tree = parser.start();
            jsonWriter = new JSONGenerator();
            jsonWriter.visit(tree);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseCancellationException e) {
            System.out.println(e);
        }
    }

    public void writeToFile(File file) {
        if (jsonWriter == null)
            checkSyntax();
        JSONObject generatedJSON = jsonWriter.getParseResult();
        try (FileWriter outWriter = new FileWriter(file)) {
            outWriter.write(generatedJSON.toJSONString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws IOException {
        String testText =
                "def andomer(arg1, arg2, arg3) {\n" +
                        "    x = 13 - arg1 * (arg2 + arg3)\n" +
                        "    return x * arg1\n" +
                        "}\n" +
                        "def ross(argg) {\n" +
                        "   y = 2 + 2 - argg\n" +
                        "   y = andomer(1,6, 6) / 124\n" +
                        "   return y - 3\n" +
                        "}\n" +
                        "y = andomer(1, 2, x)";
        //ANTLRInputStream myTestInput = new ANTLRInputStream(testText);
        InputStream in = new ByteArrayInputStream(testText.getBytes());
        CharStream inputStreamFinal = CharStreams.fromStream(in);
        MyLanguageLexer lexer = new MyLanguageLexer(inputStreamFinal);
        //lexer.removeErrorListeners();
        //lexer.addErrorListener(MyErrorListener.INSTANCE);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        MyLanguageParser parser = new MyLanguageParser(tokens);
        //parser.removeErrorListeners();
        //parser.addErrorListener(MyErrorListener.INSTANCE);
        ParseTree tree = parser.start();

        //System.out.println(tree.toStringTree(parser));
        JSONGenerator generator = new JSONGenerator();
        generator.visit(tree);
        JSONObject generatedJSON = generator.getParseResult();
        File outFile = new File("JSON.json");
        try (FileWriter outWriter = new FileWriter(outFile)) {
            outWriter.write(generatedJSON.toJSONString());
        } catch (IOException ignored) {}
    }
}
