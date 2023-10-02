package F02;

import java.util.Scanner;

public class F03_AsalSayiKontrol {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayi giriniz: ");
        int sayi = scanner.nextInt();

        if (sayi == 0) {
            System.out.println("Girdiğiniz sayı 0, program sonlandırıldı.");
        } else {
            boolean asalMi = isAsal(sayi);

            String sonuc = asalMi ? "Asal Sayidir" : "Asal Degildir";
            System.out.println(sayi + " Sayisi " + sonuc);
        }

        scanner.close();
    }

    public static boolean isAsal(int sayi) {
        if (sayi <= 1) {
            return false;
        }

        if (sayi <= 3) {
            return true;
        }

        if (sayi % 2 == 0 || sayi % 3 == 0) {
            return false;
        }

        for (int i = 5; i * i <= sayi; i += 6) {
            if (sayi % i == 0 || sayi % (i + 2) == 0) {
                return false;
            }
        }

        return true;
    }
}
