package com.omer;

import java.util.Scanner;

public class Methods {

    final static Scanner SCANNER = new Scanner(System.in);



    public void integerExists(int num, int numExists) {
        String sNum = String.valueOf(num);
        String sExist = String.valueOf(numExists);
        final boolean contains = sNum.contains(sExist);
        if (sNum.contains(sExist)) {
            System.out.println("the digit: " + numExists + " exists in the the number: " + num);
        } else {
            System.out.println("the digit: " + numExists + " does not appear in: " + num);
        }
    }


    public int monthlyWage() {
        System.out.println("per hour: ");
        int hourlyRate = SCANNER.nextInt();
        System.out.println("reg hours: ");
        int regularHours = SCANNER.nextInt() * (hourlyRate);
        System.out.println("ext hours: ");
        int extraHours = (int) (SCANNER.nextInt() * (hourlyRate * 1.25));
        System.out.println("sbt hours");
        int shabatHours = (int) (SCANNER.nextInt() * (hourlyRate) * 1.5);

        return (regularHours + extraHours + shabatHours);
    }

    public double getGradeAverage() {
        int num = 0;
        System.out.println("tests taken");
        int testsTaken = SCANNER.nextInt();
        for (int i = 0; i < testsTaken; i++) {
            System.out.println("enter grade: ");
            int currentTestGrade = SCANNER.nextInt();
            num += currentTestGrade;
        }
        double average;
        return average = num / testsTaken;
    }

    public double invest() {
        int currentInvestment = 0;
        final int monthsPerYear = 12;
        System.out.println("investment: ");
        final int investment = SCANNER.nextInt();
        System.out.println("time in years: ");
        final int time = SCANNER.nextInt();
        System.out.println("insert interest: ");
        final double interest = SCANNER.nextInt();
        for (int i = 0; i < time * (monthsPerYear); i++) {
            currentInvestment += investment *(interest*0.1);
        }
        System.out.println("investment after " + time + " is: " + currentInvestment);
        return currentInvestment;
    }
}
