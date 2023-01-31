package Homework2;

public class Homework2 {

    int num(int num1, int num2) {
        if (num1>num2){
            return num1;
        }else {
            return num2;
        }

    }
String num2(int num3){
        if (num3%2==0){
           return "is even";
        }else {
            return "is odd";
        }
}


    public static void main(String[] args) {
        //1) Create a method that will take 2 parameters as a numbers and prints which number is larger.

       Homework2 homework=new Homework2();
        System.out.println(homework.num(4,6));
        System.out.println("****************");

//2) Create a method that will take a number and prints whether the number is even or odd.
        Homework2 homework2=new Homework2();
        System.out.println(homework2.num2(8));
        System.out.println("**************");



    }
}
