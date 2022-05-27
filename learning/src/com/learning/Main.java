package com.learning;

import javax.swing.JOptionPane;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
         /* String name = JOptionPane.showInputDialog("Entre your name");
          JOptionPane.showMessageDialog(null, "hello " + name);

          int age = Integer.parseInt(JOptionPane.showInputDialog("Entre your age"));
          JOptionPane.showMessageDialog(null, "You are " + age + " years old");

         double height = Double.parseDouble(JOptionPane.showInputDialog("Entre your height"));
         JOptionPane.showMessageDialog(null, "You are " + height + " cm tall");
       */

       /* Scanner scanner = new Scanner(System.in);
        System.out.print("Number: ");
        int number = scanner.nextInt();
        if (number % 2 == 0)
            System.out.println("positive");
        else
            System.out.println("Negative");


            System.out.print("Number: ");

        int num = scanner.nextInt();
        if (num % 5 == 0 && num % 3 ==0)
            System.out.println("FizzBuzz");
        else if (num % 5 == 0)
            System.out.println("Fizz");
        else if (num % 3 == 0)
            System.out.println("Buzz");
        else
            System.out.println(num);


            System.out.print("Age: ");

       int age = scanner.nextInt();
       if (age >= 20)
           System.out.println("You are adult");
       else if (age >=12)
           System.out.println("You are teenager");
       else
           System.out.println("You are child");


          String name;
       do {
           System.out.print(" Entre your name: ");
            name = scanner.nextLine();
       } while(name.isBlank());

        System.out.println("You are " +name);
       */

        Scanner scanner = new Scanner(System.in);
        int rows;
        int columns;
        String symbol;

        System.out.println("Enter the number of rows: ");
        rows = scanner.nextInt();
        System.out.println("Entre the numbers of columns: ");
        columns = scanner.nextInt();
        System.out.println("Enter the symbol to use: ");
        symbol = scanner.next();

        for (int i = 1; i <= rows; i++) {
            System.out.println();
            for (int j = 1; j <= columns; j++) {
                System.out.print(symbol);
            }
        }

    }
}


