package F02;

import java.util.Scanner;

public class asalmi {


        public static void main(String[] args) {

            while (true) {
                if (!asalMiMethod()) {
                    System.out.println("Döngü sonlandırıldı.");
                    return;
                }
            }

        }

        public static boolean asalMiMethod() {

            Scanner scanner = new Scanner(System.in);
            System.out.print("Bir sayi giriniz ");
            System.out.println("(0 girdiğinizde döngü sonlanacaktir.) :");
            int sayi = scanner.nextInt();

            if (sayi == 0) {
                return false; // sayı 0 ise döngüyü sonlandır
            }

            boolean asalMi = sayi == 2;

            for (int i = 2; i < sayi; i++) {

                if (sayi % i == 0) {
                    asalMi = false;
                    break;
                } else {
                    asalMi = true;
                }

            }

            if (asalMi) {
                System.out.println(sayi + " Sayisi Asal Sayidir");
            } else {
                System.out.println(sayi + " Sayisi Asal Degildir");
            }

            return true; // döngüyü devam ettir


        }
    }


