package org.example;

//5. Напишите программу, в которой создается двумерный целочисленный массив. Он заполняется случайными числами.
// Затем в этом массиве строи и столбцы меняются местами: первая строка становится первым столбцом, вторая строка становиться вторым столбцом и так далее.
// Например, если исходный массив состоял из 3 строк и 5 столбцов, то в итоге получаем массив из 5 строк и 3 столбцов.

import java.util.Random;

public class Example_5 {
    public static void main(String[] args) {
        int[][] array = new int[4][8];
        int i;
        int j;
        Random random = new Random();
        for (i=0;i< array.length;i++){
            for (j=0;j<array[i].length;j++){
                array[i][j]=random.nextInt(9);
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
        int [][] numbers=new int[8][4];
        for (i=0;i< numbers.length;i++){
            for (j=0;j<numbers[i].length;j++){
                numbers[i][j]= array[j][i];
                System.out.print(numbers[i][j]);
            }
            System.out.println();
        }
    }
}
