public class Student extends Person{
    private Section[] sections = new Section[10];
    private int grade;
    public int sectionCount;

    //Constructor
    public Student(String name, int grade) {
        super(name);
        this.grade = grade;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int g) {
        this.grade = g;
    }

    public Section[] getSections() {
        return sections;
    }

    public void addSections(Section s) {
        this.sections[sectionCount] = s;
        sectionCount++;
    }

    public String toString(){
        return this.name +" is in "+ this.grade + " grade, and is enrolled in the following sections:  "+ listSections();
    }

    public String listSections() {
        String o = "";

        for(int i = 0; i<sectionCount; i++) {
            o += sections[i].getName() + ", ";
        }


        return o;
    }

}
