//10. Напишите программу, в которой создается целочисленный массив, заполняется случайными числами и после этого значения
//элементов в массиве сортируются в порядке убывания значений.

package org.example;

import java.util.Arrays;
import java.util.Collections;

public class Example_10 {
    public static void main(String[] args) {
        Integer[] array = new Integer[10];

        for (int i = 0; i < 10; i++) {
            array[i] = (int) (Math.random() * 100); // случайное число от 0 до 99
        }

        System.out.println("Исходный массив: " + Arrays.toString(array));

        Arrays.sort(array, Collections.reverseOrder());

        System.out.println("Отсортированный массив: " + Arrays.toString(array));
    }
}
