package F14;

import java.util.Scanner;

public class F04_MukSayi {
    public static void main(String[] args) {
        /*
    Bir sayinin mükemmel olup olmadiğini bulan bir method yaziniz.
    Mükemmel sayi : bir sayinin kendisi hariç bölenlerinin toplamı, kendisine eşitse o sayi mükemmeldir.
    ORNEK:
    INPUT     : 6
    OUTPUT : 1,2,3
                  1+2+3 = 6 = 6 (Mükemmel)

                  mukemmel sayi kontrolu
                  1. kullanicidan sayi alalim
                  2. bir toplam degiskeni olusturuyoruz
                  3. sayinin bolenleri bul
                  4. bolenleri toplamla topla
                  5. sayiyla toplamin esitligini kontrol et
                                                                    */


        mukemmelSayiBul();

    }

    public static void mukemmelSayiBul() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mukemmel sayi olup olmadigini ogrenmek istediginiz sayiyi giriniz : ");
        int alinanSayi = scanner.nextInt();

        int toplam = 0;

        for (int i = 1; i < alinanSayi; i++) {
            if (alinanSayi % i == 0) {
                toplam += i;
            }
        }
        if (toplam == alinanSayi) {
            System.out.println(alinanSayi + " sayisi mukemmel sayidir ");
        } else {
            System.out.println(alinanSayi + " sayisi mukemmel sayi degildir ");
        }

    }

}
