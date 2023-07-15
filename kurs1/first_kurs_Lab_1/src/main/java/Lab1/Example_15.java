package Lab1;

/*
9. Напишите программу, в которой пользователь вводит число, а программой отображается последовательность из четырех чисел:
число, на единицу меньше введённого, введенное число и число, на единицу больше введенного.
Четвертое число должно быть квадратом суммы первых трех чисел.
*/

import java.util.Scanner;

public class Example_15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите одно число: ");
        int number = in.nextInt();

        int b = number - 1;
        int c = number + 1;
        int d = (number + b + c);
//        Math.pow(d, 2);

        System.out.print(b + " " + number + " " + c + " " + Math.pow(d, 2));

    }
}
