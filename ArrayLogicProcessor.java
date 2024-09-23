package ArrayLogicProcessor;

import java.util.Scanner;

public class ArrayLogicProcessor {
    static Scanner myScanner = new Scanner(System.in);

    public static void main(String[] args) {

        // string
        String myName;
        print("Please enter your name: ");
        myName = myScanner.nextLine();

        println("This is my name: " + myName);
        println("The number of characters in my name: " + myName.length());

        // array
        // one dimentional array
        // 1 2 4 6 7 8 34 53 int[] nameOfArray = new int[8]

        // two dimentional array
        /*
         * 1 3 5 4
         * 4 2 7 2
         */
        int[][] twoDArray = new int[2][4];

        twoDArray[0][0] = 1;
        twoDArray[0][1] = 3;
        twoDArray[0][2] = 5;
        twoDArray[0][3] = 4;

        twoDArray[1][0] = 4;
        twoDArray[1][1] = 2;
        twoDArray[1][2] = 7;
        twoDArray[1][3] = 2;

        twoDArray[1][2] += (twoDArray[0][2] + twoDArray[0][3]);
        println("At 2dArray[1][2]: " + twoDArray[1][2]);

        // logic, control flow, switch
        if (myName.length() < 15 && myName.length() > 10) {
            println("Your name is perfect!");
        } else if (myName.length() < 3) {
            println("Your name is too short!");
        } else {

            switch (myName.length()) {
                case 4:
                    println("You have a 4 char name!");

                    break;
                case 5:
                    println("You have a 5 char name!");

                    break;
                case 6:
                    println("You have a lucky name!");

                    break;
                case 7:
                    println("Your name seems long!");

                    break;

                default:
                    println("Your name is okay!");
                    break;
            }

            // if (myName.length() == 5) {
            // println("You have a lucky name!");
            // } else {
            // println("Your name is okay!");
            // }
        }

        int a =3;
        int b=9;

        // a+=(b++);
        a+=(++b);   
        println("A: "+a+" B: "+b );

    }

    // methods

    // for same line output
    static void print(Object anyObject) {
        System.out.print(anyObject);
    }

    // for new line output
    static void println(Object anyObject) {
        System.out.println(anyObject);
    }
}
