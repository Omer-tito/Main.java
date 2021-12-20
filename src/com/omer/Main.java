package com.omer;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        Methods meth = new Methods();
        //System.out.println(meth.monthlyWage());
        // System.out.println(meth.getGradeAverage());
        //System.out.println(meth.invest());

        //#1. Scan an integer from the user, if the user didn't provide the correct input, keep asking for an integer until
        //You get one.
        //enterInteger();

        integerExists(677, 9);//num does not appear
        integerExists(990, 0);//exists
        int[] arrayMixed = {-4, 2, -1, -5, -2, -65, -38, -125, -131, 4, -5, 8, 166};
        System.out.println();
        System.out.println(intToEvenArray(89321345));
        System.out.println();
        System.out.println(isPalindrum("PooP"));
        System.out.println(isPalindrum("expedience"));
        System.out.println();
        System.out.println(isNumPali(561273));
        System.out.println(isNumPali(5446445));
        System.out.println();
        System.out.println(isMustBePali(346734));
    }

    public static void enterInteger() {
        System.out.println("enter integer : ");
        Scanner scan = new Scanner(System.in);
        while (!scan.hasNextInt()) {
            System.out.println("Input is not a number.");
            scan.nextLine();
        }
        int number = scan.nextInt();

    }
    //2. Write a method that takes in an integer and a digit (0-9) and returns a boolean that indicates whether
    //The integer has the digit inside it
    //example:
    //isDigitInNum(365, 6) -> true


    public static void integerExists(int num, int numExists) {
        String sNum = String.valueOf(num);
        String sExist = String.valueOf(numExists);
        final boolean contains = sNum.contains(sExist);
        if (sNum.contains(sExist)) {
            System.out.println("the digit: " + numExists + " exists in the the number: " + num);
        } else {
            System.out.println("the digit: " + numExists + " does not appear in: " + num);
        }
    }
    //3. Write a method that takes in a number and returns an array containing all of the number’s even digits
    //example:
    //numToEvenArr(3421) -> [ 4, 2 ]

    public static String intToEvenArray(int num) {
        int counter = 0;
        char[] intToChars = String.valueOf(num).toCharArray();
        for (int i = 0; i < intToChars.length; i++) {
            if (intToChars[i] % 2 == 0) {
                counter++;
            }
        }
        char[] evenArray = new char[counter];
        counter = 0;
        for (char intToChar : intToChars) {
            if (intToChar % 2 == 0) {
                evenArray[counter] = intToChar;
                counter++;
            }
        }
        return Arrays.toString(evenArray);
    }

    //4. A palindrome is a string that is written from left to right in the same way.
    //Write a method that takes in a string and returns whether it’s a palindrome or not
    //Examples:
    //A - isPalindrome(“abcdcba”) -> true
    //B - isPalindrome(“dddd”) -> true
    //C - isPalindrome(“jajaj”) -> true
    //D - isPalindrome(“abcdefg”) -> false

    public static boolean isPalindrum(String string) {
        boolean isPali = false;
        char[] stringCheck = String.valueOf(string).toCharArray();
        for (int i = 0; i < stringCheck.length; i++) {
            if (stringCheck[i] == stringCheck[stringCheck.length - i - 1]) {
                isPali = true;
            } else {
                isPali = false;
                return false;
            }
        }
        return isPali;
    }

    //5. Write a method that checks whether a number is a palindrome (search google to see how to convert a
    //            Number to a string)
    public static boolean isNumPali(int integer) {
        boolean isPali = false;
        char[] stringCheck = String.valueOf(integer).toCharArray();
        for (int i = 0; i < stringCheck.length; i++) {
            if (stringCheck[i] == stringCheck[stringCheck.length - i - 1]) {
                isPali = true;
            } else {
                isPali = false;
                return false;
            }
        }
        return isPali;
    }

    //6. Write a method that takes in a number, and if it isn’t a palindrome, it will add 1 to it until it is a palindrome
    public static boolean isMustBePali(int integer) {
        boolean isNotPali = true;
        while (isNotPali) {
            if (isNumPali(integer)) {
                System.out.println(integer);
                return true;
            } else {
                integer++;
            }
        }
        System.out.println(integer);
        return true;
    }
}