public class Teacher extends Person {
    private String subject;
    public Teacher(String name, int age, String address, String subject){
        super(name, age, address, subject);
        this.subject = subject;
    }
    public void teach(){

    }
}
