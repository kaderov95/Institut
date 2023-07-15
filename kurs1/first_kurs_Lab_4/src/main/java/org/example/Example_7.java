package org.example;

//7. Напишите программу, в которой создается двумерный числовой массив и этот массив заполняется «змейкой»:
// сначала первая строка (слева направо), затем последний столбец (снизу вверх), вторая строка (слева направо) и так далее.

import java.util.Random;

public class Example_7 {
    public static void main(String[] args) {
        int[][] massiv = new int[6][6];
        Random random = new Random();
        int i;
        int j;
        for (i = 0; i < 1; i++) {
            for (j = 0; j < massiv[i].length; j++) {
                massiv[i][j] = random.nextInt(9);
            }
        }
        for (i = 5; i > 0; i--) {
            for (j = 5; j < massiv[i].length; j++) {
                massiv[i][j] = random.nextInt(9);
            }
        }
        for (i = 1; i < 2; i++) {
            for (j = 0; j < 5; j++) {
                massiv[i][j] = random.nextInt(9);
            }
        }
        for (i = 5; i > 1; i--) {
            for (j = 4; j < 5; j++) {
                massiv[i][j] = random.nextInt(9);
            }
        }
        for (i = 2; i < 3; i++) {
            for (j = 0; j < 4; j++) {
                massiv[i][j] = random.nextInt(9);
            }
        }
        for (i = 5; i > 2; i--) {
            for (j = 3; j < 4; j++) {
                massiv[i][j] = random.nextInt(9);
            }
        }
        for (i = 3; i < 4; i++) {
            for (j = 0; j < 3; j++) {
                massiv[i][j] = random.nextInt(9);
            }
        }
        for (i = 5; i > 3; i--) {
            for (j = 2; j < 3; j++) {
                massiv[i][j] = random.nextInt(9);
            }
        }
        for (i = 4; i < 5; i++) {
            for (j = 0; j < 2; j++) {
                massiv[i][j] = random.nextInt(9);
            }
        }
        for (i = 5; i > 4; i--) {
            for (j = 1; j < 2; j++) {
                massiv[i][j] = random.nextInt(9);
            }
        }
        for (i = 5; i <= 5; i++) {
            for (j = 0; j < 1; j++) {
                massiv[i][j] = random.nextInt(9);
            }
        }
        for (i=0;i< massiv.length;i++){
            for (j=0;j<massiv[i].length;j++){
                System.out.print(massiv[i][j]);
            }
            System.out.println();
        }
    }
}
