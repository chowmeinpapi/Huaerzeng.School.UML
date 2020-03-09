public class Runner {
    public static void main(String[] args){
        //School
        School bhs = new School("Berkeley High School");

        //Section
        Section math = new Section("Math");
        Section biology = new Section("Biology");
        Section compSci = new Section("Computer Science");
        Section english = new Section("English");
        Section mandarin = new Section("Mandarin");
        Section history = new Section("History");

        bhs.addSections(math);
        bhs.addSections(biology);
        bhs.addSections(compSci);
        bhs.addSections(english);
        bhs.addSections(mandarin);
        bhs.addSections(history);

        System.out.println(bhs.toString());

        //Teacher
        Teacher alby = new Teacher("Albinson", "Computer Science");
        alby.addSections(compSci);
        compSci.setTeacher(alby);
        alby.addSections(math);
        math.setTeacher(alby);
        System.out.println(alby.toString());

        Teacher mueller = new Teacher("Mueller", "Biology");
        mueller.addSections(biology);
        biology.setTeacher(mueller);
        System.out.println(mueller.toString());

        Teacher goodrich = new Teacher("Goodrich", "Math");
        goodrich.addSections(math);
        math.setTeacher(goodrich);
        System.out.println(goodrich.toString());

        Teacher chen = new Teacher("Chen", "Mandarin");
        chen.addSections(mandarin);
        mandarin.setTeacher(chen);
        System.out.println(chen.toString());

        Teacher vegt = new Teacher("Vegt", "History");
        vegt.setSections(history);
        history.setTeacher(vegt);
        System.out.println(vegt.toString());

        //Students
        Student me = new Student("Huaerzeng", 11);
        me.addSections(math);
        math.addStudents(me);

        me.addSections(biology);
        biology.addStudents(me);

        me.addSections(compSci);
        compSci.addStudents(me);

        me.addSections(mandarin);
        mandarin.addStudents(me);

        me.addSections(history);
        history.addStudents(me);

        System.out.println(me.toString());

        //Andrew
        Student Andrew = new Student("Andrew", 11);
        Andrew.addSections(math);
        math.addStudents(Andrew);

        Andrew.addSections(biology);
        biology.addStudents(Andrew);

        Andrew.addSections(compSci);
        compSci.addStudents(Andrew);

        System.out.println(Andrew.toString());

        //Noam
        Student Noam = new Student("Noam", 11);
        Noam.addSections(math);
        math.addStudents(Noam);

        Noam.addSections(biology);
        biology.addStudents(Noam);

        Noam.addSections(compSci);
        compSci.addStudents(Noam);

        System.out.println(Noam.toString());

        //Logan
        Student Logan = new Student("Logan", 11);
        Logan.addSections(math);
        math.addStudents(Logan);

        Logan.addSections(biology);
        biology.addStudents(Logan);

        Logan.addSections(compSci);
        compSci.addStudents(Logan);

        System.out.println(Logan.toString());

        //Luke
        Student Luke = new Student("Luke", 11);
        Luke.addSections(math);
        math.addStudents(Luke);

        Luke.addSections(biology);
        biology.addStudents(Luke);

        Luke.addSections(compSci);
        compSci.addStudents(Luke);

        System.out.println(Luke.toString());

        //Dashiell
        Student Dashiell = new Student("Dashiell", 11);
        Dashiell.addSections(math);
        math.addStudents(Dashiell);

        Dashiell.addSections(biology);
        biology.addStudents(Dashiell);

        Dashiell.addSections(compSci);
        compSci.addStudents(Dashiell);

        System.out.println(Dashiell.toString());


        System.out.println(compSci.toString());
        System.out.println(biology.toString());
        System.out.println(math.toString());
        System.out.println(mandarin.toString());
        System.out.println(history.toString());
    }
}