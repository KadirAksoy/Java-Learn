package org.kadiraksoy;

public class Operators {

    public static void main(String[] args) {

        //Aritmetik Operatörler:

        int a = 5;
        int b = 3;

        int sum = a + b; // Toplama operatörü
        int difference = a - b; // Çıkarma operatörü
        int product = a * b; // Çarpma operatörü
        int quotient = a / b; // Bölme operatörü
        int remainder = a % b; // Mod alma operatörü

        //Atama Operatörü:

        int x = 10;
        int y = 5;

        x += y; // x = x + y;

        //Karşılaştırma Operatörleri:

        int p = 7;
        int q = 4;

        boolean isEqual = p == q; // Eşitlik operatörü
        boolean isNotEqual = p != q; // Eşit değil operatörü
        boolean isGreater = p > q; // Büyüktür operatörü
        boolean isLess = p < q; // Küçüktür operatörü
        boolean isGreaterOrEqual = p >= q; // Büyük eşit operatörü
        boolean isLessOrEqual = p <= q; // Küçük eşit operatörü


        //Mantıksal Operatörler:
        boolean isSunny = true;
        boolean isWarm = false;

        boolean isNiceWeather = isSunny && isWarm; // Mantıksal ve operatörü
        boolean isEitherOr = isSunny || isWarm; // Mantıksal veya operatörü
        boolean isNotSunny = !isSunny; // Mantıksal değil operatörü


        //Artırma ve Azaltma Operatörleri:
        int count = 5;

        count++; // Tekli artırma operatörü
        count--; // Tekli azaltma operatörü

        int j = 10;
        int k = ++j; // Ön ek artırma operatörü
        k = j--; // Son ek azaltma operatörü
    }
}
