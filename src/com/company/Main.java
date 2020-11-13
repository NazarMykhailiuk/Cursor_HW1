package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("BYTE TYPE");
        byte b1 = 6;
        byte b2 = 4;
        byte AdditionForByte = (byte) (b1 + b2);
        byte SubtractionForByte = (byte) (b1 - b2);
        byte MultiplicationForByte = (byte) (b1 * b2);
        byte DivisionForByte = (byte) (b1 / b2);
        System.out.println("Addition: " + b1 + " + " + b2 + " = " + AdditionForByte);
        System.out.println("Subtraction: " + b1 + " - " + b2 + " = " + SubtractionForByte);
        System.out.println("Multiplication: " + b1 + " x " + b2 + " = " + MultiplicationForByte);
        System.out.println("Division: " + b1 + " / " + b2 + " = " + DivisionForByte + "\n");

        System.out.println("SHORT TYPE");
        short s1 = 255;
        short s2 = 21;
        short AdditionForShort = (short) (s1 + s2);
        short SubtractionForShort = (short) (s1 - s2);
        short MultiplicationForShort = (short) (s1 * s2);
        short DivisionForShort = (short) (s1 / s2);
        System.out.println("Addition: " + s1 + " + " + s2 + " = " + AdditionForShort);
        System.out.println("Subtraction: " + s1 + " - " + s2 + " = " + SubtractionForShort);
        System.out.println("Multiplication: " + s1 + " x " + s2 + " = " + MultiplicationForShort);
        System.out.println("Division: " + s1 + " / " + s2 + " = " + DivisionForShort + "\n");

        System.out.println("LONG TYPE");
        long l1 = 256458L;
        long l2 = 5568L;
        long AdditionForLong = l1 + l2;
        long SubtractionForLong = l1 - l2;
        long MultiplicationForLong = l1 * l2;
        long DivisionForLong = l1 / l2;
        System.out.println("Addition: " + l1 + " + " + l2 + " = " + AdditionForLong);
        System.out.println("Subtraction: " + l1 + " - " + l2 + " = " + SubtractionForLong);
        System.out.println("Multiplication: " + l1 + " x " + l2 + " = " + MultiplicationForLong);
        System.out.println("Division: " + l1 + " / " + l2 + " = " + DivisionForLong + "\n");

        System.out.println("DOUBLE TYPE");
        double d1 = 5889785.458d;
        double d2 = 98754.255d;
        double AdditionForDouble = d1 + d2;
        double SubtractionForDouble = d1 - d2;
        double MultiplicationForDouble = d1 * d2;
        double DivisionForDouble = d1 / d2;
        System.out.println("Addition: " + d1 + " + " + d2 + " = " + AdditionForDouble);
        System.out.println("Subtraction: " + d1 + " - " + d2 + " = " + SubtractionForDouble);
        System.out.println("Multiplication: " + d1 + " x " + d2 + " = " + MultiplicationForDouble);
        System.out.println("Division: " + d1 + " / " + d2 + " = " + DivisionForDouble + "\n");

        System.out.println("FLOAT TYPE");
        float f1 = 542.254f;
        float f2 = 264.6558f;
        float AdditionForFloat = f1 + f2;
        float SubtractionForFloat = f1 - f2;
        float MultiplicationForFloat = f1 * f2;
        float DivisionForFloat = f1 / f2;
        System.out.println("Addition: " + f1 + " + " + f2 + " = " + AdditionForFloat);
        System.out.println("Subtraction: " + f1 + " - " + f2 + " = " + SubtractionForFloat);
        System.out.println("Multiplication: " + f1 + " x " + f2 + " = " + MultiplicationForFloat);
        System.out.println("Division: " + f1 + " / " + f2 + " = " + DivisionForFloat);
    }
}
