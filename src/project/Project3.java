package project;

public class Project3 {
    public static void main(String[] args) {
        // Create a 2D array of integer values. Print the sum of all numbers.
        int [][]numbers={{1,2,3,},
                         {4,5,6}
        };
        for (int i = 0; i < numbers.length ; i++) {
            for (int j = 0; j <numbers[i].length ; j++) {
                System.out.print(numbers[i][j]+", ");

            }

        }
    }
}
