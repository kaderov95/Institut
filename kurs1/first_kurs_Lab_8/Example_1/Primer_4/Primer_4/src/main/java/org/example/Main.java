package org.example;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        try {
            // Создание исходного файла numIsh.txt и запись в него чисел типа float
            File f1 = new File("/Users/dmitriy/Documents/Institut/1 курс/Программирование Архипов Java/first_kurs_Lab_8/Example_1/Primer_4/Primer_4/src/main/java/org/example/numIsh.txt");
            f1.createNewFile();

            Scanner sc = new Scanner(System.in, "cp1251");

            DataOutputStream wr = new DataOutputStream(new FileOutputStream(f1.getAbsolutePath()));
            System.out.print("Сколько вещественных чисел записать в файл?");
            int count = sc.nextInt();

            System.out.println("Введите числа: ");
            for (int i = 0; i < count; i++) {
                wr.writeFloat(sc.nextFloat());
            }
            wr.flush();
            wr.close();

            // Создание файла nimRez.txt и переписывание в него чисел из numIsh.txt
            File f2 = new File("/Users/dmitriy/Documents/Institut/1 курс/Программирование Архипов Java/first_kurs_Lab_8/Example_1/Primer_4/Primer_4/src/main/java/org/example/numRez.txt");
            f2.createNewFile();
            // Поток для чтения из исходного файла numIsh.txt
            DataInputStream rd = new DataInputStream(new FileInputStream(f1.getAbsolutePath()));
            // Поток для записи в результирующий файл numRez.txt
            wr = new DataOutputStream(new FileOutputStream(f2.getAbsolutePath()));

            try {
                while (true) {
                    float number = rd.readFloat();
                    System.out.println("Число " + number);
                    wr.writeFloat(number);
                }
            } catch (EOFException e) {
                System.out.print("End of file");
            } finally {
                wr.flush();
                wr.close();
                rd.close();
            }
        } catch (IOException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}