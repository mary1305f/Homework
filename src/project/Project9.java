package project;

public class Project9 {
    public static void main(String[] args) {
        //)Maximum and minimum number in the array?
        int array[]={6,3,9,7,1};
        int max=array[0];
        int min =array[0];

        int i;
        for (int j = 1; j <5 ; j++) {
            if (max<array[j])//Determine maximum
                max=array[j];
            if (min>array[j])//Determine minimum
                min=array[j];
        }
        System.out.println("The maximum value is : "+max);
        System.out.println("the minimum value is : "+min);
        return ;
    }
}
