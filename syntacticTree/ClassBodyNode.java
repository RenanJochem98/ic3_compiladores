package syntacticTree;

import parser.*;


public class ClassBodyNode extends GeneralNode {
    public ListNode clist; // lista de classes aninhadas
    public ListNode vlist; // lista de variveis da classe
    public ListNode ctlist; // lista de construtores
    public ListNode mlist; // lista de mtodos  

    public ClassBodyNode(Token t1, ListNode c, ListNode v, ListNode ct,
        ListNode m) {
        super(t1); // passa token de referncia para construtor da superclasse
        clist = c;
        vlist = v;
        ctlist = ct;
        mlist = m;
    }
}
