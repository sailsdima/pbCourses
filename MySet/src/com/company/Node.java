package com.company;

/**
 * Created by dima on 15.05.17.
 */
public class Node implements Comparable<Node> {

    private Node parent;
    private Node left;
    private Node right;

    private String data;

    public Node(String data){
        this.data = data;
    }

    public Node getParent() {
        return parent;
    }

    public void setParent(Node parent) {
        this.parent = parent;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public int compareTo(Node o) {
        return data.compareTo(o.getData());
    }

    @Override
    public String toString() {
        return "Node{" +
                "parent='" + parent +'\'' +
                "data='" + data + '\'' +
                '}';
    }
}
