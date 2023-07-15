package org.example;

//6. Напишите программу, в которой создается и инициализируется двумерный числовой массив.
// Затем из этого массива удаляется строка и столбец (создается новый массив, в котором по сравнению с исходным удалена одна строка и один столбец).
// Индекс удаляемой строки и индекс удаляемого столбца определяется с помощью генератора случайных чисел.

import java.util.Random;

public class Example_6 {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] massiv = new int[5][5];
        int i;
        int j;
        int k;
        int s;
        k = random.nextInt(5);
        s = random.nextInt(5);
        System.out.println("Массив размером 5 на 5 заполняется случайными числами:");
        System.out.println();
        for (i = 0; i < massiv.length; i++) {
            for (j = 0; j < massiv[i].length; j++) {
                massiv[i][j] = random.nextInt(9);
                System.out.print(massiv[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Генератор случайных чисел выбирает " + k + "-ю строку " + s + " столбец");
        System.out.println("Новый массив без выбранных строк и столбцов выглядит так:");
        System.out.println();
        int[][] massiv2 = new int[4][5];
        for (i = 0; i < massiv2.length; i++) {
            for (j = 0; j < massiv2[i].length; j++) {
                if (k == i) {
                    massiv2[i][j] = massiv[i + 1][j];
                } else if (k > i) {
                    massiv2[i][j] = massiv[i][j];
                } else {
                    massiv2[i][j] = massiv[i + 1][j];
                }

            }
        }
        int[][] massiv3 = new int[4][4];
        for (i = 0; i < massiv3.length; i++) {
            for (j = 0; j < massiv3[i].length; j++) {
                if (s == j) {
                    massiv3[i][j] = massiv2[i][j + 1];
                } else if (s > j) {
                    massiv3[i][j] = massiv2[i][j];
                } else {
                    massiv3[i][j] = massiv2[i][j + 1];
                }
            }
        }
        for (i = 0; i < massiv3.length; i++) {
            for (j = 0; j < massiv3[i].length; j++) {
                System.out.print(massiv3[i][j]);
            }
            System.out.println();
        }
    }
}

