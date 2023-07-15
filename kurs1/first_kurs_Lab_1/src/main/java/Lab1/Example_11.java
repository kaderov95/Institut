package Lab1;

//5. Напишите программу, в которой по году рождения определяется возраст

import java.util.Calendar;
import java.util.Scanner;

import static java.lang.System.out;

public class Example_11 {
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
