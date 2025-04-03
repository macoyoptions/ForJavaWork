package org.FirstAssigment.JavaLessons;

import java.util.Scanner;

public class Variables {
//variable declaration

    int a;
    //Assigning value to a variable

    int b = 10;


    public static void main(String[] args) {
        System.out.println("Hello world");
        int b = 20;
        System.out.println(1 + 2 + "hello");
        System.out.println("Hello" + 1 + 2);

        //modulus operator
        System.out.println(10 % 3);

        //initializing scanner class
        Scanner scanner = new Scanner(System.in);
        //taking input from user
        System.out.print("Type something");
        String input = scanner.nextLine();
        System.out.println("you typed" + input);


        }

    }
