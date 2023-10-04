public class Main {
    public static void main(String[] args) {
        // Fortsättning på övning 2.
        // Sätt alla  instansvariablerna som privata.
        // Skapa en konstruktor som tar in alla parametrar. Skapa getters och setters för samtliga
        // instansvariabler.
        // I Main skapa ett objekt av Student och skriv ut all data via getters and setters.
        
        
        Student student1 = new Student("Josef", "Nyström", "Rytmus", 17);

        

        //------KÖR KOD--------//

        System.out.println(student1.getInfo());
    }
}
