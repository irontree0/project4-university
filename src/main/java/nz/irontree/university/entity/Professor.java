package nz.irontree.university.entity;

public class Professor implements TeacherActions, LessonActions {

    private final String name;
    private final String subject;
    private University uni;
    private Student student;

    public Professor(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    @Override
    public void teach() {
        System.out.printf("Я преподаю предмет %s%n", subject);
    }

    @Override
    public void beInClass() {
        System.out.printf("Я преподаю у %s в %s%n", student.getFullName(), uni.getName());
    }

    public void setUni(University uni) {
        this.uni = uni;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public String getName() {
        return name;
    }

    public String getSubject() {
        return subject;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "name='" + name + '\'' +
                ", subject='" + subject + '\'' +
                '}';
    }
}
