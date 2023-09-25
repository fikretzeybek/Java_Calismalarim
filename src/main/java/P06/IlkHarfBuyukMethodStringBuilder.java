package P06;

import java.util.Scanner;

public class IlkHarfBuyukMethodStringBuilder {

    public static void main(String[] args) {

        /*
         Kullanicidan main method icinde  isim ve soyismini alin
         Isim ve soyismi ilk harfleri buyuk diger harfler kucuk olacak sekilde duzenleyip
         isim bosluk soyisim seklinde bize donduren bir method olusturun
         input : isim : Ali  soyisim :YILMAZ
         output : Ali Yilmaz
         */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Lutfen adinizi ve soyadinizi giriniz : ");
        String adSoyad = scanner.nextLine();

        System.out.println(adSoyadIlkHarfiBuyut(adSoyad));
    }

    private static String adSoyadIlkHarfiBuyut(String adSoyad) {

        String[] yeniAdSoyad = adSoyad.split(" ");

        StringBuilder yeniad = new StringBuilder();
        String isimParcasi = "";
        for (String w : yeniAdSoyad) {

            isimParcasi = w.substring(0, 1).toUpperCase() + w.substring(1).toLowerCase();
            yeniad.append(isimParcasi).append(" ");
        }

        return yeniad.toString();
    }

}