package com.pragya;

public class Main {

    public static void main(String[] args) {

        //width of int=32 (4 bytes)
        int myIntValue=5/3;

        //width of float= 32 (4 bytes)
        float myFloatValue= 5f/3f;

        //width of double =64 (8 bytes)
        double myDoubleValue= 5d/3d;

        //System.out.println("myFloatValue= " + myFloatValue );
        //System.out.println("myIntValue= " + myIntValue);
        //System.out.println("myDoubleValue= " + myDoubleValue);

        double poundValue= 200d;
        double kilogramValue= 0.45359237d * poundValue;
        //System.out.println("kilogramvalue is = " + kilogramValue);

        double pi= 3.141_592_7d;
    }
}
