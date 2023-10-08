package F15;

import java.util.Random;
import java.util.Scanner;

public class EF03_SinavKontrol {
    public static void main(String[] args) {
    /*
    Kullanıcının girdiği öğrenci sayısı ve kullanıcının girdiği toplam
    soru sayısına bağlı olarak, öğrencilerin soruya verdiği cevapları
    tutan bir matris düzenleyin. Bu değerleri rastgele olarak olusturun.
    Değerler A,B,C,D,E olmalı.
    Bir de doğru cevapları tutan tek boyutlu bir diziniz olsun. Bu da
    rastgele oluşturulmalı.
    Sonrasında bu değerleri karşılaştırarak her bir öğrencinin kaç doğru
    ve yanlışı olduğunu gösteren programı yazınız.
     */
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan öğrenci sayısı ve soru sayısını alın
        System.out.print("Öğrenci sayısını girin: ");
        int ogrenciSayisi = scanner.nextInt();
        System.out.print("Toplam soru sayısını girin: ");
        int soruSayisi = scanner.nextInt();

        // Öğrenci cevaplarını ve doğru cevapları rastgele oluşturun
        char[][] ogrenciCevaplari = cevapOlustur(ogrenciSayisi, soruSayisi);
        char[] dogruCevaplar = cevapUret(soruSayisi);

        // Her öğrencinin doğru ve yanlış cevaplarını sayın
        int[] dogruSayisi = new int[ogrenciSayisi];

        for (int i = 0; i < ogrenciSayisi; i++) {
            dogruSayisi[i] = dogruCevaplariKontrolEt(ogrenciCevaplari[i], dogruCevaplar);
        }

        // Sonuçları ekrana yazdırın
        for (int i = 0; i < ogrenciSayisi; i++) {
            int yanlisSayisi = soruSayisi - dogruSayisi[i];
            System.out.println("Öğrenci " + (i + 1) + ": Doğru: " + dogruSayisi[i] + ", Yanlış: " + yanlisSayisi);
        }

        // Doğru cevapları ekrana yazdırın
        System.out.print("Doğru Cevaplar: ");
        for (int i = 0; i < dogruCevaplar.length; i++) {
            System.out.print(dogruCevaplar[i] + " ");
        }
    }

    // Belirtilen sayıda soru için rastgele cevaplar oluşturan method
    private static char[] cevapUret(int sayi) {
        char[] cevaplar = new char[sayi];
        Random random = new Random();

        for (int i = 0; i < sayi; i++) {
            char randomCevap = (char) ('A' + random.nextInt(5));
            cevaplar[i] = randomCevap;
        }

        return cevaplar;
    }

    // Belirtilen sayıda öğrenci için rastgele cevaplar oluşturan method
    private static char[][] cevapOlustur(int ogrenciSayisi, int soruSayisi) {
        char[][] cevaplar = new char[ogrenciSayisi][soruSayisi];
        Random random = new Random();

        for (int i = 0; i < ogrenciSayisi; i++) {
            for (int j = 0; j < soruSayisi; j++) {
                char randomCevap = (char) ('A' + random.nextInt(5));
                cevaplar[i][j] = randomCevap;
            }
        }

        return cevaplar;
    }

    // Öğrencinin cevaplarını kontrol eden method
    public static int dogruCevaplariKontrolEt(char[] ogrenciCevaplari, char[] dogruCevaplar) {
        int dogruSayisi = 0;

        for (int i = 0; i < ogrenciCevaplari.length; i++) {
            if (ogrenciCevaplari[i] == dogruCevaplar[i]) {
                dogruSayisi++;
            }
        }

        return dogruSayisi;
    }
}
