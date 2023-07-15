package org.example;

//3. Напишите программу, в которой создается двумерный массив, который выводи прямоугольник из цифр 2;

public class Example_3 {
    public static void main(String[] args) {
        int[][] array = new int[3][10];
        int i;
        int j;
        for (i = 0; i < array.length; i++) {
            for (j = 0; j<array[i].length; j++) {
                array[i][j] = 2;
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }
}
