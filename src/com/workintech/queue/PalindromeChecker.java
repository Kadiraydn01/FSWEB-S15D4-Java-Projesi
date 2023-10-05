package com.workintech.queue;

import java.util.LinkedList;
import java.util.Locale;
import java.util.Queue;
import java.util.Stack;

public class PalindromeChecker {
    public static boolean isPalindrome(String input) {
        input = input.replaceAll("[.',?!_\\- ]", "").toLowerCase(Locale.ENGLISH);

        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();


        for (char c : input.toCharArray()) {
            stack.push(c);
            queue.add(c);
        }

        StringBuilder reversedTextStack = new StringBuilder();
        StringBuilder reversedTextQueue = new StringBuilder();

        while (!stack.isEmpty()) {
            reversedTextStack.append(stack.pop());
            reversedTextQueue.append(queue.poll());
        }




        return input.contentEquals(reversedTextStack) && input.contentEquals(reversedTextQueue);
    }

    public static void main(String[] args) {
        String[] testStrings = {"I did, did I?", "Racecar", "hello", "Was it a car or a cat I saw ?"};

        for (String str : testStrings) {
            if (isPalindrome(str)) {
                System.out.println(str + " => palindrom");
            } else {
                System.out.println(str + " => palindrom değil");
            }
        }
    }
}
