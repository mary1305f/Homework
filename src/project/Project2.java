package project;

import java.util.Scanner;
import java.lang.String;

public class Project2 {

    public static void main(String[] args) {
        int k=0;
        int g=0;
        Scanner scanner=new Scanner(System.in);
        //Using Scanner create an array of countries.
        // When an array is created, retrieve all values from it and while retrieving
        // those values print capital for each country. (use 2 different loops).
        String[]country=new String[3];
        String[]capital=new String[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("country");
            country[i]=scanner.next();

            System.out.println("capital");
            capital[i]=scanner.next();
            System.out.print("the country "+country[i]+" is the capital of "+capital[i]+"\n ");

        }
        System.out.println("``````````````````````````````````");


    }

}
