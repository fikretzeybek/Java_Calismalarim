package F01;

import java.util.Scanner;

public class F05_FaktoriyelYazdirma {
    public static void main(String[] args) {
        //Soru 6- Kullanicidan 20’den kucuk bir sayi alip,
        // bu sayinin faktoryel degerini hesaplayin.
        // Konsolda faktoryel hesabinin yapilisini da yazdirin.
        // Or : 6! = 6 * 5 * 4 * 3 * 2 * 1 = 720

        Scanner scanner = new Scanner(System.in);

        System.out.println("Sayi giriniz");
        int sayi = scanner.nextInt();
        int faktoriyel = 1;

        if (sayi <= 20) {
            for (int i = sayi; i >= 1; i--) {

                faktoriyel *= i;


            }
            System.out.print(sayi + "! =" + " * " + faktoriyel);

        } else {

            System.out.println("Hatali giris yaptiniz, sayi 20 den kucuk olmalidir");
        }


    }
}
