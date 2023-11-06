package F34_Pratik_01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class F13_BasitToplama {

    public static void main(String[] args) {

        Scanner giris = new Scanner(System.in);

        int top = 0;
        int sayi = 0;

        do {
            System.out.println("Sıfırdan farklı sayı giriniz : ");
            try {
                sayi = giris.nextInt();
                top = top + sayi;

                System.out.println("Sayı girişine devam ediniz: Cıkış için 0 giriniz : ");

                sayi = giris.nextInt();

            } catch (InputMismatchException e) {
                System.out.println("Sayi girmeniz gerekirdi, naptınız Allah bilir ! ");
                break;
            }

        } while (sayi != 0);

        System.out.println("Toplam = " + top);

    }
}