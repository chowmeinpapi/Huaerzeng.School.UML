public class Teacher extends Person{
    private Section[] sections = new Section[10];
    private String subject;
    public int sectionCount;

    //Constructor
    public Teacher(String name, String subject) {
        super(name);
        this.subject = subject;
    }

    //Methods
    public String getSubject() {
        return subject;
    }

    public void setSubject(String n) {
        this.subject = subject;
    }
    public Section[] getSections() {
        return sections;
    }

    public void setSections(Section s) {
        this.sections = sections;
    }

    public void addSections(Section s) {
        sections[sectionCount] = s;
        sectionCount++;
    }

    public String toString(){
        return "The teacher named " + this.name + " teaches the following sections: " + listSections();
    }

    public String listSections() {
        String o = "";

        for(int i = 0; i<sectionCount; i++) {
            o += sections[i].getName() + ", ";
        }


        return o;
    }

}
