package project;

import java.util.Arrays;
import java.util.Enumeration;

public class Java10 {
    public static void main(String[] args) {
        //Write a java program to find the second-largest number in the array?
//unsorted array
        int [] array={1,2,3,6,5,4,111,55,10};
        Arrays.sort(array);
        for (int i = 0; i < args.length ; i++) {

            System.out.println(array[i]);
        }
        System.out.print("second largest: ");
        System.out.print(array[array.length-2]);
    }
}
