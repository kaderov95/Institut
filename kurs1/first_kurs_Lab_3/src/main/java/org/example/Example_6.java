//6. Напишите программу, в которой создается одномерный числовой массив и заполняется числами, которые при делении на 5
//дают в остатке 2 (числа 2, 7,12,17 и так далее). Размер массива вводится пользователем.
//Предусмотреть обработку ошибки, связанной с вводом некорректного значения.

package org.example;

import java.util.Scanner;

public class Example_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размер массива: ");
        int size = 0;

        try {
            size = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Некорректный ввод!");
            System.exit(0);
        }

        int[] array = new int[size];
        int count = 0;

        for (int i = 2; count < size; i += 5) {
            if (i % 5 == 2) {
                array[count] = i;
                count++;
            }
        }

        System.out.print("Массив: ");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
