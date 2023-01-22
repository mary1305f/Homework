package project;

public class Project10 {
    public static void main(String[] args) {
        //Write a program to print out duplicate elements from an Array of Strings?

        String names[]={"nata","mary","josefina","nata","keyla","mary"};
        for (int k = 0; k < names.length ; k++) {

            for (int l =k+1 ; l < names.length ; l++) {
                if (names[k].equals(names[l])){
                    System.out.println(names[k]);
                }

            }

        }
    }
}
