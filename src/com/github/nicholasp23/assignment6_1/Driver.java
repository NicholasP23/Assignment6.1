package com.github.nicholasp23.assignment6_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Driver {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int operation;

        System.out.println("Welcome To Nick's Simple Calculator");
        System.out.println("===================================");
        System.out.println("Which operation would you like to use?\n" +
                "1.) Addition\n" +
                "2.) Subtraction\n"+
                "3.) Multiplication\n"+
                "4.) Division"
        );


        try{
            operation = input.nextInt();
            switch (operation) {
                case 1: {
                    double[] numbers = getNumbers();
                    System.out.println(numbers[0] + " + " + numbers[1] + " = " + addition(numbers[0], numbers[1]));
                    break;
                }
                case 2: {
                    double[] numbers = getNumbers();
                    System.out.println(numbers[0] + " - " + numbers[1] + " = " + subtraction(numbers[0], numbers[1]));
                    break;
                }
                case 3: {
                    double[] numbers = getNumbers();
                    System.out.println(numbers[0] + " * " + numbers[1] + " = " + multiplication(numbers[0], numbers[1]));
                    break;
                }
                case 4: {
                    double[] numbers = getNumbers();
                    if(numbers[1] == 0) {
                        System.out.println("Error, you can not divide by zero please re-run the program!");
                        return;
                    }
                    else{
                        System.out.println(numbers[0] + " / " + numbers[1] + " = " + division(numbers[0], numbers[1]));
                        break;
                    }
                }
                default: {
                    System.out.println("Invalid input, please try again!");
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid Input. Please re-run the calculator!");
        }

    }

    public static double[] getNumbers (){
        Scanner input = new Scanner(System.in);
        double[] nums = new double[2];

        System.out.println("Please input two numbers: ");

        nums[0] = input.nextDouble();
        nums[1] = input.nextDouble();

        return nums;
    }

    public static double addition(double a, double b){
        return a + b;
    }

    public static double subtraction(double a, double b){
        return a - b;
    }

    public static double multiplication(double a, double b){
        return a * b;
    }

    public static double division(double a, double b){
        return a / b;
    }
}
