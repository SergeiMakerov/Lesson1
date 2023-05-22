import Lesson1.Task1;
import Lesson1.Task2;
import model.Human;

public class Main {
    //reverse("Добро пожаловать на курс по Java");

    public static void main(String[] args) {
        Human human = new Human("Alex");
        System.out.println(human.getName());
        human.setName("Mary");
        System.out.println(human.getName());

        reverse();

        Task1 task = new Task1();
        task.revers("Hello my Java");

        Task2 hello = new Task2();
        hello.hello();

    }

    public static void reverse() {
        String in = "Добро пожаловать на курс по Java";
        String[] split = in.split("\\s");
        StringBuilder builder = new StringBuilder();
        for (int i = split.length - 1; i > -1; i--) {
            builder.append(split[i]).append(" ");
        }
        System.out.println(builder);
    }
}
