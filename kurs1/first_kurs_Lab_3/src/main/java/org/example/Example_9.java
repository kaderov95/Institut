//9. Напишите программу, в которой создается массив и заполняется случайными числами. Массив отображается в консольном окне.
//В этом массиве необходимо определить элемент с минимальным значением. В частности, программа должна вывести значение
//элемента с минимальным значением и индекс этого элемента. Если элементов с минимальным значением несколько,
//должны быть выведены индексы всех этих элементов.

package org.example;

import java.util.Arrays;

public class Example_9 {
    public static void main(String[] args) {
        int[] array = new int[10];

        for (int i = 0; i < 10; i++) {
            array[i] = (int) (Math.random() * 100); // случайное число от 0 до 99
        }

        System.out.println("Массив: " + Arrays.toString(array));

        int minValue = array[0];
        int[] minIndexes = new int[10];
        int count = 0;

        for (int i = 0; i < 10; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
                minIndexes[0] = i;
                count = 1;
            } else if (array[i] == minValue) {
                minIndexes[count] = i;
                count++;
            }
        }

        System.out.println("Минимальное значение: " + minValue);
        System.out.print("Индексы элементов с минимальным значением: ");
        for (int i = 0; i < count; i++) {
            System.out.print(minIndexes[i] + " ");
        }
    }
}
