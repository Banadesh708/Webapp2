package com.example.SpringDemo2;
import java.io.*;
class GFG {

    // Function to find and print pair
    static boolean Check(int A[], int size, int x)
    {
        for (int i = 0; i < (size - 1); i++) {
            for (int j = (i + 1); j < size; j++) {
                if (A[i] + A[j] == x) {
                    return true;
                }
            }
        }

        return false;
    }


public static void main(String[] args) {
    int A[]={1,2,3,4,5,6};
    int size=A.length;
    int x= 7;
    if (Check(A,x,size)){
        System.out.println("Yes");
    }
    else {
        System.out.println("No");
    }
}


    }

