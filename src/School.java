public class School {
    private String name;
    private Section[] sections = new Section[200];
    private int sectionCount;

    public School(String name) {
        this.name = name;
        this.sectionCount = sectionCount;
    }

    //Methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addSections(Section s) {
        sections[sectionCount] = s;
        sectionCount++;
    }

    public String toString(){
        return "The school named "+ this.name +" has "+ this.sectionCount +" sections.";
    }
}
