package com.example.SpringDemo2;

public class SwitchDemo {
    public static void main(String[] args) {
        int Week = 3;
        String Weekname ;
        switch (Week) {
            case 1 :
                Weekname = "Monday";
                break;
            case 2 :
                Weekname="Tuesday";
                break;
            case 3 :
                Weekname="Wednesday";
                break;
            default:
                Weekname="Invalid";
                break;
        }
        System.out.println(Weekname);
    }
}
