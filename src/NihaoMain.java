import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
public class NihaoMain {

	public static void main(String[] args) {
             InputStreamReader read = new InputStreamReader(args[1]);
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
