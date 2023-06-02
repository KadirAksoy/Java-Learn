package org.kadiraksoy;

import java.util.Optional;

public class _16_Optional {

    public static void main(String[] args) {
        String name = "Kadir Aksoy";
        Optional<String> optionalName = Optional.ofNullable(name);

        if (optionalName.isPresent()) {
            System.out.println("Name: " + optionalName.get());
        } else {
            System.out.println("Name is not available.");
        }

        //of(): Değerin null olmadığından emin olduğunuz durumlarda kullanılır. Null değer kabul etmez ve hata fırlatır.
        Optional<String> optionalName2 = Optional.of("Kadir Aksoy");

        //ofNullable(): Değerin null olabileceği durumlarda kullanılır. Null değeri kabul eder.
        String name2 = null;
        Optional<String> optionalName3 = Optional.ofNullable(name);

        //isPresent(): Optional nesnesinin değer taşıyıp taşımadığını kontrol eder. Değer varsa true, yoksa false döner.

        if (optionalName.isPresent()) {
            // Değer mevcut
        } else {
            // Değer mevcut değil
        }

        //get(): Optional nesnesinin değerini alır. Değer varsa alır, yoksa NoSuchElementException fırlatır. isPresent() metodu ile birlikte kullanıldığında kontrol yapısı oluşturulabilir.
        String value = optionalName.get();

        //orElse(): Optional nesnesinin değerini alır. Değer varsa alır, yoksa belirtilen varsayılan değeri döner.
        String value2 = optionalName.orElse("Default Value");

        //orElseGet(): Optional nesnesinin değerini alır. Değer varsa alır,
        // yoksa belirtilen bir Supplier işlevi ile varsayılan değeri döner. Supplier işlevi,
        // değer hesaplamak için kullanılır ve gerekli olmadığında çalıştırılmaz.
        String value4 = optionalName.orElseGet(() -> calculateDefaultValue());


        //Bu şekilde ifPresent() metodunu kullanarak Optional nesnesinin değeri varsa belirli bir işlemi gerçekleştirebilirsiniz.
        // Bu, null kontrollerini daha kolay bir şekilde yapmanıza ve
        // gereksiz null kontrolü kod tekrarını azaltmanıza olanak sağlar.
        String name3 = "Kadir Baran Aksoy";
        Optional<String> optionalName4 = Optional.ofNullable(name);
        optionalName.ifPresent(n -> System.out.println("Name: " + n));
    }

    private static String calculateDefaultValue() {
        return null;

    }
}
