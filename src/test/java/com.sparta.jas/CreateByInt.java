package com.sparta.jas;

import com.sparta.jas.binaryTree.Tree;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Random;

public class CreateByInt {

    private Tree intTree;
    private int setupNo;

    @Before
    public void classSetup(){
        setupNo = 43;
        intTree = new Tree(setupNo);
    }

    @Test
    public void rootTest(){
        Assert.assertEquals(setupNo, intTree.getRootElement());
    }

    @Test
    public void sizeTest(){
        Assert.assertEquals(1, intTree.getNumberOfElements());
    }

    @Test
    public void expandTest(){
        intTree.addElement(26);
        intTree.addElement(87);
        intTree.addElement(39);
        intTree.addElement(91);
        Assert.assertEquals(5, intTree.getNumberOfElements());
    }
}
