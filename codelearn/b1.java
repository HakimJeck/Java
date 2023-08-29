package codelearn;

public class b1 {
    String name;
    int age;
    public void display(){
        System.out.println("Name: "+ name);
        System.out.println("Age: "+ age);
    }
}
class Entry{
    public static void main(String[] args) {
        b1 student1 = new b1();
        student1.name = "Linh";
        student1.age = 24;
        student1.display();
    }
}
