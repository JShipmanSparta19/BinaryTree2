package com.sparta.jas;

import com.sparta.jas.binaryTree.Tree;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CreateWithMultiples {
    private Tree multiplesTree;
    private int[] setupArr = new int[]{5, 16, 3, 9, 18, 1, 14, 3};

    @Before
    public void classSetup(){
        multiplesTree = new Tree(setupArr);
    }

    @Test
    public void sizeTest(){
        Assert.assertEquals(setupArr.length - 1, multiplesTree.getNumberOfElements());
    }

    @Test
    public void testSortedArrayAsc(){
        int[] sortedArrayAsc = multiplesTree.getSortedTreeAsc();
        for (int i = 0; i < sortedArrayAsc.length - 1; i++){
            Assert.assertTrue(sortedArrayAsc[i] <= sortedArrayAsc[i+1]);
        }
    }

    @Test
    public void testSortedArrayDesc(){
        int[] sortedArrayDesc = multiplesTree.getSortedTreeDesc();
        for (int i = 0; i < sortedArrayDesc.length - 1; i++){
            Assert.assertTrue(sortedArrayDesc[i] >= sortedArrayDesc[i+1]);
        }
    }
}
