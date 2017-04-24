package com.ling.designpatterns.composite;

import junit.framework.TestCase;

/**
 * Created by Administrator on 2017/4/23.
 */
public class TreeTest extends TestCase {
    public void testTreeBuild(){
        Tree tree = new Tree("A") ;
        TreeNode nodeB = new TreeNode("B") ;
        TreeNode nodeC = new TreeNode("C") ;
        nodeB.add(nodeC);
        tree.root.add(nodeB);

    }
}