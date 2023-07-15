package Lab1;

import java.util.Scanner;

public class Example_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input name: ");
        String name = in.nextLine();

        System.out.print("Input age: ");
        int age = in.nextInt();

        System.out.print("Input height: ");
        float height = in.nextFloat();

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.print("Height: " + height);
        in.close();

    }
}
