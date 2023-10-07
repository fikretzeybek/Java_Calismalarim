package F13;

import java.util.Scanner;

public class F06_AradakiSayilarinToplami {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        int toplam = 0;

        while (true) {
            System.out.print("Lütfen başlangıç değerini giriniz : ");
            int baslangic = scanner.nextInt();
            System.out.print("Lütfen bitiş değerini giriniz : ");
            int bitis = scanner.nextInt();

            if (bitis <= baslangic) {
                System.out.println("İkinci sayı birinci sayıya eşit veya küçük olamaz, lütfen sayıları tekrar giriniz :");

            } else {
                for (int i = baslangic; i <= bitis; i++) {
                    toplam += i;
                }
                System.out.println(baslangic + " ile " + bitis + " arasındaki sayıların toplamı: " + toplam);
                break;
            }
        }

    }
}
