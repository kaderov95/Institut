package Lab1;

//6. Напишите программу, в которой Пользователь вводит имя и год рождения, в программа отображает сообщение содержащее имя пользователя и его возраст.

import java.util.Calendar;
import java.util.Scanner;


public class Example_12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите ваше имя: ");
        String name = in.nextLine();

        System.out.print("Введите ваш год рождения: ");
        int years = in.nextInt();

        Calendar cal = Calendar.getInstance();
        int currentYears = cal.get(Calendar.YEAR);

        int age = currentYears - years;
        System.out.println(name + " " + age + " " + "лет");

    }
}
