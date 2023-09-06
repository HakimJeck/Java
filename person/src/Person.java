import java.util.Scanner;

public class Person {
    private String name;
    private int age;
    private String address;
    static String school = "fpt-aptech";
    //gan gia tri
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public void setSchool(String school){
        this.school = school;
    }
    //tra gia tri
    public String getName(){
        return name;
    }
    public String getAddress(){
        return address;
    }
    public String getSchool(){
        return school;
    }
    public int getAge(){
        return age;
    }
    //Constructors
    public Person(){System.out.println("Constructor default");}
    public Person(String name, int age, String address){
        this.name = name;
        this.age = age;
        this.address = address;
    }
    //Biz methods
    public void studyJava(String subject){
        System.out.println(name + "study" + subject);
    }
    //Scanner: Cho phep nhap du lieu
    public void inputData(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input  name");;
        //String: nextline()
        name = scanner.nextLine();
        System.out.println("Input age");
        age = Integer.valueOf(scanner.nextLine());
        System.out.println("Input Address");
        address = scanner.nextLine();
}
//output
public void outputData(){
        System.out.println("Name: "+ name);
        System.out.println("Age: "+ age);
        System.out.println("Address: "+ address);
        this.toString();
}
}
