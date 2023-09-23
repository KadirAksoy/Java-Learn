package org.kadiraksoy.autoboxingANDunboxing;

public class Main {
    public static void main(String[] args) {
        int loopCount = 1000;


        callIntExample(loopCount);
        callIntegerExample(loopCount);
        callAutoboxingExample(loopCount);
        callUnboxingExample(loopCount);
    }

    // int veri tipi
    public static void callIntExample(int loopCount) {
        long startTime = System.nanoTime();

        for (int i = 0; i < loopCount; i++) {
            int primitiveInt = i;
        }

        long endTime = System.nanoTime();
        long duration = endTime - startTime;

        System.out.println("IntExample ile geçen süre: " + duration + " nanosaniye");
    }

    //Integer veri tipi
    public static void callIntegerExample(int loopCount) {
        long startTime = System.nanoTime();

        for (int i = 0; i < loopCount; i++) {
            Integer integerObject = Integer.valueOf(i);
        }

        long endTime = System.nanoTime();
        long duration = endTime - startTime;

        System.out.println("IntegerExample ile geçen süre: " + duration + " nanosaniye");
    }

    //Autoboxing: Autoboxing,
    // Java'da temel veri tipleri (int, double, char, vb.) ile
    // bunların karşılık gelen sarmalayıcı sınıfları (Integer, Double, Character, vb.) arasında
    // otomatik olarak dönüşüm yapılmasını sağlayan bir özelliktir.
    // Yani, bir temel veri tipini sarmalayıcı sınıfına otomatik olarak dönüştürme işlemidir.
    // Bu, kodu daha okunaklı hale getirebilir ve bazı durumlarda tür uyumsuzluklarını engelleyebilir.
    public static void callAutoboxingExample(int loopCount) {
        long startTime = System.nanoTime();

        for (int i = 0; i < loopCount; i++) {
            int primitiveIntAutoboxing = i;
            Integer boxedInt = primitiveIntAutoboxing;
        }

        long endTime = System.nanoTime();
        long duration = endTime - startTime;

        System.out.println("AutoboxingExample ile geçen süre: " + duration + " nanosaniye");
    }

    //Unboxing: Unboxing,
    // sarmalayıcı sınıflardan (örneğin, Integer, Double) temel veri tiplerine
    // otomatik olarak dönüşüm yapılmasını sağlayan bir özelliktir.
    // Yani, bir sarmalayıcı sınıfı değerini otomatik olarak ilgili temel veri tipine çevirme işlemidir.

    public static void callUnboxingExample(int loopCount) {
        Integer[] boxedIntegers = new Integer[loopCount];

        for (int i = 0; i < loopCount; i++) {
            boxedIntegers[i] = i;
        }

        long startTime = System.nanoTime();

        for (int i = 0; i < loopCount; i++) {
            int primitiveInt = boxedIntegers[i];
        }

        long endTime = System.nanoTime();
        long duration = endTime - startTime;

        System.out.println("UnboxingExample ile geçen süre: " + duration + " nanosaniye");
    }
}
