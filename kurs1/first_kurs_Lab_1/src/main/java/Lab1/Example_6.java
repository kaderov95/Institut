package Lab1;

//1. Напишите программу, в которой Пользователь вводит сначала фамилию, затем имя, затем отчество.
// После ввода программа выводит сообщение «Hello <фамилия, имя, отчество>».

import java.io.PrintWriter;
import java.util.Scanner;

public class Example_6 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        System.out.println("Введите фамилию: ");
        String surName = in.nextLine();

        System.out.println("Введите имя: ");
        String name = in.nextLine();

        System.out.println("Введите отчество: ");
        String lastName = in.nextLine();

        System.out.println("Hello " + surName + " " + " " + name + " " + lastName);

        out.flush();
    }
}
