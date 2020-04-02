package com.company.bst;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BinarySearchTreeTest {

    @Test
    void insert() {
        BinarySearchTree<Integer> bst = new BinarySearchTree<>();
        bst.insert(10);
        assertEquals(1, bst.size());

        bst.insert(5);
        assertEquals(2, bst.size());

        bst.insert(2);
        assertEquals(3, bst.size());
    }
}