//4. Напишите программу, в которой пользователем вводится два целых числа. Программа выводит все целые числа — начиная с
//наименьшего (из двух введенных чисел) и заканчивая наибольшим (из двух введенных чисел).
//Предложите разные версии программы (с использованием разных операторов цикла).

package org.example;

import java.util.Scanner;

public class Example_4_while {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int a = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int b = scanner.nextInt();

        int min = Math.min(a, b);
        int max = Math.max(a, b);

        int i = min;
        while (i <= max) {
            System.out.print(i + " ");
            i++;
        }
    }
}
