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
    }

}
