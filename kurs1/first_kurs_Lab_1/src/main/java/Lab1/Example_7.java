package Lab1;

//2. Напишите программу, в которой Пользователь вводит имя и возраст. Программа отображает сообщение об имени и возрасте пользователя.

import java.io.PrintWriter;
import java.util.Scanner;

public class Example_7 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new  PrintWriter(System.out);

        System.out.println("Введите имя: ");
        String name = in.nextLine();

        System.out.println("Введите возраст: ");
        int weight = in.nextInt();

        System.out.println("Общая информация: " + name + " " + weight);
    }


}
