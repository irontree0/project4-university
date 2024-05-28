package nz.irontree.university.entities;

public class Professor implements Teacher, Lesson {

    public University uni;

    @Override
    public void teach() {
        System.out.println("Я преподаю историю");
    }

    @Override
    public void beInClass() {
        teach();
        System.out.printf("Я работаю в %s%n", uni.name);
    }
}
