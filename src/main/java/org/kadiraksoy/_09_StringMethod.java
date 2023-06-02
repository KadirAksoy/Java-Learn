package org.kadiraksoy;

public class _09_StringMethod {


    public static void main(String[] args) {
        // length() - Bir dizenin uzunluğunu döndürür.
        //charAt(int index) - Belirtilen indexteki karakteri döndürür.
        //substring(int beginIndex) - Belirtilen başlangıç indexten itibaren alt bir diziyi döndürür.
        //substring(int beginIndex, int endIndex) - Belirtilen başlangıç ve bitiş indexten itibaren alt bir diziyi döndürür.
        //toUpperCase() - Tüm karakterleri büyük harfe dönüştürür.
        //toLowerCase() - Tüm karakterleri küçük harfe dönüştürür.
        //startsWith(String prefix) - Belirtilen önek ile başlayıp başlamadığını kontrol eder.
        //endsWith(String suffix) - Belirtilen sonek ile bitip bitmediğini kontrol eder.
        //contains(CharSequence sequence) - Belirtilen karakter dizisini içerip içermediğini kontrol eder.
        //replace(char oldChar, char newChar) - Belirtilen karakterleri değiştirir.
        //trim() - Dizenin başındaki ve sonundaki boşlukları kaldırır.
        //split(String regex) - Belirtilen düzenli ifadeye göre dizeyi böler ve alt dize dizisini döndürür.
        //join(CharSequence delimiter, CharSequence... elements) - Belirtilen ayırıcıyla alt dizeleri birleştirir.
        //indexOf(int ch) - Belirtilen karakterin ilk bulunduğu indeksi döndürür.
        //lastIndexOf(int ch) - Belirtilen karakterin son bulunduğu indeksi döndürür.
        //isEmpty() - Dizenin boş olup olmadığını kontrol eder.
        //equals(Object anObject) - Başka bir nesne ile dizenin eşit olup olmadığını kontrol eder.
        //equalsIgnoreCase(String anotherString) - Başka bir dizeyle büyük/küçük harf duyarsız şekilde eşit olup olmadığını kontrol eder.
        //startsWith(String prefix, int toffset) - Belirtilen önek ile belirtilen indexten başlayıp başlamadığını kontrol eder.
        //endsWith(String suffix, int length) - Belirtilen sonek ile belirtilen uzunlukta bitip bitmediğini kontrol eder.
        //concat(String str) - Dizeyi belirtilen dizeyle birleştirir.
        //valueOf(Object obj) - Nesneyi bir dizeye dönüştürür.
        //compareTo(String anotherString) - Başka bir dizeyle alfabetik olarak karşılaştırır.
        //startsWith(String prefix) - Belirtilen önek ile başlayıp başlamadığını kontrol eder.
        //endsWith(String suffix) - Belirtilen sonek ile bitip bitmediğini kontrol eder.
        //replaceAll(String regex, String replacement) - Belirtilen düzenli ifadeyi belirtilen dizeyle değiştirir.
        //matches(String regex) - Belirtilen düzenli ifadeyle eşleşip eşleşmediğini kontrol eder.
        //isEmpty() - Dizenin boş olup olmadığını kontrol eder.
        //toCharArray() - Diziyi karakter dizisine dönüştürür.
        //format(String format, Object... args) - Biçimlendirilmiş bir dize oluşturur.
        //replaceAll(String regex, String replacement) - Belirtilen düzenli ifadeye uyan tüm alt dizeleri belirtilen dizeyle değiştirir.
        //replaceFirst(String regex, String replacement) - Belirtilen düzenli ifadeye uyan ilk alt dizesi belirtilen dizeyle değiştirir.
        //contains(CharSequence sequence) - Belirtilen karakter dizisini içerip içermediğini kontrol eder.
        //matches(String regex) - Belirtilen düzenli ifadeyle tam eşleşip eşleşmediğini kontrol eder.
        //startsWith(String prefix) - Belirtilen önek ile başlayıp başlamadığını kontrol eder.
        //endsWith(String suffix) - Belirtilen sonek ile bitip bitmediğini kontrol eder.
        //getBytes() - Diziyi byte dizisine dönüştürür.

        String str = "Hello World";

        int length = str.length();
        System.out.println("Length: " + length);

        char ch = str.charAt(0);
        System.out.println("Character at index 0: " + ch);

        String subStr = str.substring(6);
        System.out.println("Substring from index 6: " + subStr);

        String subStr2 = str.substring(0, 5);
        System.out.println("Substring from index 0 to 5: " + subStr2);

        String upperCase = str.toUpperCase();
        System.out.println("Uppercase: " + upperCase);

        String lowerCase = str.toLowerCase();
        System.out.println("Lowercase: " + lowerCase);

        boolean startsWithHello = str.startsWith("Hello");
        System.out.println("Starts with 'Hello': " + startsWithHello);

        boolean endsWithWorld = str.endsWith("World");
        System.out.println("Ends with 'World': " + endsWithWorld);

        boolean containsHello = str.contains("Hello");
        System.out.println("Contains 'Hello': " + containsHello);

        String replaced = str.replace('o', '0');
        System.out.println("Replaced: " + replaced);

        String trimmed = str.trim();
        System.out.println("Trimmed: " + trimmed);

        String str3 = "Hello,World,Java";
        String[] parts = str3.split(",");
        for (String part : parts) {
            System.out.println(part);
        }

        String[] parts2 = {"Hello", "World", "Java"};
        String joined = String.join("-", parts2);
        System.out.println("Joined: " + joined);

        int index = str.indexOf('o');
        System.out.println("Index of 'o': " + index);

        int lastIndex = str.lastIndexOf('o');
        System.out.println("Last index of 'o': " + lastIndex);

        boolean empty = str.isEmpty();
        System.out.println("Is empty: " + empty);

        String str4 = "Hello";
        String str5 = "Hello";
        boolean equal = str4.equals(str5);
        System.out.println("Is equal: " + equal);

        String str6 = "Hello";
        String str7 = "Hello";
        boolean equalIgnoreCase = str6.equalsIgnoreCase(str7);
        System.out.println("Is equal (ignore case): " + equalIgnoreCase);

        String str8 = "Hello";
        String str9 = "World";
        String result = str8.concat(str9);
        System.out.println("Concatenated string: " + result);

        String str10 = "apple";
        String str11 = "banana";
        int result2 = str10.compareTo(str11);
        System.out.println("Comparison result: " + result2);

        String str12 = "Hello, Java!";
        String replaced2 = str12.replaceAll("[,!]", "");
        System.out.println("Replaced string: " + replaced2);

        String str13 = "123456";
        boolean matches = str13.matches("\\d+");
        System.out.println("Matches: " + matches);

        String str14 = "";
        boolean empty2 = str14.isEmpty();
        System.out.println("Is empty: " + empty2);


    }
}
