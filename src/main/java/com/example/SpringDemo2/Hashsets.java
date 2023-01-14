package com.example.SpringDemo2;

import java.util.HashSet;
import java.util.Iterator;

//Hashing in Java is a technique for mapping data to a secret key, that can be used as a unique identifier for data.
//  The important points about Java HashSet class are:
//
//HashSet stores the elements by using a mechanism called hashing.
//HashSet contains unique elements only.
//HashSet allows null value.
//HashSet class is non synchronized.
//HashSet doesn't maintain the insertion order. Here, elements are inserted on the basis of their hashcode.
//HashSet is the best approach for search operations.
public class Hashsets {
    public static void main(String[] args) {
        HashSet<String> hash = new HashSet<>();
        hash.add("4");
        hash.add("5");
        hash.add("6");
        hash.add("7");
        hash.add("8");
        Iterator<String> i = hash.iterator();
        while (i.hasNext()) //The hasNext() method of ListIterator interface is used to return true if the given list iterator contains more number of element during traversing the given list in the forward direction.
        {
            System.out.println(i.next());
        }
    }
}
