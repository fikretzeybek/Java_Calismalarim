package F34_Pratik_01;

import java.util.Scanner;

public class F06_faktoriyelDongu {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Faktoriyel hesabı için bir sayı giriniz, çıkış için 0' a basınız : ");
            int girilenSayi = scanner.nextInt();
            if (girilenSayi == 0) {
                break;
            }

            long faktoriyel = 1;
            System.out.println("Faktöriyel Hesaplamaları:");

            for (int i = 1; i <= girilenSayi; i++) {
                faktoriyel *= i;
                System.out.print("1");
                for (int j = 2; j <= i; j++) {
                    System.out.print(" * " + j);
                }
                System.out.println(" = " + faktoriyel);
            }
        }

    }
}

