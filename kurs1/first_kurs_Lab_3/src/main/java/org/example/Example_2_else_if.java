//2. Напишите программу, в которой пользователю предлагается ввести название дня недели. По введенному названию программа
//определяет порядковый номер дня в неделе. Если пользователь вводит неправильное название дня, программа выводит
//сообщение о том, что такого дня нет. Предложите версию программы на основе вложенных условных операторов и на основе
//оператора выбора switch.

package org.example;

import java.util.Scanner;

public class Example_2_else_if {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите название дня недели: ");
        String day = scanner.nextLine();

        int dayNumber;

        if (day.equalsIgnoreCase("понедельник")) {
            dayNumber = 1;
        } else if (day.equalsIgnoreCase("вторник")) {
            dayNumber = 2;
        } else if (day.equalsIgnoreCase("среда")) {
            dayNumber = 3;
        } else if (day.equalsIgnoreCase("четверг")) {
            dayNumber = 4;
        } else if (day.equalsIgnoreCase("пятница")) {
            dayNumber = 5;
        } else if (day.equalsIgnoreCase("суббота")) {
            dayNumber = 6;
        } else if (day.equalsIgnoreCase("воскресенье")) {
            dayNumber = 7;
        } else {
            System.out.println("Такого дня нет");
            return;
        }

        System.out.println("Порядковый номер дня недели: " + dayNumber);
    }
}
