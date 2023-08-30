package codelearn;

public class b9 {
    private String name;
    private int age;
    private String gender;
    private double GPA;
    public b9 (String name, int age, String gender, double GPA){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.GPA = GPA;
    }
    public void display(){
        System.out.println("Name "+ name);
        System.out.println("Age "+ age);
        System.out.println("Gender "+gender);
        System.out.println("GPA"+ GPA);
    }
}
