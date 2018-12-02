package com.pragya;

public class Main {

    public static void main(String[] args) {

        //int has a width of 32

        int myMinValue= -2_147_483_648;

        int myMaxValue= 2_147_483_647;
        int myTotal =(myMinValue/2);
        //System.out.println("myTotal= " + myTotal);

        //byte has a width of 8
        byte myByteValue= -128;

        byte myByteMaxValue= 127;
        int myNewByteValue= (byte)(myByteValue/2);
        //System.out.println("myNewByteValue " +myNewByteValue);

        //short has a width of 16
        short myShortMinValue= -32768;

        short myShortMaxValue= 32767;

        //long has a width of 64
        long myLongValue = 100L;

        long myLongMinValue= -9_223_372_036_854_775_808L;
        long myLOngMaxValue= 9_223_372_036_854_775_807L;

        byte byteValue= 10;
        int intValue= 50;
        short shortValue= 25;

        long longTotal= 50000L+ 10L * (byteValue + intValue + shortValue);
        System.out.println("myLongTotal= " + longTotal);

        short shortTotal= (short) (1000 + 10 * (byteValue + intValue + shortValue));
        System.out.println("shortTotal = " + shortTotal);

    }
}
