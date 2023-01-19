package project;

import java.util.Scanner;

public class project1 {
    public static void main(String[] args) {
        //Using Scanner create an array of integer values. After the array is created, calculate the sum of all stored elements in that array.
        Scanner scanner=new Scanner(System.in);
        int[]integers=new int[7];
        int finalResult=0;
        for (int i = 1; i <integers.length ; i++) {
            integers[i]=scanner.nextInt();
            finalResult=finalResult+i;
            System.out.print(finalResult);//final result 21

        }
        scanner.close();
    }
}
