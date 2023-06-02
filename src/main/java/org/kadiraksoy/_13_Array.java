package org.kadiraksoy;

import java.util.Arrays;

public class _13_Array {

    public static void main(String[] args) {
        int[] numbers = {5, 2, 8, 3, 1};

        // Dizi uzunluğu
        System.out.println("Dizi uzunluğu :" + numbers.length);

        // Diziyi yazdırma
        System.out.println("Dizi: " + Arrays.toString(numbers));

        // Dizi elemanlarını sıralama
        Arrays.sort(numbers);
        System.out.println("Sıralanmış Dizi: " + Arrays.toString(numbers));

        // Dizi elemanlarını arama
        int index = Arrays.binarySearch(numbers, 3);
        System.out.println("3 sayısı dizinin " + index + ". indeksinde bulunuyor.");

        // Diziyi kopyalama
        int[] numbersCopy = Arrays.copyOf(numbers, numbers.length);
        System.out.println("Kopyalanan Dizi: " + Arrays.toString(numbersCopy));

        // Diziyi doldurma
        int[] filledArray = new int[5];
        Arrays.fill(filledArray, 10);
        System.out.println("Doldurulan Dizi: " + Arrays.toString(filledArray));

        // Array'in elemanlarını birleştirme
        String[] fruits = {"Apple", "Banana", "Orange"};
        String result = String.join(",,,", fruits);
        System.out.println("Birleştirilen dizi: " + result);


    }


}
