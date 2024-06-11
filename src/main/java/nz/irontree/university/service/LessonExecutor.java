package nz.irontree.university.service;

import nz.irontree.university.entity.LessonActions;
import nz.irontree.university.entity.TeacherActions;
import nz.irontree.university.entity.Trainable;

public class LessonExecutor {

    public void teach(TeacherActions teacher) {
        teacher.teach();
    }

    public void execute(LessonActions lesson) {
        lesson.beInClass();
    }

    public void study(Trainable trainable) {
        trainable.study();
    }
}
