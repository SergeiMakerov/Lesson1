package Lesson1;

public class Task1 {
    String str = "Добро пожаловать на курс по Java";
    public static void revers(String str){
        String[] array = str.split(" ");
        for (int i = array.length-1; i > -1; i--) {
            System.out.print(array[i] + " ");
        }
    }
}

