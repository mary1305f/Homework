package Homework3;

import javax.xml.namespace.QName;

public class task1 {
    String name;
    String BornAt;

    int age;

    task1(){
name="Mary";
BornAt="venezuela";
age=19;

    }
task1 (String nameofperson,String whereBornAt,int ageperson){
      name=nameofperson;
      BornAt=whereBornAt;
      age=ageperson;

}
void printInfo(){
    System.out.println(name+" "+BornAt+" "+age);
    }
}/* Write a java class that will have a constructor: one with parameters
and second without any parameters. Create a separate Test class where you will execute both of the constructors 1 by 1.*/
