package F08;

import java.util.Scanner;

public class F04_GirilenSayiyaKadarOlanAsalSayilar {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Lutfen bir sayi giriniz : ");
        int sayi = scanner.nextInt();

        System.out.println("1 ile " + sayi + " arasındaki asal sayılar:");

        for (int i = 2; i <= sayi; i++) {
            if (isAsal(i)) {
                System.out.print(i + " ");
            }
        }
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
