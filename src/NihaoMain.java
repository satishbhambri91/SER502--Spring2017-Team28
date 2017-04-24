import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
public class NihaoMain {

	public static void main(String[] args) {
		 String stringcode="int a = 22 int c = 0 bool d = true while(d) do  cc = (12+4)*2 od";
	     ANTLRInputStream input = new ANTLRInputStream( stringcode);

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
