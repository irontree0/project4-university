package nz.irontree.university.entities;

public class University {

    public String name;
    public Student student;
    public Professor professor;

    public University(String uniName) {
        this.name = uniName;
    }
}
