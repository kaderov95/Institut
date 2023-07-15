//5. Напишите программу, в которой вычисляется сумма чисел, удовлетворяющих таким критериям: при делении числа на 5 в
//остатке получа-ется 2, или при делении на 3 в остатке получается 1. Количество чисел в сумме вводится пользователем.
//Программа отображает числа, которые суммируются, и значение суммы. Предложите версии программы, использующие разные
//операторы цикла.

package org.example;

import java.util.Scanner;

public class Example_5_while {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество чисел: ");
        int n = scanner.nextInt();

        int sum = 0;
        int i = 1;

        while (i <= n) {
            if (i % 5 == 2 || i % 3 == 1) {
                System.out.print(i + " ");
                sum += i;
            }
            i++;
        }

        System.out.println("\nСумма: " + sum);
    }
}
