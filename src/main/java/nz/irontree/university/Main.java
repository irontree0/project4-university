package nz.irontree.university;

import nz.irontree.university.entity.*;
import nz.irontree.university.service.LessonExecutor;

public class Main {
    public static void main(String[] args) {
        University uni1 = new University("Boston Uni");
        Professor professor1 = new Professor("Peter White", "История");
        Student student1 = new Student("William", "Black", 3);
        professor1.setUni(uni1);
        professor1.setStudent(student1);
        student1.setUniversity(uni1);
        student1.setProfessor(professor1);
        uni1.setProfessor(professor1);
        uni1.setStudent(student1);

        LessonExecutor service = new LessonExecutor();
        System.out.println(student1);
        service.study(student1);
        service.execute(student1);
        System.out.println(professor1);
        service.teach(professor1);
        service.execute(professor1);
        System.out.println(uni1);
    }
}