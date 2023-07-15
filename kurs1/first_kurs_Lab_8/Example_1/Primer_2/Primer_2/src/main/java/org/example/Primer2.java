//Пример 2. Прочитать и вывести на экран информацию из трех источников:
//          файла на диске, интернет-страницы и массива типа byte.

package org.example;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class Primer2 {
    // Метод для чтения данных из потока по байтам с выводом
    public static void readAllByByte(InputStream in) throws IOException {
        while (true) {
            int oneByte = in.read(); // Читает 1 байт
            if (oneByte !=-1){ // Признак отсутствия конца страницы
                System.out.print((char) oneByte);
            } else {
                System.out.print("\n" + "end");
                break;
            }
        }
    }

//public class Main {
    public static void main(String[] args) throws IOException {
    try {
        // с потоком связан файл
        InputStream inFile = new FileInputStream("c:/tmp/text.txt");
        readAllByByte(inFile);
        System.out.print("\n\n\n");
            inFile.close();

        // С потоком связана интернет-страница
        InputStream inUrl = new URL("http://google.com").openStream();
        readAllByByte(inUrl);
        System.out.print("\n\n\n");
            inUrl.close();

        // С потоком связан массив byte
        InputStream inArray = new ByteArrayInputStream(new byte[] {7, 9, 3, 7, 4});
        readAllByByte(inArray);
        System.out.print("\n\n\n");
            inArray.close();

    } catch (IOException e) {
        System.out.print("Ошибка: " + e);
            }
        }
}