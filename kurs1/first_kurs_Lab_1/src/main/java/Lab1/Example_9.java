package Lab1;

import java.io.PrintWriter;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

// Example 4 in doc
public class Example_9 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        System.out.print("Введите название месяца: ");
        String nameMonth = in.nextLine();

        System.out.print("Введите количество дней в месяце: ");
        int countDay = in.nextInt();

//        Date date = new Date();
//        long millis = date.getTime();
//        System.out.println(String.valueOf(millis));

//        Calendar calendar = new GregorianCalendar(2017, 0 , 25);
//        Date date = calendar.getTime();
//        System.out.println(date);

//        Date date = new Date();
//
//        // Вывод текущей даты и времени с использованием toString()
//        System.out.println(date.toString());




    }
}
