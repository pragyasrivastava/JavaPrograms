package com.pragya;

public class Main {

    public static void main(String[] args) {

        int myVariable= 50; //entire line including semicolon and data type is a statement
        myVariable++;
        myVariable--;
        System.out.println("This is a test");

        System.out.println("This is"
                + "another" +
                "still more"); //Valid in Java

        int anotherVariable= 50;anotherVariable++; //still a valid statement as Java is able to find the separator
    }
}
