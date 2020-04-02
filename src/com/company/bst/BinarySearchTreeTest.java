package com.company.bst;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BinarySearchTreeTest {
    private BinarySearchTree bst;

    @Test
    void insert() {
        int root = 10;
        bst = new BinarySearchTree();
        bst.insert(root);

        assertEquals(1, bst.size());
        int child = 5;
        bst.insert(child);

        assertEquals(2, bst.size());
    }
}