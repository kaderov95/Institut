package org.example;

//9* (дополнительная задача). Напишите программу «Шифр Цезаря», в которой необходимо реализовать собственный алфавит, остальные условия идентичны задаче 8.

import java.util.Scanner;

public class Example_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] Alfavit = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z','a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z','А', 'Б', 'В', 'Г', 'Д', 'Е', 'Ё', 'Ж', 'З', 'И', 'Й', 'К', 'Л', 'М', 'Н', 'О', 'П', 'Р', 'С', 'Т', 'У', 'Ф', 'Х', 'Ц', 'Ч', 'Ш', 'Щ', 'Ъ', 'Ы', 'Ь', 'Э', 'Ю', 'Я','а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж', 'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о', 'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц', 'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я'
        };
        System.out.print("Введите слово, которое нужно зашифровать: ");
        String Slovo = scanner.nextLine();
        System.out.print("Введите ключ: ");
        int key = scanner.nextInt();
        int i;
        int j;
        char[] ArrayChar = Slovo.toCharArray();
        long [] AlfavitLong = new long[Alfavit.length];
        long [] ArrayCharLong = new long[AlfavitLong.length];
        long [] CaesarLong = new long[ArrayChar.length];
        for (i=0;i< Alfavit.length;i++){
            AlfavitLong[i]=Alfavit[i];
        }
        for (i=0;i<ArrayChar.length;i++){
            ArrayCharLong[i]=ArrayChar[i];
        }
        for (i=0;i<AlfavitLong.length;i++){
            for (j=0;j<AlfavitLong.length;j++){
                if (AlfavitLong[j]==ArrayCharLong[i]){
                    CaesarLong[i]=AlfavitLong[j];
                }

            }
        }
        for (i=0;i<CaesarLong.length;i++){
            CaesarLong[i]=CaesarLong[i]+key;
        }
        char [] CaesarChar = new char[ArrayChar.length];
        for (i=0;i< CaesarChar.length;i++){
            CaesarChar[i]= (char) CaesarLong[i];
            System.out.print(CaesarChar[i]);
        }
        System.out.println();
        System.out.print("Выполнить обратное преобразование?(y/n): ");
        Scanner ReverseScan = new Scanner(System.in);
        String reverse = ReverseScan.nextLine();
        switch (reverse) {
            case "y" -> {
                for (i = 0; i < CaesarChar.length; i++) {
                    CaesarLong[i] = CaesarChar[i];
                }
                for (i = 0; i < CaesarLong.length; i++) {
                    CaesarLong[i] = CaesarLong[i] - key;
                }
                for (i = 0; i < CaesarChar.length; i++) {
                    CaesarChar[i] = (char) CaesarLong[i];
                    System.out.print(CaesarChar[i]);
                }
            }
            case "n" -> System.out.println("До свидания!");
            default -> System.out.println("Вы ввели некорректные данные");
        }
    }
}
