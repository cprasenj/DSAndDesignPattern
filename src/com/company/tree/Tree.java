package com.company.tree;

public abstract class Tree<T> {
    private Node<T> root;

    public Tree () {
    }

    public Node<T> getRoot() {
        return root;
    }

    public void setRoot(Node<T> root) {
        this.root = root;
    }
}
