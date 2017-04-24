package com.ling.designpatterns.composite;/**
 * Created by Administrator on 2017/4/23.
 */

/**
 * 树结构
 *
 * @author Administrator
 * @create 2017-04-23 21:40
 */
public class Tree {
    TreeNode root = null ;

    public Tree(String name){
        root = new TreeNode(name) ;
    }
}
