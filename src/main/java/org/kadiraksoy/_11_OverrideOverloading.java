package org.kadiraksoy;

public class _11_OverrideOverloading {

    public  void main(String[] args) {
        Animal animal = new Animal();
        animal.makeSound(); // Animal makes a sound
        Cat cat = new Cat();
        cat.makeSound(); // Cat says Meow

        /////
        Calculator calculator = new Calculator();

        int result1 = calculator.add(3, 5);
        System.out.println("Result 1: " + result1); // 8

        double result2 = calculator.add(3.5, 2.7);
        System.out.println("Result 2: " + result2); // 6.2
    }
    public class Animal {
        public void makeSound() {
            System.out.println("Animal makes a sound");
        }
    }

    public class Cat extends Animal {
        @Override
        public void makeSound() {
            System.out.println("Cat says Meow");
        }
    }

    public class Calculator {
        public int add(int a, int b) {
            return a + b;
        }

        public double add(double a, double b) {
            return a + b;
        }
    }




}
