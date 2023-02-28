package com.codecool.simplecalculator;

import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {

        while(true) {
            Float a = askForANumber(false);
            if (a == null) {
                break;
            }
            String op = askForAnOperator(true);
            float b = askForANumber(true);
            float result = calc(op, a, b);
            System.out.println("The result is " + result);
        }
    }

    public static Boolean isNumber(String str) {
        boolean floattest = true;
        try {
            Float.parseFloat(str);
        }
        catch (Exception e){
            floattest = false;
        }
        return floattest;
    }

    public static Float convertNumber(String str) {

        return Float.parseFloat(str);

    }

    public static boolean isValidOperator(String operator) {
        if(operator.equals("+") ||operator.equals("-")||operator.equals("*")||operator.equals("/")){
            return true;
        }
        else {
            return false;
        }
    }

    public static Float askForANumber(boolean forceValidInput) {
       Scanner scanner = new Scanner(System.in);
       while (true) {
           System.out.println("Please provide a number!");
           String user_input = scanner.next();
           if (isNumber(user_input)) {
               return convertNumber(user_input);
           } else {
               if (!forceValidInput) {
                   return null;
               }
               System.out.println("This didn't look like a number, try again.");
           }
       }
    }
    public static String askForAnOperator(boolean forceValidInput) {

        Scanner scanner = new Scanner(System.in);
        String operator = "";
        while (true) {
            System.out.println("Please provide an operator!");
            String user_input = scanner.next();
            if (isValidOperator(user_input)) {
                return user_input;
            } else {
                if (!forceValidInput) {
                    return null;
                }
                System.out.println("Unknown operator.");
            }
        }
    }

    public static Float calc(String op, Float a, Float b) {
        if (!isValidOperator(op)) {
            return null;
        }
        Float result = null;
        switch (op) {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "*":
                result = a * b;
                break;
            case "/":
                if (b == 0.0f) {
                    System.out.println("Error: Division by zero");
                } else {
                    result = a / b;
                }

                break;
        }
        return result;
    }

}
