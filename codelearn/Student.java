package codelearn;

import java.util.Scanner;

public class Student {
    String name;
    int age;
    public void getInformation(){
        Scanner sc = new Scanner(System.in);
        name = sc.next();
        age = sc.nextInt();
    }
    public void display(){
        System.out.println("Name: "+ name);
        System.out.println("Age: "+ age);
    }
}
class Entry1 {
    public static void main(String[]args){
        Student s1 = new Student();
        s1.name = "Khanh";
        s1.age = 23;
        s1.display();
        s1.getInformation();

    }
}
