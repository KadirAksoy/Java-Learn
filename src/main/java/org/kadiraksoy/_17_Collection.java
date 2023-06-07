package org.kadiraksoy;

import java.util.*;

public class _17_Collection {

    public static void main(String[] args) {


        Collection<String> newCities = new ArrayList<>();  // !!Polymorphism
        newCities.add("Paris");
        newCities.add("New York");
        newCities.add("Amsterdam");


        Collection<String> cities = new ArrayList<>();
        cities.add("Istanbul");                  // add method return boolean
        cities.add("Ankara");
        cities.add("Izmir");

        System.out.println(cities.add("Mardin"));   // true


        cities.addAll(newCities);         // return boolean


        System.out.println(cities.addAll(newCities));          // return boolean

        System.out.println(cities);         // Böyle direkt yazdırabiliriz.

        newCities.clear();  // void döndürür. her şeyi siler.

        System.out.println(!newCities.isEmpty());                    // return boolean


        System.out.println(cities.contains("Mardin")  );             // return boolean

        System.out.println(cities.containsAll(newCities));          // return boolean

        System.out.println(newCities);

        cities.size();


        HashSet<Integer> number = new HashSet<>();      // Set yapısı birden fazla aynı değere izin vermez unique dir
        number.size();



        Collection<Integer> numberList = new TreeSet<>();   // Set ile aynıdır aynı zamanda verileri sıralar.
        numberList.add(1);
        numberList.add(1);
        numberList.add(2);
        numberList.add(3);
        numberList.add(4);
        numberList.add(5);
        numberList.add(11);
        numberList.add(8);
        numberList.add(15);

        System.out.println(numberList);




    }

}
