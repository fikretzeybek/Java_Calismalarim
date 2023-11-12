package F03;

import java.util.Scanner;

public class F07_MukemmelSayi {
    public static void main(String[] args) {
        // kullanicidan aldiginiz sayinin mukemmel sayi
        // olup olmadiginin yazdiran bir kod yaziniz
        // mukemmel sayi==> pozitif bolenlerinin toplami kendine esit olan sayidir
        // 6--> 1,2,3
        // 28--> 1,2,4,7,14 gibi

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tam sayi giriniz");
        int sayi = scanner.nextInt();
        int toplam = 0;

        for (int i = 1; i < sayi; i++) {
            if (sayi % i == 0){
               toplam += i;

            }

        }
        if (toplam == sayi){
            System.out.println(sayi + " Mukemmel bir sayidir");
        }else {
            System.out.println(sayi +" Mukemmel bir sayi degildir");
        }

    }
}
