package com.sparta.jas;

import com.sparta.jas.binaryTree.Tree;
import com.sparta.jas.binaryTree.exceptions.ChildNotFoundException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class NegativesAndZeroes {

    private Tree arrayTree;
    private int[] setupArr = new int[]{5,0,3,-9,18,-1,-14,10};

    @Before
    public void classSetup(){
        arrayTree = new Tree(setupArr);
    }

    @Test
    public void rootTest(){
        Assert.assertEquals(setupArr[0], arrayTree.getRootElement());
    }

    @Test
    public void sizeTest(){
        Assert.assertEquals(setupArr.length, arrayTree.getNumberOfElements());
    }

    @Test
    public void expandTest(){
        int[] expansionArr = new int[]{2,-11,4,-8,13};
        arrayTree.addElements(expansionArr);
        Assert.assertEquals(setupArr.length + expansionArr.length, arrayTree.getNumberOfElements());
    }

    @Test
    public void findElementTrue(){
        Assert.assertTrue(arrayTree.findElement(-14));
    }

    @Test
    public void findElementFalse(){
        Assert.assertFalse(arrayTree.findElement(200));
    }

    @Test
    public void leftChildTest(){
        try {
            Assert.assertEquals(arrayTree.getLeftChild(9), 8);
        } catch (ChildNotFoundException e){
            e.getMessage();
        }
    }

    @Test
    public void rightChildTest(){
        try {
            Assert.assertEquals(arrayTree.getRightChild(3), 4);
        } catch (ChildNotFoundException e){
            e.getMessage();
        }
    }

    @Test(expected = ChildNotFoundException.class)
    public void leftChildFail() throws ChildNotFoundException{
        arrayTree.getLeftChild(10);
    }

    @Test(expected = ChildNotFoundException.class)
    public void rightChildFail() throws ChildNotFoundException{
        arrayTree.getRightChild(10);
    }

    @Test(expected = ChildNotFoundException.class)
    public void leftNoParent() throws ChildNotFoundException{
        arrayTree.getLeftChild(100);
    }

    @Test(expected = ChildNotFoundException.class)
    public void rightNoParent() throws ChildNotFoundException{
        arrayTree.getRightChild(100);
    }

    @Test
    public void testSortedArrayAsc(){
        int[] sortedArrayAsc = arrayTree.getSortedTreeAsc();
        for (int i = 0; i < sortedArrayAsc.length - 1; i++){
            Assert.assertTrue(sortedArrayAsc[i] <= sortedArrayAsc[i+1]);
        }
    }

    @Test
    public void testSortedArrayDesc(){
        int[] sortedArrayDesc = arrayTree.getSortedTreeDesc();
        for (int i = 0; i < sortedArrayDesc.length - 1; i++){
            Assert.assertTrue(sortedArrayDesc[i] >= sortedArrayDesc[i+1]);
        }
    }
}
