//Пример 3.   Прочитать и вывести на экран информацию из предварительно
//            созданного файла с использованием буфера в 5 байт.

package org.example;

import org.example.File_ByteRead_SamBuff;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.FileInputStream;

public class Main {
    public static void main(String[] args) throws IOException {
        String fileName = "/Users/dmitriy/Documents/Institut/1 курс/Программирование Архипов Java/first_kurs_Lab_8/Example_1/Primer_3/Primer_3/src/main/java/org/example/MyFile1.txt";
        InputStream inFile = null;

        try {
            inFile = new FileInputStream(fileName);
            File_ByteRead_SamBuff.readAllByArray(inFile);
        } catch (IOException e) {
            System.out.println("Ошибка закрытия файла " + fileName + e);
        } finally {
            if (inFile != null) {
                try {
                    inFile.close();
                } catch (IOException ignore) {
                    /*NOP*/ // "No operation" ничего не делать
                }
            }
        }
    }
}
