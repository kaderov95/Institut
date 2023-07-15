package Lab1;

//3. Напишите программу, в которой Пользователь последовательно вводит название текущего дня недели, название месяца и дату (номер дня в месяце).
//Программа выводит сообщение о сегодняшней дате (день недели, дата, месяц).

import java.io.PrintWriter;
import java.util.Scanner;


public class Example_8 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        System.out.print("Введите день недели: ");
        String day = in.nextLine();

        System.out.print("Введите название месяца: ");
        String nameMonth = in.nextLine();

        System.out.print("Введите число месяца: ");
        int dateMonth = in.nextInt();

        System.out.printf("%s, %s %s", day, dateMonth, nameMonth);
    }
}
