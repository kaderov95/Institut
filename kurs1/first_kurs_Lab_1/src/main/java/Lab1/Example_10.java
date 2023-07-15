package Lab1;

//4. Напишите программу, в которой пользователю предлагается ввести название месяца и количество дней в этом месяце.
//Программа выводит сообщение о том, что соответствующий месяц содержит указанное количество дней.

import java.util.Scanner;

public class Example_10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите название месяца: ");
        String nameMonth = in.nextLine();
        System.out.print("Введите количество дней в месяце: ");
        int countDay = in.nextInt();
        System.out.printf(" %s - %s", nameMonth, countDay);
        in.close();
    }
}
