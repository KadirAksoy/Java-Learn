package org.kadiraksoy;

import java.util.ArrayList;
import java.util.Comparator;

public class _15_ArrayList {

    public static void main(String[] args) {
        // ArrayList oluşturma
        ArrayList<String> liste = new ArrayList<>();

        // Eleman ekleme
        liste.add("Kırmızı");
        liste.add("Mavi");
        liste.add("Yeşil");

        // Elemanlara erişim ve yazdırma
        System.out.println("İlk eleman: " + liste.get(0));
        System.out.println("Liste boyutu: " + liste.size());

        // Eleman değiştirme
        liste.set(1, "Sarı");

        // Eleman silme
        liste.remove(2);

        // Liste üzerinde döngü
        for (String eleman : liste) {
            System.out.println(eleman);
        }

        // Liste boş mu kontrolü
        boolean bosMu = liste.isEmpty();
        System.out.println("Liste boş mu? " + bosMu);

        // Liste içerisinde elemanın var olup olmadığını kontrol etme
        boolean varMi = liste.contains("Kırmızı");
        System.out.println("Kırmızı var mı? " + varMi);

        // Liste içerisindeki indeksin bulunması
        int indeks = liste.indexOf("Sarı");
        System.out.println("Sarı'nın indeksi: " + indeks);

        // Liste temizleme
        liste.clear();

        // Liste boşaltıldıktan sonra boyut kontrolü
        System.out.println("Liste boşaltıldıktan sonra boyutu: " + liste.size());

        ArrayList<Integer> liste2 = new ArrayList<>();
        liste2.add(5);
        liste2.add(2);
        liste2.add(7);
        liste2.add(1);

        liste.sort(Comparator.naturalOrder()); // [1, 2, 5, 7]
    }
}
