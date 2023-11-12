package F01;

import java.util.Scanner;

public class F13_CarpimTablosuBasCalistir {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Çarpım tablosu için bir sınır değeri girin (1-10 arası): ");
        int sinir = scanner.nextInt();

        if (sinir < 1 || sinir > 10) {
            System.out.println("Geçersiz sınır değeri. 1-10 arasında bir sayı girin.");
            return;
        }

        for (int i = 1; i <= sinir; i++) {
            System.out.println(i + " çarpım tablosu:");
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
                if (j < 10) {
                    System.out.print("Devam etmek için ENTER tuşuna basın...");
                    scanner.nextLine(); // Kullanıcının ENTER tuşuna basmasını bekler
                }
            }
            System.out.println(); // Her grup sonunda bir satır boşluk bırakır
        }

        scanner.close();
    }
}
