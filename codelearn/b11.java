package codelearn;

public  class b111{
    public static void main(String[]args){
        b11[] c1 = new b11[3];
        for (int i = 0;i <3;i++){
            c1[i] = new b11();
        }
        c1[0].name = "Tuan";
        c1[0].age = 24;
        c1[1].name = "Cuong";
        c1[1].age = 21;
        c1[2].name = "Duc";
        c1[2].age = 20;
        for (int i=0; i < 3; i++){
            c1[0].display();
            c1[1].display();
            c1[2].display();
        }
    }
}
class b11 {
    String name;
    int age;
    public b11(){

    }
    public void display() {
        System.out.println("Name " + name);
        System.out.println("Age" + age);
    }
}

