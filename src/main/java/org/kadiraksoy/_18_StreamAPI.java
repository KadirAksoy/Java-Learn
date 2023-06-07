package org.kadiraksoy;

import java.util.*;
import java.util.stream.Collectors;

public class _18_StreamAPI {


    //filter(): Belirli bir koşulu karşılayan öğeleri filtrelemek için kullanılır.
    //map(): Öğeleri dönüştürmek için kullanılır. Bir öğeyi başka bir öğeye dönüştürmek için bir fonksiyon uygulanır.
    //forEach(): Her öğe için belirtilen bir eylemi uygulamak için kullanılır.
    //collect(): Stream öğelerini bir koleksiyon, dizi veya haritaya toplamak için kullanılır.
    //reduce(): Stream öğelerini birleştirmek veya azaltmak için kullanılır.
    //distinct(): Tekrarlanan öğeleri filtrelemek için kullanılır.
    //sorted(): Öğeleri belirli bir sıralama düzenine göre sıralamak için kullanılır.
    //limit(): İlk N öğeyi almak için kullanılır.
    //skip(): İlk N öğeyi atlamak için kullanılır.
    //anyMatch(): Herhangi bir öğenin belirli bir koşulu karşılayıp karşılamadığını kontrol etmek için kullanılır.
    public static void main(String[] args) {


    }


    //  Question-1
    public static Collection<String> mapToUppercase(String... names) {
        Collection<String> uppercaseNames = new ArrayList<>();
        for(String name : names) {
            uppercaseNames.add(name.toUpperCase());
        }
        return uppercaseNames;
    }

    //Array elemanlarının hepsini al -> stream()
    //buyuk harflere çevir -> map()
    //liste olarak geri döndür -> collect()
    public static Collection<String> mapToUppercase2(String... names) {
        return Arrays.asList(names).stream().map(name -> name.toUpperCase()).collect(Collectors.toList());
    }


    //Array elemanları al -> stream()
    //5 ten uzun isimleri filtrele -> filter()
    //Geri kalan listedeki harfleri topla -> mapToInt()
    //Harfleri topla -> sum()
    public static int getTotalNumberOfLettersOfNamesLongerThanFive(String... names) {
        return Arrays.stream(names)
                .filter(name -> name.length() > 5)
                .mapToInt(String::length)
                .sum();
    }

    public static List<String> transform(List<List<String>> collection) {
        List<String> newCollection = new ArrayList<>();
        for (List<String> subCollection : collection) {
            for (String value : subCollection) {
                newCollection.add(value);
            }
        }
        return newCollection;
    }


    //Nested List e ait değerleri al -> stream()
    //her bir elemanı bir listeye ekle -> flatMap()
    public static List<String> transform2(List<List<String>> collection) {
        return collection.stream().flatMap(Collection::stream).collect(Collectors.toList());
    }


    public class Person {

        private String name;
        private int age;
        private String nationality;

        public Person(String name, int age, String nationality) {
            this.name = name;
            this.age = age;
            this.nationality = nationality;
        }

        public Person(String name, int age) {
            this(name, age, "");
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public String getNationality() {
            return nationality;
        }
    }

    public  Person getOldestPerson(List<Person> people) {
        Person oldestPerson = new Person("", 0);
        for (Person person : people) {
            if (person.getAge() > oldestPerson.getAge()) {
                oldestPerson = person;
            }
        }
        return oldestPerson;
    }
    public  Person getOldestPerson2(List<Person> people) {
        return people.stream().max(Comparator.comparingInt(Person::getAge)).orElse(null);
    }
}
