package org.example;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String inputFilePath = "/Users/dmitriy/Documents/Institut/1 курс/Программирование Архипов Java/first_kurs_Lab_8/src/main/java/org/example/input.txt"; // путь к исходному файлу
        String outputFilePath = "/Users/dmitriy/Documents/Institut/1 курс/Программирование Архипов Java/first_kurs_Lab_8/src/main/java/org/example/output.txt"; // путь к выходному файлу

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFilePath));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath))) {
            String line;
            int lineNumber = 1; // номер текущей строки
            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\\s+"); // разбиваем строку на слова по пробелам
                int count = 0; // счетчик слов, начинающихся с согласных букв
                for (String word : words) {
                    if (word.matches("^[бвгджзйклмнпрстфхцчшщ].*")) { // проверяем, начинается ли слово с согласной буквы
                        writer.write(lineNumber + ": " + word + "\n"); // записываем слово в выходной файл
                        count++; // увеличиваем счетчик
                    }
                }
                if (count > 0) {
                    writer.write("Количество слов: " + count + "\n"); // записываем количество выбранных слов
                }
                lineNumber++; // увеличиваем номер строки
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}