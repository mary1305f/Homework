package Homework3;

public class Task1Test {
    public static void main(String[] args) {
        task1 task1=new task1();
        System.out.println(task1.name);
        System.out.println(task1.age);
        System.out.println(task1.BornAt);

task1 task2=new task1("rafa","peru",29);
task2.printInfo();

    }

}
