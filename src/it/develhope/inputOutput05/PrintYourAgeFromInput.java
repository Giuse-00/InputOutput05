package it.develhope.inputOutput05;

import java.util.Scanner;

public class PrintYourAgeFromInput {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Print your age: ");

        int age = input.nextInt();

        System.out.printf("Your age is %d", age);

        input.close();

    }
}
