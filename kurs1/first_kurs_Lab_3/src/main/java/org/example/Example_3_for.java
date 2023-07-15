//3. Напишите программу, которая выводит последовательность чисел Фибоначчи. Первые два числа в этой последовательности
//равны 1, а каждое следующее число равно сумме двух предыдущих
//(получается по-следовательность 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89 и так далее).
//Количество чисел в последовательности вводится пользователем. Предложите версии программы,
//использующие разные операторы цикла.

package org.example;

import java.util.Scanner;

public class Example_3_for {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество чисел Фибоначчи: ");
        int n = scanner.nextInt();

        int a = 1;
        int b = 1;

        System.out.print(a + " " + b + " ");

        for (int i = 3; i <= n; i++) {
            int c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }
}
