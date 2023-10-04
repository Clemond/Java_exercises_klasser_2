public class Student {

    String forname;
    String lastname;
    String nameOfSchool;
    int age;


    public String getInfo() {
        return "Student: " + forname + " " + lastname + ". " + "School: " 
                           + nameOfSchool + ". " + "Age: " +  age;
    }
    
}
