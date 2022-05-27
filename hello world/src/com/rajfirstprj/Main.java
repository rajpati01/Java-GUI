package com.rajfirstprj;

import javax.swing.*;
import java.awt.*;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        //STRING
        String message = "hello World" + "!!";
        Date now = new Date();
        System.out.println(now);
        System.out.println(message.endsWith("!!"));
        int x = 1;
        int y = 2;
        System.out.println(x + y);
        System.out.println(x);
        System.out.println("num2"); // we use double code only if we want that statement as a result
        Point point1 = new Point(1, 2);
        Point point2 = point1;
        System.out.println(point2);
        point1.x = 2;  //since reference type so the value allocate are dependent of each other
        // so if we change the value of one variable it will affect another.
        System.out.println(point2); // the result is 2
        String statement1 = new String("my name is Rajpati Bhandari.");
        System.out.println(statement1);
        statement1.endsWith("."); // string is class so, we can access it with dot operator
        System.out.println(statement1.indexOf("R"));
        System.out.println(statement1.startsWith("n")); // it will give boolean value
        System.out.println(statement1.replace("Rajpati", "Raju"));
        // here target and replacement are parameter and Rajpati and Raju are arguments
        // parameters- are the hols that we define our method
        // arguments- are the actual value that we pass to the method
        System.out.println(statement1.toLowerCase());
        System.out.println(statement1.toUpperCase());
        statement1.trim();
        System.out.println(statement1);
        // if we print the original string the result is not change because string in java are immutable

        // Escape Sequences
        String statement2 = "I am \"coding\""; // use ing backslash to put double quote
        System.out.println(statement2); //  instead of typing all this print statement use can just type sout and press tab
        String statement3 = "c:\\window\\";
        System.out.println(statement3);
        String text1 = "\twho \n are\t you?"; // \n means new line and \t is tab
        System.out.println(text1);

        //Arrays- are used to store a list of item like a list or number or list of people
        // arrays are reference type, so they need new operator
        int[] numbers = new int[5]; // we can code arrays in this way
        numbers[0] = 1; // now we can access the individual item in this array using an index
        numbers[3] = 2;
        //numbers[10] = 3;  here there are no 10 item in defined array, so it will show error in the program
        System.out.println(Arrays.toString(numbers));
        int[] number = {2, 4, 5, 1, 3}; // another way of coding arrays
        Arrays.sort(number);
        System.out.println(Arrays.toString(number));

        // multidimensional  Arrays
        // we can use this to store matrix 2D or 3D
        int[][] num = new int[2][3]; // to initialize 2D matrix we write 2 [] similarly for 3D 3 []
        num[0][0] = 1;
        num[1][1] = 2;
        System.out.println(Arrays.deepToString(num)); // to print matrix we use Arrays.toDeepString method instead of Arrays.toString

        // another way to code this
        //int [][] num = {{1, 3, 4}, {2, 6, 7}}; the result is same.

        // Constant- which value cannot be changed throughout the program
        final float PI = 3.14F; // to make a variable a constant we add final and name are in all capital because of convention
        // PI = 2 now we cannot change the value of PI in this program otherwise it will show error

        // Arithmetic Expression- same as math operators (+,-,*,/,%modulus)
        int result = 10 + 4;
        System.out.println(result);
        int a = 1; //OR       int a = 1;
        a++;       //         ++a      same result
        System.out.println(a);
        int a1 = 2;
        a1 = a1 + 2; // if we wish to increase more than once
        // OR  augmenter/ compound operator
        int b1 = 2;
        b1 += 4;  // same for other operator also
        System.out.println(b1);
        double c1 = (double) 10 / (double) 3; // if we need result in decimal we should indicate them like this step
        System.out.println(c1);

        // Order of operation- it is same rule as math brackets>divide>multi>add>sub
        // int d1 = 10 + 2 * 5; in this operation the result is 20. basic math
        int d1 = (10 + 2) * 5; // we need to include () if we want + operation to operate first. basic math
        System.out.println(d1);

        //Casting and type conversion- this happens whenever there is no loss of data
        // Implicit Casting
        // byte < short < int < long < float < double
        short q = 4;    // here we first initialize short then integer in this case short value is automatically
        int r = q + 2;  // casted to integer value as it has higher memory.
        System.out.println(r);
        double s = 1.1;
        double t = s + 4; // 4.0 (double is more precise than integer)
        System.out.println(t);

        // Explicit Casting - this only happens between compatible type (like between numbers)
        double a2 = 3.1;
        int a3 = (int) a2 + 2;// way of coding explicit casting
        System.out.println(a3);

        // String to a Number
        String hi = "1";  // for all primitive type we have wrapper class which is reference type called "Integer"
        int he = Integer.parseInt(hi) + 2; // and in this class we have a method called "parseInt" which take a string
        // and return an integer. similar for short, float, long, double.
        String my = "3.1";
        double you = Double.parseDouble(my) + 3;
        System.out.println(you);

        // Math class    1. round- floating number into whole number
        double B = Math.ceil(2.1F); // smaller integer grater than or equal to the number. in this case 3
        int C = Math.max(2, 3); // display greater number between two
        System.out.println(B);
        System.out.println(C);
        double res = Math.random(); // for generating random value between 0 and 1
        System.out.println(res);

        // Formatting numbers- in various cases we have to display user numbers in different format like money, percentage
        // to do so we hava "NumberFormat" class in java
        // NumberFormat current = new NumberFormat() - we cannot create an 'instance' of the number class because it is abstract
        NumberFormat currency = NumberFormat.getCurrencyInstance(); // this object ( currency) have a method for formatting a value
        String rupes = currency.format(1223444.534); // this method will return the value in string so we have to store it in string variable
        System.out.println(rupes);
        String value = NumberFormat.getPercentInstance().format(0.1); // method chaining because we are chaining multiple method in one step
        System.out.println(value);

        {
            // Reading Input-In java we have scanner class to read a input. so we first import it
            Scanner scanner = new Scanner(System.in); // inside the parenthesis we need specify where we are going to read
            System.out.print("name: ");              // data. from terminal window or file or other
            String name = scanner.nextLine();
            System.out.println("you are " + name);
        }
        Scanner year = new Scanner(System.in);
        System.out.print("Age: ");
        byte age = year.nextByte();
        System.out.println("your are " + age + " years old.");


        // CONTROL FLOW
        // A. Comparison Operators- to compare primitive value
        int x1 = 1;    // (x1 == x2) is an (boolean)expression - is a piece of code which provide a value
        int x2 = 1;
        System.out.println(x1 == x2);  //  == (equal to), !=  (not equal to), <=, >=

        // B. Logical Operation
        //1. &&(and) - both the condition should be true for the output to be true
        //2. ||(or) - if one of the condition is true then the output is true
        // 3. ! (not) - to reverse the result
        int temperature = 32;
        boolean isWarm = temperature > 20 && temperature < 30;
        System.out.println(isWarm);

        boolean hasHighIncome = true;
        boolean hasGoodCredit = true;
        boolean hasCriminalRecord = false;
        boolean isEligible = (hasHighIncome || hasGoodCredit) && !hasCriminalRecord;
        System.out.println(isEligible);

        // if statement - allow us to build program that can make decision based on certain condition
        int temp = 32;
        if (temp > 30) {
            System.out.println("It's a hot day." + "\nDrink water.");
        } else if (temp > 200 && temp <= 30)
            System.out.println("Beautiful day");
        else
            System.out.println("Cold day");

        int earning = 120_000;
        boolean hasHighEarning;        // boolean hasHighEarning = False;
        if (earning > 100_000)         // if (earning > 100_000)
            hasHighEarning = true;     // hasHighEarning = true;
        else
            hasHighEarning = false;     // we can get rid of else clause using this simplification

        // Another simplifying if statement
        // step1. int income = 120_00;
        // step2. boolean hasHighIncome = (income > 100_000);

        // The Ternary operator
        // ?(question mark) and :(colon) are the ternary operator
        // using this we can completely get rid of if statement
        int income = 120_000;
        String className = income > 10_000 ? "first class" : "Economic";

        // Switch statement- we use ths statement to execute different parts of code depending on the vale of expression.
        //String role = "admin";
        //if (role == "admin")
        //  System.out.println("You; re an admin");
        //else if (role == "moderator")
        //System.out.println("You're a moderator");
        //  else
        //  System.out.println("You're a gust");

        String role = "admin";
        switch (role) {
            case "admin":
                System.out.println("You're an admin");
                break;
            case "moderator":
                System.out.println("You're a moderator");
                break;
            default:
                System.out.println("You're a gust");
        }
        // we use "break" statement to jump out of this switch block
        // if we don't use them java will continue executing other lines
        // we need not "break" statement after "default" because we are at last of the program. it will automatically jump out of block.
        // we can use switch statement to integers other than long. our case will be case 1, case 2 eand so one.


        // ArrayList = A resizable array.
        //           = Element can be added or removed after compilation phase
        //           = store reference data types

        ArrayList<String> food = new ArrayList<>();

        food.add("Pizza");
        food.add("hamburger");
        food.add("hot-dog");

        for (int i = 0; i < food.size(); i++) {
            System.out.println(food.get(i));
        }

        // 2D ArrayList = it is a list of lists
        //               you can change the size of these lists during runtime

        ArrayList<ArrayList<String>> shopping = new ArrayList();

        ArrayList<String> furniture = new ArrayList();
        furniture.add("table");
        furniture.add("chair");
        furniture.add("bed");
        furniture.add("cupboard");

        ArrayList<String> utensils = new ArrayList();
        utensils.add("spoon");
        utensils.add("plate");
        utensils.add("bowl");
        utensils.add("fork");

        ArrayList<String> clothes = new ArrayList();
        clothes.add("pant");
        clothes.add("shirt");
        clothes.add("hoodie");

        shopping.add(furniture);
        shopping.add(utensils);
        shopping.add(clothes);

        System.out.println(shopping);

        // for-each loop = traversing technique to iterate through the element in any array/ collection
        //                 less step more reliable
        //                 less flexible

        // String[] animals = {"cat", "rat", "dog", "cow"};
        ArrayList<String> animals = new ArrayList();

        animals.add("car");
        animals.add("rat");
        animals.add("dog");
        animals.add("cow");

        for (String i : animals) {
            System.out.println(i);
        }

        // printf() method - an optional method to control, format, and display text to the console window.
        //                 - two arguments = format string + value/object/variable
        //                 - % [flags] [precision] [width] [conversion-character]

        System.out.printf("The room number is: %d", 123);    //or System.out.println("%d The room number is: ",123);

        boolean myBoolean = true;
        int myInt = 234;
        char myChar = '&';
        double myDouble = 1.234;
        String myString = "Rajpati";

        // [conversion-character]
        System.out.printf("%b", myBoolean);
        System.out.println();
        System.out.printf("%d", myInt);
        System.out.println();
        System.out.printf("%c", myChar);
        System.out.println();
        System.out.printf("%f", myDouble);
        System.out.println();
        System.out.printf("%s", myString, "%s");

        // [width]
        // minimum number of character to be written as output
        System.out.printf("Hello %10s", myString);

        // [precision]
        // set number of digits of precision when  outputting floating-point values
        System.out.printf("You have this much of money: %.2f", myDouble);

        // [flags]
        // adds an effect to output based on the flag added to format specifier
          /* - = left-justify     for right-justify just value works. eg. line 64
             + = output a plus (+) of minus (-) sign for a numeric value
             0 = numeric value are zero-padded
             , = comma grouping separator of number is > 1000
           */
        System.out.printf("You have this much of money: %-f", myDouble);


        // method - a block code that is executed whenever it is called upon
        String name = "Raj";
        int ages = 18;

        hello(name, ages);// arguments- are the actual value that we pass to the method

        // written type (void)- it will return the value back to the area which we called method
        // void - we write this if we aare not returning any value

        int X = 3;
        int Y = 4;

        System.out.println(add(X, Y));

        // Overloaded method- method that share the same name but have different parameters'
        //                    method name + parameters = method signature
        int A = sum(2, 5);
        System.out.println(A);

    }

    // for program to run we must have matching set of arguments and parameters
    static void hello(String name, int age) {  // parameters - are the hole that we define our method
        System.out.println("hello " + name);
        System.out.println("you are " + age + "years old");
    }

    public static int add(int x, int y) {    // we need to call the data type which we are returning the value. in this we are returning an integer
        int z = x + y;
        return z;      // return x+y;
    }

    public static int sum(int a, int b) {
        System.out.println("This is overloaded method #1");
        return a + b;
    }

    public static int sum(int a, int b, int c) {
        System.out.println("This is overloaded method #2");
        return a + b + c;
    }

    public static int sum(int a, int b, int c, int d) {
        System.out.println("This is overloaded method #3");
        return a + b + c + d;
    }
}


