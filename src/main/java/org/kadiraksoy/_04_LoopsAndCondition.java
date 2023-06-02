package org.kadiraksoy;

public class _04_LoopsAndCondition {

    public static void main(String[] args) {
        //if-else Koşul Örneği:

        int number = 10;

        if (number > 0) {
            System.out.println("Number is positive.");
        } else if (number < 0) {
            System.out.println("Number is negative.");
        } else {
            System.out.println("Number is zero.");
        }

        //switch-case Koşul Örneği:
        int dayOfWeek = 4;
        String dayName;

        switch (dayOfWeek) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default:
                dayName = "Invalid day";
                break;
        }

        System.out.println("Day of the week is: " + dayName);

        //for Döngüsü Örneği:

        for (int i = 1; i <= 5; i++) {
            System.out.println("Count: " + i);
        }

        //while Döngüsü Örneği:
        int count = 1;

        while (count <= 5) {
            System.out.println("Count: " + count);
            count++;
        }
        //do-while Döngüsü Örneği:
        count = 1;

        do {
            System.out.println("Count: " + count);
            count++;
        } while (count <= 5);
    }
}
