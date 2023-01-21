package project;

import java.util.Scanner;

public class Project7 {
    public static void main(String[] args) {
        //Write a java program to check whether a given number is prime or not?
        Scanner scanner=new Scanner(System.in);
        System.out.println("please enter a number to check if the number is prime or not");
        int number1= scanner.nextInt();
        if (number1%2!=0){
        System.out.println("Its prime!!");
    }else {
            System.out.println("its not prime sorry");


        }
        int num2 = 10;
        boolean prime = false;
        for (int i = 2; i <= num2 / 2; ++i) {
            // condition for nonprime number
            if (num2 % i == 0) {
                prime = true;
                break;
            }
        }
    }
}
