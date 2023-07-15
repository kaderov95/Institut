//2. Напишите программу, в которой пользователю предлагается ввести название дня недели. По введенному названию программа
//определяет порядковый номер дня в неделе. Если пользователь вводит неправильное название дня, программа выводит
//сообщение о том, что такого дня нет. Предложите версию программы на основе вложенных условных операторов и на основе
//оператора выбора switch.

package org.example;

import java.util.Scanner;

public class Example_2_switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите название дня недели: ");
        String day = scanner.nextLine();

        int dayNumber;

        switch (day.toLowerCase()) {
            case "понедельник":
                dayNumber = 1;
                break;
            case "вторник":
                dayNumber = 2;
                break;
            case "среда":
                dayNumber = 3;
                break;
            case "четверг":
                dayNumber = 4;
                break;
            case "пятница":
                dayNumber = 5;
                break;
            case "суббота":
                dayNumber = 6;
                break;
            case "воскресенье":
                dayNumber = 7;
                break;
            default:
                System.out.println("Такого дня нет");
                return;
        }

        System.out.println("Порядковый номер дня недели: " + dayNumber);
    }
}
