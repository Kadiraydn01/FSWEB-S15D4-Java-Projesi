package com.workintech.stack;

import java.util.Locale;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        System.out.println(checkForPalindrome("abccba"));
        System.out.println(checkForPalindrome("Was it a car or a cat I saw ?"));
        System.out.println(checkForPalindrome("I did, did I?"));
        System.out.println(checkForPalindrome("hello"));
        System.out.println(checkForPalindrome("Don't node"));

    }

    public static boolean checkForPalindrome(String text) {
        text = text.replaceAll("[.',?!_\\- ]", "").toLowerCase(Locale.ENGLISH);
        Stack<Character> stack = new Stack<>();

        for (char c : text.toCharArray()) {

            stack.add(c);
        }
        System.out.println(text);
        StringBuilder reversedText = new StringBuilder();

        while (!stack.isEmpty()) {
            char c = stack.pop();
            reversedText.append(c);
        }
        System.out.println(reversedText);

        return text.contentEquals(reversedText);
    }
}