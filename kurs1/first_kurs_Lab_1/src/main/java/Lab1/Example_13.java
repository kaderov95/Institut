package Lab1;

//7. Напишите программу, в которой по возрасту определяется год рождения.

import java.util.Calendar;
import java.util.Scanner;

import static java.lang.System.out;

public class Example_13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        out.print("Введите год рождения: ");
        int years = in.nextInt();

        Calendar cal = Calendar.getInstance();
        int currentYears = cal.get(Calendar.YEAR);

        int age = currentYears - years;
        System.out.println("Ваш возраст: " + age);


    }
}
