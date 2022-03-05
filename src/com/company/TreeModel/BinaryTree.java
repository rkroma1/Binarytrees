/*
 * Copyright (c) 2022. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.company.TreeModel;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BinaryTree {
    Node root;

    public BinaryTree() {
        this.root = null;
    }
    public BinaryTree(Node root) {
        this.root = root;
    }
    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
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
    public void initTree(){
        Node a = new Node("a"), b = new Node("b")
                , c = new Node("c"), d = new Node("d")
                , e = new Node("e"), f = new Node("f");
        a.setLeft(b);
        a.setRight(c);
        b.setLeft(d);
        b.setRight(e);
        c.setRight(f);
        this.root = a;
    }
    /*
     * this functions traverses through a tree using Depth First algorithm
     * and prints every visited node in DFS order a,b,d,e,c,f
     */
    public void PrintDepthFirstTraverse(){
        System.out.println("Depth First Traversal:");
        Node root = this.root;
        if(root == null){
            System.out.println("tree is empty");
        }else{
            Stack<Node> stack = new Stack<Node>();
            Node current = root;
            while(current != null){
                System.out.println(current.getValue());

                if(current.getRight()!= null){
                    stack.push(current.getRight());
                } if(current.getLeft()!= null){
                    stack.push(current.getLeft());
                }
                if(!stack.empty()){
                    current = stack.pop();
                }else{
                    current = null;
                }

            }
        }


    }
    public void printBreadthFirstTraverse(){
        System.out.println("Breadth First Traversal:");
        Node root = this.root;
        if(root == null){
            System.out.println("tree is empty");
        }else{
            Queue <Node> q = new LinkedList<>();
            Node current = root;
            while(current != null){
                System.out.println(current.getValue());
                if(current.getLeft() != null){
                    q.add(current.getLeft());
                }
                if(current.getRight() != null){
                    q.add(current.getRight());
                }
                if(!q.isEmpty()){
                    current = q.remove();
                }
                else{
                    current = null;
                }
            }
        }
    }
    public void searchForValue(String target){
        System.out.println("Searching for" + target);
        Node root = this.root;
        Node current = root;
        Queue <Node> queue = new LinkedList<Node>();
        int count = 1;
        while(current != null){
            if(current.getValue().equals(target)){
                System.out.println(target + " is found at node: " + count);
                break;
            }
            if(current.getLeft() != null){
                queue.add(current.getLeft());
            }
            if(current.getRight() != null){
                queue.add(current.getRight());
            }
            if(!queue.isEmpty()){
                current = queue.remove();
            }else{
                current = null;
            }
            count ++;
        }
    }

}
