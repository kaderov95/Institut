package Lab1;

//10. Напишите программу, в которой Пользователь вводит два числа, а программой вычисляется и отображается сумма и разность этих чисел.

import java.util.Scanner;

public class Example_16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int a = in.nextInt();

        System.out.print("Введите второе число: ");
        int b = in.nextInt();

        int c = a+b;
        int d = a-b;
        System.out.printf("Сумма: %s, Разность: %s", c, d);
    }
}
