package org.kadiraksoy;

public class _10_Generic {

    // Generic bir sınıf tanımlama
    public class Box<T> {
        private T item;

        public void setItem(T item) {
            this.item = item;
        }

        public T getItem() {
            return item;
        }

    }

    class ArrayUtil {
        public static <T> void printArray(T[] array) {
            for (T item : array) {
                System.out.print(item + " ");
            }
            System.out.println();
        }
    }

    public  void main(String[] args) {
        // String tipinde bir Box oluşturma
        Box<String> stringBox = new Box<>();
        stringBox.setItem("Merhaba");
        String strItem = stringBox.getItem();
        System.out.println("String Box Item: " + strItem);

        // Integer tipinde bir Box oluşturma
        Box<Integer> integerBox = new Box<>();
        integerBox.setItem(10);
        int intItem = integerBox.getItem();
        System.out.println("Integer Box Item: " + intItem);


        // List
        Integer[] intArray = {1, 2, 3, 4, 5};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};
        String[] stringArray = {"Java", "is", "awesome"};

        //ArrayList
        System.out.println("Integer Array:");
        ArrayUtil.printArray(intArray);

        //Double ArrayList
        System.out.println("Double Array:");
        ArrayUtil.printArray(doubleArray);

        //String ArrayList
        System.out.println("String Array:");
        ArrayUtil.printArray(stringArray);
    }

}
