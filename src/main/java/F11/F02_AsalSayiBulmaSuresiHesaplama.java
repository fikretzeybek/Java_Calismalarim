package F11;

import java.time.LocalTime;
import java.util.Scanner;

public class F02_AsalSayiBulmaSuresiHesaplama {

    public static void main(String[] args) {

        LocalTime localTime = LocalTime.now();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Lutfen bir sayi giriniz : ");
        int sayi = scanner.nextInt();

        System.out.println("1 ile " + sayi + " arasındaki asal sayılar:");

        System.out.println("loop basinda locatime : " + localTime);
        LocalTime baslangic = LocalTime.now();
        System.out.println("Baslangic : " + baslangic);
        System.out.println("Baslangicta nano saniye : " + baslangic.toNanoOfDay());

        for (int i = 2; i <= sayi; i++) {
            if (isAsal(i)) {
                System.out.print(i + " ");
            }
        }


        System.out.println("loop sonunda locatime : " + localTime);
        LocalTime bitis = LocalTime.now();
        System.out.println("Bitis : " + bitis);
        System.out.println("Bitiste nano saniye : " + bitis.toNanoOfDay());

        System.out.println("Islem suresi " + (bitis.toNanoOfDay() - baslangic.toNanoOfDay()) + " nanosaniye");
        System.out.println("Islem suresi " + (bitis.toNanoOfDay() - baslangic.toNanoOfDay())/1000000000 + " saniye");
    }

    // Bir sayının asal olup olmadığını kontrol eden fonksiyon
    public static boolean isAsal(int sayi) {
        if (sayi <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(sayi); i++) {
            if (sayi % i == 0) {
                return false;
            }
        }

        return true;

    }
}

