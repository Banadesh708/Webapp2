package com.example.SpringDemo2;
//a linked list consists of nodes where each node contains a data field and a reference(link) to the next node in the list
//every element is a separate object with a data part and address part
//The elements are linked using pointers and addresses. Each element is known as a node
//The main difference between a normal linked list and a doubly LinkedList is that a doubly linked list contains an extra pointer, typically called the previous pointer, together with the next pointer and data which are there in the singly linked list.

import java.util.LinkedList;

public class Linkedlists {
    public static void main(String[] args) {
        LinkedList<String> L1 =new LinkedList<String>();
        L1.add("Banadesh Bali");
        L1.add("Btech");
        L1.add("ECE");
        L1.add("ABCD");
        L1.add("XYZ");

        System.out.println(L1);
        L1.removeFirst();
        L1.remove(3);
        L1.removeLast();
        System.out.println(L1);
    }
}
