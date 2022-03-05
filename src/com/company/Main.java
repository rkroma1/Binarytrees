package com.company;

import com.company.TreeModel.Node;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    /*
     * Function that initiate a binary tree of nodes a,b,c,d,e,f
     *              a
     *             / \
     *           b    c
     *          / \    \
     *         d   e    f
     * the function then returns the root node a
     */
    public Node initTree(){
        Node a = new Node("a"), b = new Node("b")
                , c = new Node("c"), d = new Node("d")
                , e = new Node("e"), f = new Node("f");
        a.setLeft(b);
        a.setRight(c);
        b.setLeft(d);
        b.setRight(e);
        c.setRight(f);

        return a;
    }
    public void depthFirstTraverse(Node root){

    }
}
