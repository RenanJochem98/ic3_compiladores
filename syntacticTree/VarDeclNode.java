package syntacticTree;

import parser.*;


public class VarDeclNode extends StatementNode {
    // public Token qualificator;
    // public Token qualificatorFinal;
    public ListNode vars;

    public VarDeclNode(/*Token q, Token qf, */Token t, ListNode p) {
        super(t);
        // qualificator = q;
        // qualificatorFinal = qf;
        vars = p;
    }
}
