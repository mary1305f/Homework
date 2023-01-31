package Homework3;

public class Task2 {
    int totalResult;
    String name;
    int math;
    int science;
    int sports;
    double average1;
    Task2 (String personsname,int Mathf,int Sciencef,int sportsf){
        name=personsname;
        math=Mathf;
        science=Sciencef;
        sports=sportsf;
        totalResult+=Mathf+Sciencef+sportsf;
        double average=totalResult/3.0;
        average1+=average;
    }
    void PrintResults(){
        System.out.println("the person name is: "+name+", Math Grade is:  "+math+", Science Grade is : "+science+",  Sports grade "+sports+", TOTAL AVERAGE IS : "+average1);
    }
}/*Write a java Class Students that have a constructor which takes students name and 3 subject grades. Inside your class also have a method to Calculate Average Grade.
 Test Student class for 5 different students with different marks. Your program should print an average mark of each students nam*/
