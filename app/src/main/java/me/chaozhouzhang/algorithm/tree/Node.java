package me.chaozhouzhang.algorithm.tree;

/**
 * Created on 2019/1/15 19:31
 *
 * @author zhangchaozhou
 */
public class Node {
    private int iData;
    private double fData;
    private Node leftChild;
    private Node rightChild;


    public void display(){
        System.out.println();
    }

    public int getiData() {
        return iData;
    }

    public Node setiData(int iData) {
        this.iData = iData;
        return this;
    }

    public double getfData() {
        return fData;
    }

    public Node setfData(double fData) {
        this.fData = fData;
        return this;
    }

    public Node getLeftChild() {
        return leftChild;
    }

    public Node setLeftChild(Node leftChild) {
        this.leftChild = leftChild;
        return this;
    }

    public Node getRightChild() {
        return rightChild;
    }

    public Node setRightChild(Node rightChild) {
        this.rightChild = rightChild;
        return this;
    }
}
