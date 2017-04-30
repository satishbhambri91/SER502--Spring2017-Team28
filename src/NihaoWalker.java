
//The class which is used to parse the tokens and generate the intermediate code file.

import java.util.ArrayList;
import java.util.List;
import java.io.PrintWriter;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

/**
 * This class provides an empty implementation of, which
 * can be extended to create a listener which only needs to handle a subset of
 * the available methods.
 */
public class NihaoWalker extends NihaoBaseListener {
    public StringBuilder sb = new StringBuilder();
    public List<String> list = new ArrayList<String>();


    @Override
    public void enterR(NihaoParser.RContext ctx) {
    }


    @Override
    public void exitR(NihaoParser.RContext ctx) {
        try {
            PrintWriter writer = new PrintWriter("/Users/prashanth/Desktop/NihaoFinal/src/sample1.sv.ic","UTF-8");
            writer.write(sb.toString());
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(sb.toString());
    }



    @Override
    public void enterStart(NihaoParser.StartContext ctx) {
    }


    @Override
    public void exitStart(NihaoParser.StartContext ctx) {
    }


    @Override
    public void enterVariable(NihaoParser.VariableContext ctx) {
    }


    @Override
    public void exitVariable(NihaoParser.VariableContext ctx) {
    }

    @Override
    public void enterInteger(NihaoParser.IntegerContext ctx) {
    }


    @Override
    public void exitInteger(NihaoParser.IntegerContext ctx) {
    }


    @Override
    public void enterBool(NihaoParser.BoolContext ctx) {
    }


    @Override
    public void exitBool(NihaoParser.BoolContext ctx) {

    }


    @Override
    public void enterStatement(NihaoParser.StatementContext ctx) {
    }


    @Override
    public void exitStatement(NihaoParser.StatementContext ctx) {
    }



    @Override public void enterPrint_statement(NihaoParser.Print_statementContext ctx) {

    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitPrint_statement(NihaoParser.Print_statementContext ctx) {
        sb.append("PRINT"+'\n');
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */

    @Override
    public void enterDatatype_assignment(NihaoParser.Datatype_assignmentContext ctx) {
    }


    @Override
    public void exitDatatype_assignment(NihaoParser.Datatype_assignmentContext ctx) {
        sb.append("PUSH " + ctx.variable().getText() + '\n');
        sb.append("ASSIGN" + '\n');
    }


    @Override public void enterIfelse_statement(NihaoParser.Ifelse_statementContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitIfelse_statement(NihaoParser.Ifelse_statementContext ctx) { }

    @Override
    public void enterIf_statement(NihaoParser.If_statementContext ctx) {
        sb.append("IFCONDITION"+'\n');

    }


    @Override
    public void exitIf_statement(NihaoParser.If_statementContext ctx) {
        sb.append("END"+'\n');
    }


    @Override public void enterElse_statement(NihaoParser.Else_statementContext ctx) {
        sb.append("ELSECONDITION"+'\n');
        sb.append("START"+'\n');
    }

    @Override public void exitElse_statement(NihaoParser.Else_statementContext ctx) {
        sb.append("END"+'\n');
    }

    @Override
    public void enterWhile_statement(NihaoParser.While_statementContext ctx) {
        sb.append("WHILE"+'\n');
    }


    @Override
    public void exitWhile_statement(NihaoParser.While_statementContext ctx) {
        sb.append("OD"+'\n');
    }


    @Override
    public void enterDatatype(NihaoParser.DatatypeContext ctx) {
    }


    @Override
    public void exitDatatype(NihaoParser.DatatypeContext ctx) {
    }

    @Override public void enterExpression_if(NihaoParser.Expression_ifContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitExpression_if(NihaoParser.Expression_ifContext ctx) {
        sb.append("START"+'\n');
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterExpression_while(NihaoParser.Expression_whileContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitExpression_while(NihaoParser.Expression_whileContext ctx) {
        sb.append("DO"+'\n');
    }

    @Override
    public void enterExpression(NihaoParser.ExpressionContext ctx) {

        if (ctx.integer() != null) {
            sb.append("PUSH " + ctx.integer().getText() + "\n");
        }
        if (ctx.bool() != null) {
            sb.append("PUSH " + ctx.bool().getText() + "\n");
        }

    }

    @Override
    public void exitExpression(NihaoParser.ExpressionContext ctx) {

    }


    @Override
    public void enterOperation(NihaoParser.OperationContext ctx) {
        String str = ctx.getText();
        for (int i = str.length() - 1; i >= 0; i--) {
            char ch = str.charAt(i);
            if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                list.add(String.valueOf(ch));
            }
            if (ch == '=') {
                i--;
                if (str.charAt(i) == '=') {
                    list.add("==");
                }
                if (str.charAt(i) == '>') {
                    list.add(">=");
                }
                if (str.charAt(i) == '<') {
                    list.add("<=");
                }

            }
            if (ch == '>') {
                list.add(">");
            }
            if (ch == '<') {
                list.add("<");
            }
        }
    }

    @Override
    public void exitOperation(NihaoParser.OperationContext ctx) {
        for (int i = list.size() - 1; i >= 0; i--) {
            String str = list.get(i);

            if (str.compareTo("+") != 0 && str.compareTo("-") != 0 && str.compareTo("*") != 0 && str.compareTo("/") != 0
                    && str.compareTo("==") != 0 && str.compareTo(">=") != 0 && str.compareTo("<=") != 0
                    && str.compareTo(">") != 0 && str.compareTo("<") != 0) {
                sb.append("PUSH " + str + '\n');
            }
        }
        for (int i = list.size() - 1; i >= 0; i--) {
            String str2 = list.get(i);
            if (str2.compareTo("+") == 0) {
                sb.append("+" + '\n');
            } else if (str2.compareTo("-") == 0) {
                sb.append("-" + '\n');
            } else if (str2.compareTo("*") == 0) {
                sb.append("*" + '\n');
            } else if (str2.compareTo("/") == 0) {
                sb.append("/" + '\n');
            } else if (str2.compareTo("==") == 0) {
                sb.append("==" + '\n');
            } else if (str2.compareTo(">=") == 0) {
                sb.append(">=" + '\n');
            } else if (str2.compareTo("<=") == 0) {
                sb.append("<=" + '\n');
            } else if (str2.compareTo(">") == 0) {
                sb.append(">" + '\n');
            } else if (str2.compareTo("<") == 0) {
                sb.append("<" + '\n');
            }
        }
        list.clear();
    }


    @Override
    public void enterExp(NihaoParser.ExpContext ctx) {
    }

    @Override
    public void exitExp(NihaoParser.ExpContext ctx) {
    }


    @Override
    public void enterTerm(NihaoParser.TermContext ctx) {
    }

    @Override
    public void exitTerm(NihaoParser.TermContext ctx) {
    }

    @Override
    public void enterFactor(NihaoParser.FactorContext ctx) {
        if (ctx.NUMBER() != null) {
            list.add(ctx.NUMBER().getText());
        }
        if (ctx.VARIABLE() != null) {
            list.add(ctx.VARIABLE().getText());
        }
    }


    @Override
    public void exitFactor(NihaoParser.FactorContext ctx) {

    }


    @Override
    public void enterEveryRule(ParserRuleContext ctx) {
    }


    @Override
    public void exitEveryRule(ParserRuleContext ctx) {
    }


    @Override
    public void visitTerminal(TerminalNode node) {

    }


    @Override
    public void visitErrorNode(ErrorNode node) {
        System.out.println(node.getSymbol().getText());
    }
}