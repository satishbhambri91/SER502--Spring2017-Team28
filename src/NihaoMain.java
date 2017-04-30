import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
public class NihaoMain {

	public static void main(String[] args) {
 	     String strtoking = "/Users/prashanth/Desktop/NihaoFinal/src/sample1";
             File f = new File(strtoking);
             InputStreamReader read = new InputStreamReader(new FileInputStream(f));
	     ANTLRInputStream input = new ANTLRInputStream(read);

	     NihaoLexer lexer = new NihaoLexer(input);

	     CommonTokenStream tokens = new CommonTokenStream(lexer);

	     NihaoParser parser = new NihaoParser(tokens);
	     ParseTree tree = parser.r(); 

	     ParseTreeWalker walker = new ParseTreeWalker();
	     NihaoWalker token = new NihaoWalker();
	     walker.walk( token, tree );
	     System.out.println(tree.toStringTree(parser));
		

	}

}
