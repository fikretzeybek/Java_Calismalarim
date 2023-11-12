package F06;

import java.util.Scanner;

public class F03_IlkHarfBuyukMethodForeach {
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

    public static String adSoyadIlkHarfiBuyut(String adSoyad) {

        String[] yeniAdSoyad = adSoyad.split(" ");

        String yeniad = "";
        String isimParcasi = "";

        for (int i = 0; i < yeniAdSoyad.length; i++) {

            isimParcasi = yeniAdSoyad[i].substring(0, 1).toUpperCase() +
                          yeniAdSoyad[i].substring(1).toLowerCase();
            yeniad += (isimParcasi + " ");
        }

        return yeniad;
    }

}