package com.company;

import com.company.TreeModel.BinaryTree;
import com.company.TreeModel.Node;

public class Main {

    public static void main(String[] args) {
        BinaryTree btree = new BinaryTree();
        btree.initTree();
        btree.PrintDepthFirstTraverse();
        btree.printBreadthFirstTraverse();
        btree.searchForValue("e");
    }



}
