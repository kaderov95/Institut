//5. Напишите программу, которая проверяет, сколько тысяч во 
//введенном пользователем числе 
//(определяется четвертая цифра справа в десятичном представлении числа.

package first_kurs_Lab_2;

import java.util.Scanner;

public class Example_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int number = scanner.nextInt();

        int fourthDigit = (number / 1000) % 10;

        System.out.println("Четвертая цифра числа " + number + " равна " + fourthDigit);
    }

}
