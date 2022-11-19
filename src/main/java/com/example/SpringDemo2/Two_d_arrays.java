package com.example.SpringDemo2;

public class Two_d_arrays {
    public static void main(String[] args) {
        int i,j;
        int arr[][]={{1,5,6},{4,6,8},{5,6,7}};
        for ( i =0 ;i<3;i++){
            for (j=0;j<3;j++){
                System.out.println(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
