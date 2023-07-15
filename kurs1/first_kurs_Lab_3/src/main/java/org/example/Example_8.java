//8. Напишите программу, в которой создается символьный массив из 10 элементов.
//Массив заполнить большими (прописными) буквами английского алфавита. Буквы берутся подряд, но только согласные
//(то есть гласные буквы ’ А',1Е' и ' I' при присваивании значений элементам массива нужно пропустить).
//Отобразите содержимое созданного массива в консольном окне.

package org.example;

public class Example_8 {
    public static void main(String[] args) {
        char[] array = new char[10];
        char c = 'A';

        for (int i = 0; i < 10; i++) {
            switch (c) {
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                    break;
                default:
                    array[i] = c;
                    break;
            }

            c++;
        }

        System.out.print("Массив: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
