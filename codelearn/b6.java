package codelearn;

public class b6 {
    public static void main(String[]args){
        v2 s1 = new v2("Long",24);
        v2 s2 = new v2("Kien",26);
        s1.show();
        s2.show();
    }
}
class v2{
    String name;
    int age;
    public v2(String name, int age){
        this.name = name;
        this.age = age;
    }
    public void show (){
        System.out.println("Name "+ name);
        System.out.println("Age "+ age);
    }
}
