package org.kadiraksoy;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Queue;

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


        HashSet<Integer> number = new HashSet<>();
        number.size();




    }

}
