package F02;

import java.util.Scanner;

public class deneme3 {
    public static void main(String[] args) {
        /* Soru 1-Kullanicidan input olarak verilen bir String, baslangic ve bitis indexlerine gore
        baslangic index'i dahil, bitis index'i haric olacak sekilde aradaki harfleri yazdiran
        bir method olusturun.
            -kullanici baslangic degeri olarak, bitis degerinden buyuk bir sayi girerse, hata
        mesaji verin
            -kullanici str'da olan index'lerden daha buyuk bir index girerse hata mesaji
        yazdirin. */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir metin yazın.");
        String metin = scanner.nextLine();

        System.out.println("Baslangic degeri girin");
        int deger1 = scanner.nextInt();

        System.out.println("Bitis degeri girin");
        int deger2 = scanner.nextInt();
        harfYazdirma(metin, deger1, deger2);

    }

    public static void harfYazdirma(String str, int baslangic, int bitis) {




        if (baslangic < 0 || baslangic > str.length()) {
            System.out.println("Baslangıc degerini negatif veya yazgiginiz metnin harf sayisindan fazla girmeyiniz");
            return;

        } else if (bitis < 0 || bitis >= str.length()) {
            System.out.println("Bitis degerini negatif veya yazgiginiz metnin harf sayisindan fazla girmeyiniz");
            return;

        } else if (baslangic > bitis) {
            System.out.println("Lutfen baslangic degeri olarak bitis degerinden kucuk bir sayi girin");
            return;
        }

        str = str.substring(baslangic, bitis);
        System.err.println("Yazdirilan Metin = " + str);
    }
}
