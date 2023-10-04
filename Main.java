public class Main {
    public static void main(String[] args) {
        // Skapa en klass Student
        // Den ska ha ett förnamn, efternamn, namn på skolan som studenten
        // studerar på samt ålder på studenten,
        // I Main skapa ett objekt av Student och tilldela instansvariablerna ett värde. 
        // Skriv sedan ut värdet på instansvariablerna.

        Student student1 = new Student();

        student1.forname = "Jacob";
        student1.lastname = "Nyström";
        student1.nameOfSchool = "Rytmus";
        student1.age = 17;

        Student student2 = new Student();

        student2.forname = "Linnea";
        student2.lastname = "Olsson";
        student2.nameOfSchool = "Vidala Grundskola";
        student2.age = 13;


        //------KÖR KOD--------//

        System.out.println(student2.getInfo());


    }
}
