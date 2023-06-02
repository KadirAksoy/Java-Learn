package org.kadiraksoy;

public class _07_AccesModifier {

    public static void main(String[] args) {
        // Person sınıfından bir nesne oluşturma
        Person person = new Person();

        // Erişim belirleyicilere erişim örneği
        person.name = "Alice"; // public erişim belirleyiciye erişim
        person.age = 25; // varsayılan (default) erişim belirleyiciye erişim
        // person.address = "123 Street"; // private erişim belirleyiciye erişim (hata)

        // Bilgileri ekrana yazdırma
        System.out.println("Name: " + person.name);
        System.out.println("Age: " + person.age);
    }
}
class Person {
    public String name;
    int age; // varsayılan (default) erişim belirleyici
    private String address;
    protected String phone;  // kalıtım yapılan sınıf tarafından kullanılabilir.
}
