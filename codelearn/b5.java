package codelearn;

public class b5 {
    public static void main(String[]args){
        v1 s = new v1();
        s.display();
    }
}
class v1 {
    private String name;
    private int age;
    public v1(){
        name = "Tuan";
        age = 24;
    }
    public void display (){
        System.out.println("Name "+ name);
        System.out.println("Age "+ age);
    }
}
