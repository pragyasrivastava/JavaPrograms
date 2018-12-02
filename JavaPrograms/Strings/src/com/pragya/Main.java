package com.pragya;

public class Main {

    public static void main(String[] args) {

    String myString= "This is my String" ;

       // System.out.println("my string is : " + myString);

        myString = myString + ",and this is more." ;

        //System.out.println("my string is : " + myString);

        myString = myString + " "+ "\u00A9 2018" ;

        //System.out.println("my string is : " + myString);

        String numberString= "250.55" ;
        numberString = numberString + "49.95" ;

        System.out.println("The Result is : " +numberString);

        String lastString = "10" ;
        int myInt = 50 ;
        lastString = lastString + myInt ;
        System.out.println("The Result is : " + lastString);

        double myDouble = 120.47d;
        lastString =lastString + myDouble ;

        System.out.println("The Result is : " + lastString);
    }
}
