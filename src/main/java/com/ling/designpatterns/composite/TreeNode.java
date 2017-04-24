package com.ling.designpatterns.composite;/**
 * Created by Administrator on 2017/4/23.
 */

import java.util.Enumeration;
import java.util.Vector;

/**
 * 树节点
 *
 * @author Administrator
 * @create 2017-04-23 21:29
 */
public class TreeNode {
    private String name ;
    private TreeNode parent ;
    private Vector<TreeNode> children = new Vector<TreeNode>();

    public TreeNode(String name){
        this.name = name ;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TreeNode getParent() {
        return parent;
    }

    public void setParent(TreeNode parent) {
        this.parent = parent;
    }
    /**
     * method:add
     * @description 添加孩子结点
     * @param node
     * @return void
     * @throws
     *
     * @author Administrator
     * @date 2017/4/23
     */
    public void add(TreeNode node){
        children.add(node) ;
    }
    /**
     * method:remove
     * @description 移除孩子结点
     * @param node
     * @return void
     * @throws
     *
     * @author Administrator
     * @date 2017/4/23
     */
    public void remove(TreeNode node){
       children.remove(node) ;
    }
    /**
     * method:getChildern
     * @description 取得孩子结点
     * @param
     * @return java.util.Enumeration<com.ling.designpatterns.composite.TreeNode>
     * @throws
     *
     * @author Administrator
     * @date 2017/4/23
     */
    public Enumeration<TreeNode> getChildern(){

        return children.elements() ;
    }
}
