package com.sparta.jas.binaryTree;

import com.sparta.jas.binaryTree.exceptions.ChildNotFoundException;

public class BinaryTreeManager {
    int[] setupArr = new int[]{5,8,4,-6,3,-2,-9};
    Tree binaryTree = new Tree(setupArr);

    public void runBinaryTree(){
        System.out.println(binaryTree.getRootElement());
        System.out.println(binaryTree.getNumberOfElements());
        System.out.println(binaryTree.getSortedTreeAsc().toString());
        System.out.println(binaryTree.getSortedTreeDesc().toString());
        try {
            System.out.println(binaryTree.getLeftChild(-6));
        } catch (ChildNotFoundException e) {
            e.getMessage();
        }
    }
}
