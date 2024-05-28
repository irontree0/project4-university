package nz.irontree.university.entities;

public class Student implements Trainable, Lesson {

    public University uni;

    @Override
    public void study() {
        System.out.println("Я студент исторического факультета");
    }

    @Override
    public void beInClass() {
        study();
        System.out.printf(String.format("Я учусь в %s%n", uni.name));
    }
}
