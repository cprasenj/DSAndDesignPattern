package com.company.bst;

import com.company.tree.Node;
import com.company.tree.Tree;

import java.util.List;
import java.util.function.Function;

import static java.util.Objects.nonNull;

public class BinarySearchTree<T extends Comparable<T>> extends Tree<T> {

    public BinarySearchTree() {
        super();
    }

    public BinarySearchTree<T> insert(T data) {
        Node<T> node = new Node<>(data);
        if (getRoot() == null) {
            setRoot(node);
        }
        getRoot().insertChild(node);
        return this;
    }

    public Node<T> delete(T data) {
        return null;
    }

    public Node<T> search(T data) {
        return null;
    }

    public Integer size() {
        if (nonNull(getRoot())) {
            return getRoot().getChildrenCount() + 1;
        }
        return 0;
    }

    public Integer height() {
        return null;
    }

    public Integer levelWithMaxSum() {
        return null;
    }

    public Node<T> lca(Node<T> one, Node<T> another) {
        return null;
    }

    public <R> List<R> ldrTraversal(Function<T, R> f) {
        return null;
    }

    public <R> List<R> lrdTraversal(Function<T, R> f) {
        return null;
    }

    public <R> List<R> dlrTraversal(Function<T, R> f) {
        return null;
    }

    public <R> List<R> drlTraversal(Function<T, R> f) {
        return null;
    }

    public <R> List<R> rdlTraversal(Function<T, R> f) {
        return null;
    }

    public <R> List<R> rldTraversal(Function<T, R> f) {
        return null;
    }

    public <R> List<R> preOrderTraversal(Function<T, R> f) {
        return dlrTraversal(f);
    }

    public <R> List<R> inOrderTraversal(Function<T, R> f) {
        return ldrTraversal(f);
    }

    public <R> List<R> postOrderTraversal(Function<T, R> f) {
        return lrdTraversal(f);
    }
}
