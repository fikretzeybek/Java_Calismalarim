package F01;

import java.util.Scanner;

public class F07_RakamlarToplami {
    public static void main(String[] args) {
        //Soru 7- Kullanicidan pozitif bir tamsayi alip,
        //         rakamlar toplamini yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tam sayi giriniz");
        int girilenSayi = scanner.nextInt();

        int rakamlarToplami = 0;
        int rakam = 0;


        for (int i = girilenSayi; i > 0; i /= 10) {

            rakam = i % 10;
            rakamlarToplami += rakam;

        }

        System.out.println("Rakamlar Toplami = " + rakamlarToplami);

    }

}
