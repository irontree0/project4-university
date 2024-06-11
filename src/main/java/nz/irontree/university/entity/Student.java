package nz.irontree.university.entity;

public class Student implements Trainable, LessonActions {

    private final String name;
    private final String surname;
    private final int course;
    private Professor professor;
    private University university;

    public Student(String name, String surname, int course) {
        this.name = name;
        this.surname = surname;
        this.course = course;
    }

    @Override
    public void beInClass() {
        System.out.printf("Я учу предмет %s у %s в %s%n", professor.getSubject(), professor.getName(),
                university.getName());
    }

    @Override
    public void study() {
        System.out.printf("Я студент %d курса исторического факультета%n", course);
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public void setUniversity(University university) {
        this.university = university;
    }

    public String getFullName() {
        return this.name + " " + this.surname;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", course=" + course +
                '}';
    }
}
