//2. Напишите программу, которая проверяет, удовлетворяет ли введенное 
//пользователем число следующим критериям: при делении на 5 в остатке 
//получается 2, а при делении на 7 в остатке получается 1.

package first_kurs_Lab_2;

import java.util.Scanner;

public class Example_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int number = scanner.nextInt();

        if (number % 5 == 2 && number % 7 == 1) {
            System.out.println("Число " + number + " удовлетворяет критериям");
        } else {
            System.out.println("Число " + number + " не удовлетворяет критериям");
        }
    }

}
