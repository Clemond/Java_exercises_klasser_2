public class Student {

    private String forname;
    private String lastname;
    private String nameOfSchool;
    private int age;

    //Konstruktor! //setter
    public Student(String forname, String lastname, String nameOfSchool, int age){
        this.forname = forname;
        this.lastname = lastname;
        this.nameOfSchool = nameOfSchool;
        this.age = age;
    }

    //getter
    public String getInfo() {
        return "Student: " + forname + " " + lastname + ". " + "School: " + nameOfSchool + ". " + "Age: " +  age;
    }
    
}
