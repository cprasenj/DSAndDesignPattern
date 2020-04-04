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

        BinarySearchTree<Double> bst1 = new BinarySearchTree<>();
        bst1.insert(10.1);
        assertEquals(1, bst1.size());

        bst1.insert(5.2);
        assertEquals(2, bst1.size());

        bst1.insert(2.3);
        assertEquals(3, bst1.size());


    }
}