package P05;

import java.util.Scanner;

public class DataYazdirma {
    public static void main(String[] args) {

        //Soru 1- Kullanicidan uc farkli data turunde deger alip,
        // girilen degerleri aciklamalariyla yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz");
        String girilenIsim = scanner.nextLine();

        System.out.println("Lutfen yasinizi giriniz");
        int yas = scanner.nextInt();

        System.out.println("Ogrenci misiniz : true or false");
        boolean ogrenciMi = scanner.nextBoolean();

        System.out.println("Girilen isim : " + girilenIsim);
        System.out.println("Girilen yas : " + yas);
        System.out.println("Ogrenci misin : " + ogrenciMi);

        //Kullanicidan bir dikdortgenin 2 kenar uzunlugunu alip,
        // dikdortgenin alanini yazdirin.

        System.out.println("Lutfen dikdortgenin uzun kenarini girin");
        int uzunKenar = scanner.nextInt();
        System.out.println("Lutfen dikdortgenin kisa kenarini girin");
        int kisaKenar = scanner.nextInt();

        System.out.println("Dikdortgenin alani : " +kisaKenar*uzunKenar);


    }
}
