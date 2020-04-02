package com.company.tree;

public class Node<T> {
    private T data;
    private Node<T> ancestor;
    private Node<T> leftChild;
    private Node<T> rightChild;

    public Node<T> getAncestor() {
        return ancestor;
    }

    public void setAncestor(Node<T> ancestor) {
        this.ancestor = ancestor;
    }

    public Node<T> getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(Node<T> leftChild) {
        this.leftChild = leftChild;
    }

    public Node<T> getRightChild() {
        return rightChild;
    }

    public void setRightChild(Node<T> rightChild) {
        this.rightChild = rightChild;
    }
}
