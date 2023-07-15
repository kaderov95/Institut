package org.example;

//8. Напишите программу «Шифр Цезаря», которая зашифровывает введенный текст. Используете кодовую таблицу символов.
// При запуске программы в консоль необходимо вывести сообщение: «Введите текст для шифрования», после ввода текста, появляется сообщение: «Введите ключ».
//После того как введены все данные, необходимо вывести преобразованную строку с сообщением «Текст после преобразования : ».
// Далее необходимо задать вопрос пользователю: «Выполнить обратное преобразование? (y/n)», если пользователь вводит «y»,
// тогда выполнить обратное преобразование. Если пользователь вводит «n», того программа выводит сообщение «До свидания!».
// Если пользователь вводит что-то другое, отличное от «y» или «n», то программа ему выводит сообщение: «Введите корректный ответ».

import java.util.Scanner;

public class Example_8 {
    public static void main(String[] args) {
        System.out.print("Введите текст для шифрования: ");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        System.out.print("Введите ключ: ");
        int key = scanner.nextInt();
        char[] ArrayChar = string.toCharArray();
        long[] ArrayInt = new long[ArrayChar.length];
        char[] ArrayCharNew = new char[ArrayChar.length];
        for (int i = 0; i < ArrayChar.length; i++) {
            ArrayInt[i] = ArrayChar[i] + key;
            ArrayCharNew[i] = (char) ArrayInt[i];
        }
        string = new String(ArrayCharNew);
        System.out.print("Текст после преобразования: ");
        System.out.print(string);
        System.out.println();
        System.out.print("Выполнить обратное преобразование? (y/n): ");
        Scanner scn = new Scanner(System.in);
        String reverse = scn.nextLine();
        switch (reverse) {
            case "y" -> {
                char[] ArrayChar1 = string.toCharArray();
                long[] ArrayInt1 = new long[ArrayChar1.length];
                char[] ArrayCharNew1 = new char[ArrayChar1.length];
                for (int i = 0; i < ArrayChar1.length; i++) {
                    ArrayInt1[i] = ArrayChar1[i] - key;
                    ArrayCharNew1[i] = (char) ArrayInt1[i];
                }
                string = new String(ArrayCharNew1);
                System.out.println(string);
            }
            case "n" -> System.out.println("До свидания!");
            default -> System.out.println("Вы ввели некорректные данные!");
        }

    }
}
