package org.kadiraksoy;
import java.util.Scanner;

public class PrintAndScanner {

    public static void main(String[] args) {
        // Basit metin çıktısı:
        System.out.println("Hello, World!");


        //Değişken değerlerini çıktı olarak kullanma:
        String name = "baran";
        int age = 25;

        System.out.println("Name: " + name + ", Age: " + age);

        //Matematiksel ifadeleri çıktı olarak kullanma:
        int x = 5;
        int y = 3;
        int sum = x + y;

        System.out.println("Sum of " + x + " and " + y + " is: " + sum);
        //Formatlı çıktı kullanma:

        String name2 = "kadir";
        int age2 = 30;

        System.out.printf("Name: %s, Age: %d%n", name, age);

        //////
        //////



        //Scanner kullanımı
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int intNumber = scanner.nextInt();

        System.out.println("Entered number: " + intNumber);

        //Ondalıklı sayı girdisi almak:
        System.out.print("Enter a decimal number: ");
        double doubleNumber = scanner.nextDouble();

        System.out.println("Entered number: " + doubleNumber);

        //Metin girdisi almak:
        System.out.print("Enter a text: ");
        String text = scanner.nextLine();

        System.out.println("Entered text: " + text);
        //Birden fazla değer girdisi almak:


        System.out.print("Enter two numbers separated by a space: ");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();

        System.out.println("Entered numbers: " + number1 + " and " + number2);
    }


}
