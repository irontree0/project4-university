package nz.irontree.university;

import nz.irontree.university.entities.*;
import nz.irontree.university.service.LessonExecutor;

public class Main {
    public static void main(String[] args) {

        University uni1 = new University("Boston Uni");
        Professor professor1 = new Professor();
        Student student1 = new Student();
        LessonExecutor service = new LessonExecutor();

        professor1.uni = uni1;
        student1.uni = uni1;
        uni1.professor = professor1;
        uni1.student = student1;

        service.execute(professor1);
        service.execute(student1);
    }
}