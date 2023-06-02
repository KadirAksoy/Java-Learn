package org.kadiraksoy;

import java.util.Objects;

public class _12_ToStringEqualsHashCode {

    public  void main(String[] args) {
        Person person = new Person("kadir aksoy", 30);
        System.out.println(person.toString());


        Point point1 = new Point(3, 5);
        Point point2 = new Point(3, 5);
        Point point3 = new Point(5, 7);

        System.out.println("point1.equals(point2): " + point1.equals(point2)); // true
        System.out.println("point1.equals(point3): " + point1.equals(point3)); // false

        System.out.println("point1.hashCode(): " + point1.hashCode());
        System.out.println("point2.hashCode(): " + point2.hashCode());
        System.out.println("point3.hashCode(): " + point3.hashCode());
    }

    public class Person {
        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return "Person [name=" + name + ", age=" + age + "]";
        }
    }

    public class Point {
        private int x;
        private int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (obj == null || getClass() != obj.getClass())
                return false;

            Point other = (Point) obj;
            return x == other.x && y == other.y;
        }

        @Override
        public int hashCode() {
            return Objects.hash(x, y);
        }
    }
}
