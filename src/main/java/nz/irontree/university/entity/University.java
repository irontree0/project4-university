package nz.irontree.university.entity;

public class University {

    private final String name;
    private Student student;
    private Professor professor;

    public University(String uniName) {
        this.name = uniName;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "University{" +
                "name='" + name + '\'' +
                ", student=" + student +
                ", professor=" + professor +
                '}';
    }
}
