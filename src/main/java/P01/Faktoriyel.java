package day09_ForLoopsveMethodOlusturma;

import java.util.Scanner;

public class Faktoriyel {
    public static void main(String[] args) {
        //Soru 5- Kullanicidan 20’den kucuk bir sayi alip,
        // bu sayinin faktoryel degerini hesaplayin.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen faktoriyelini ogrenmek istediginiz 20 den kucuk bir sayi giriniz");
        long sayi = scanner.nextLong();

        long faktoriyelSonuc = 1;

        if (sayi <= 20) {
            for (long i = sayi; i >= 1; i--) {

                faktoriyelSonuc *= i;

            }
            System.out.println("Girdiginiz sayinin faktoriyel degeri : " +faktoriyelSonuc);

        } else {
            System.out.println("Hatali giris yaptiniz, sayi 20 den kucuk olmalidir");
        }


    }
}
