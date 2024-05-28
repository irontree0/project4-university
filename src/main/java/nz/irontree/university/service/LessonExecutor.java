package nz.irontree.university.service;

import nz.irontree.university.entities.Lesson;

public class LessonExecutor {
    public void execute(Lesson lesson) {

        lesson.beInClass();
    }
}
