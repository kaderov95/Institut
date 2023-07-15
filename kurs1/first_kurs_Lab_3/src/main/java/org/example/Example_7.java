//7. Напишите программу, в которой создается одномерный символьный массив из 10 элементов. Массив заполняется буквами
//«через одну», начиная с буквы ' а ': то есть массив заполняется буквами 'а', 'с', ' е', 'д' и так далее.
//Отобразите массив в консольном окне в прямом и обратном порядке. Размер массива задается переменной.

package org.example;

public class Example_7 {
    public static void main(String[] args) {
        int size = 15;
        char[] array = new char[size];

        char c = 'а';
        for (int i = 0; i < size; i++) {
            array[i] = c;
            c += 2;
        }

        System.out.print("Массив в прямом порядке: ");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.print("\nМассив в обратном порядке: ");
        for (int i = size - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }
}
