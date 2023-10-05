package com.workintech.binary;

import java.util.Stack;

public class DecimalToBinary {
    public static String decimalToBinary(int decimalNumber) {
        Stack<Integer> stack = new Stack<>();


        while (decimalNumber > 0) {
            int remainder = decimalNumber % 2;
            stack.push(remainder);
            decimalNumber = decimalNumber / 2;
        }


        StringBuilder binary = new StringBuilder();
        while (!stack.isEmpty()) {
            binary.append(stack.pop());
        }

        return binary.toString();
    }

    public static void main(String[] args) {
        int decimalNumber = 22;
        String binary = decimalToBinary(decimalNumber);
        System.out.println("Decimal " + decimalNumber + " binary formatı: " + binary);
        System.out.println(Integer.toBinaryString(25));
    }
}
