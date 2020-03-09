public class Section {
    private Teacher teacher;
    private Student[] students = new Student[50];
    private String name;
    private int currentSize = 0;

    //Constructor
    public Section(String name) {
        this.name = name;
    }
    //Methods

    //Teachers
    public Teacher getTeacher(){
        return teacher;
    }
    public void setTeacher(Teacher t){
        this.teacher = t;
    }

    //Students
    public Student[] getStudents() {
        return students;
    }

    public void addStudents(Student s) {
        students[currentSize] = s;
        currentSize++;
    }

    //Name
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String toString(){
        return this.name + " is taught by " + this.teacher.getName() + " and has " + this.currentSize + " students: " + listStudents();
    }

    public String listStudents() {
        String o = "";

        for(int i = 0; i<currentSize; i++) {
            o += students[i].getName() + ", ";
        }


        return o;
    }


}
