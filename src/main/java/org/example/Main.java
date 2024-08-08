package org.example;


import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Objects;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        String testString = "A man, a plan, a canal, Panama!";
        boolean result = checkForPalindrome(testString);
        if (result) {
            System.out.println("\"" + testString + "\" bir palindromdur.");
        } else {
            System.out.println("\"" + testString + "\" bir palindrom değildir.");
        }
    }


    public static boolean checkForPalindrome(String text) {
        String cleanedStr = text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < cleanedStr.length(); i++) {
            stack.push(cleanedStr.charAt(i));
        }

        StringBuilder reversedStr = new StringBuilder();
        while (!stack.isEmpty()) {
            reversedStr.append(stack.pop());
        }

        return cleanedStr.equals(reversedStr.toString());
    }



    public static String convertDecimalToBinary(int decimal){
        LinkedList<Integer> binaryList = new LinkedList<>();
      while(decimal>0){
          int reminder = decimal % 2;
          binaryList.addFirst(reminder);
          decimal = decimal / 2;
      }
      StringBuilder binaryString = new StringBuilder();
      for (int digit: binaryList){
          binaryString.append(digit);
      }
      return binaryString.toString();
    }

}

