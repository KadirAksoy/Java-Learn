package org.kadiraksoy;

import java.io.*;

public class _13_FileOperation {


    public static void main(String[] args) {


        // Dosyadan okuma işlemi
        String dosyaYolu = "dosya.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(dosyaYolu))) {
            String satir;
            while ((satir = br.readLine()) != null) {
                System.out.println(satir);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }



        // Dosyadan okuma işlemi

        String dosyaYolu2 = "sayilar.txt";
        int toplam = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(dosyaYolu))) {
            String satir;
            while ((satir = br.readLine()) != null) {
                int sayi = Integer.parseInt(satir);
                toplam += sayi;
            }
            System.out.println("Toplam: " + toplam);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Dosyaya yazma işlemi

        String dosyaYolu3 = "yeni_dosya.txt";
        String metin = "Bu bir deneme metnidir.";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(dosyaYolu))) {
            bw.write(metin);
            System.out.println("Dosyaya yazma işlemi başarıyla tamamlandı.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
