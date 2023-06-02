package org.kadiraksoy;

public class _08_Inheritance {


    public void main(String[] args) {
        Bird bird = new Bird("Sparrow");
        bird.makeSound();
        bird.fly();

        AltSinif altSinif = new AltSinif();
        altSinif.birMetod();
    }

    // Abstract sınıf
    public abstract class Animal {
        private String name;

        public Animal(String name) {
            this.name = name;
        }

        public abstract void makeSound();

        public String getName() {
            return name;
        }
    }

    // Interface sınıfı
    public interface CanFly {
        void fly();
    }

    // Kalıtım ve uygulama örneği
    public class Bird extends Animal implements CanFly {
        public Bird(String name) {
            super(name);
        }

        @Override
        public void makeSound() {
            System.out.println("Chirp Chirp!");
        }

        @Override
        public void fly() {
            System.out.println(getName() + " is flying.");
        }
    }

    public class UstSinif {
        public UstSinif() {
            System.out.println("UstSinif yapıcı metodu çağrıldı");
        }



        public void birMetod() {
            System.out.println("UstSinif birMetod metodu çağrıldı");
        }
    }

    public class AltSinif extends UstSinif {
        public AltSinif() {
            super();  // UstSinif'ın yapıcı metodu çağrılıyor
            System.out.println("AltSinif yapıcı metodu çağrıldı");
        }

        public void birMetod() {
            super.birMetod();  // UstSinif'ın birMetod metodu çağrılıyor
            System.out.println("AltSinif birMetod metodu çağrıldı");
        }
    }


}
