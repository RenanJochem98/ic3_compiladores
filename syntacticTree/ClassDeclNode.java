package syntacticTree;

import parser.*;


public class ClassDeclNode extends GeneralNode {
    public Token qualificator;
    public Token qualificatorFinal;
    public Token name;
    public Token supername;
    public ClassBodyNode body;

    public ClassDeclNode(Token q, Token qf, Token t1, Token t2, Token t3, ClassBodyNode c) {
        super(t1); // passa token de referncia para construtor da superclasse
        qualificator = q;
        qualificatorFinal = qf;
        name = t2;
        supername = t3;
        body = c;
    }
}
