package com.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by dima on 15.05.17.
 */
public class MyTreeSet {

    private Node parent;

    public MyTreeSet(){
    }

    public void add(String s){
        Node newNode = new Node(s);
        if(parent == null){
            parent = newNode;
        }
        else {
            Node tempParent = parent;
            while (true) {
                if (tempParent.compareTo(newNode) == 0)
                    return;
                else if (tempParent.compareTo(newNode) > 0) {
                    Node left = tempParent.getLeft();
                    if (left == null) {
                        newNode.setParent(tempParent);
                        tempParent.setLeft(newNode);
                        break;
                    }
                    tempParent = left;
                } else {
                    Node right = tempParent.getRight();
                    if (right == null) {
                        newNode.setParent(tempParent);
                        tempParent.setRight(newNode);
                        break;
                    }
                    tempParent = right;
                }
            }
        }
    }

    public void remove(String value){
        remove(parent,value);
    }

    private Node remove(Node parentNode, String value){
        Node removableNode = findNode(parentNode, value);

        if (removableNode == null)
            return parentNode;

        boolean hasParent = removableNode.getParent() != null;
        boolean isLeft = hasParent &&
                removableNode.getData().compareTo(removableNode.getParent().getData()) < 0;

        if (removableNode.getLeft() == null && removableNode.getRight() == null) {
            if (hasParent) {
                if (isLeft) {
                    removableNode.getParent().setLeft(null);
                } else {
                    removableNode.getParent().setRight(null);
                }
            }
        } else if (removableNode.getLeft() != null && removableNode.getRight() == null) {
            if (hasParent) {
                if (isLeft) {
                    removableNode.getParent().setLeft(removableNode.getLeft());
                } else {
                    removableNode.getParent().setRight(removableNode.getLeft());
                }
            } else {
                parentNode = removableNode.getLeft();
            }
        } else if (removableNode.getLeft() == null && removableNode.getRight() != null) {
            if (hasParent) {
                if (isLeft) {
                    removableNode.getParent().setLeft(removableNode.getRight());
                } else {
                    removableNode.getParent().setRight(removableNode.getRight());
                }
            } else {
                parentNode = removableNode.getRight();
            }
        } else {
            Node rightMinimum = findMinNode(removableNode.getRight());

            removableNode.setData(rightMinimum.getData());

            return remove(rightMinimum, rightMinimum.getData());
        }

        return parentNode;
    }

    public boolean removeAll(){
        removeAll(parent);

        parent=null;
        return getSize() == 0;
    }

    private void removeAll(Node node){
        if(node != null) {
            removeAll(node.getLeft());
            removeAll(node.getRight());
            node = null;
        }
    }

    private Node findMinNode(Node node){
        if (node == null) return null;
        while (node.getLeft() != null) {
            node = node.getLeft();
        }
        return node;
    }

    private Node findNode(String value){
        if(contains(value))
            return findNode(parent, value);
        return null;
    }

    private Node findNode(Node node, String value){

        if(node == null)
            return null;

        if(node.getData().equals(value))
            return node;

        return findNode((node.getData().compareTo(value) > 0 ? node.getLeft() : node.getRight()), value);
    }

    public boolean contains(String value){
        return contains(parent, value);
    }

    private boolean contains(Node node, String value){
        if(node == null)
            return false;
        if(node.getData().equals(value))
            return true;

        return contains((node.getData().compareTo(value) > 0 ? node.getLeft() : node.getRight()), value);
    }

    public int getSize(){
        return getSize(parent);
    }

    private int getSize(Node node){
        if(node == null)
            return 0;
        return getSize(node.getLeft()) + getSize(node.getRight()) + 1;
    }

    public int getMaxDepth(){
        return  getMaxDepth(parent);
    }

    private int getMaxDepth(Node node) {
        if (node != null) {
            return Math.max(getMaxDepth(node.getLeft()), getMaxDepth(node.getRight())) + 1;
        }
        return 0;
    }

    public Iterator<String> iterator(){
        List<String> list = new ArrayList<>();

        overpassTree(list, parent);
        return list.iterator();
    }

    private void overpassTree(List<String> list, Node node){
        if(node!=null) {

            list.add(node.getData());

            overpassTree(list, node.getLeft());
            overpassTree(list, node.getRight());
        }
    }

    public boolean isEmpty(){
        return getSize() == 0;
    }
}
