public class Application {
    public static void main(String[]args){
        //Person p1 = new Person();
        //p1.inputData();
        //p1.outputData();
        Student student = new Student("Hai", 19, "Thai Binh", "IT");
        student.study();
        Teacher teacher = new Teacher("Ngoc", "Quang nam", "Software");
    }
}
