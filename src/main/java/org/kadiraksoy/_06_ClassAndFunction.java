package org.kadiraksoy;

public class _06_ClassAndFunction {

    public static void main(String[] args) {
        // Fonksiyonu çağırma
        int result = addNumbers(5, 3);
        System.out.println("Result: " + result);

        // Sınıfın kullanımı
        Person person = new Person("Alice", 25);
        person.sayHello();
    }

    // Toplama işlemini gerçekleştiren bir fonksiyon
    public static int addNumbers(int a, int b) {
        return a + b;
    }

    // Person adında bir sınıf
    public static class Person {
        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public void sayHello() {
            System.out.println("Hello, my name is " + name + " and I'm " + age + " years old.");
        }
    }
}
