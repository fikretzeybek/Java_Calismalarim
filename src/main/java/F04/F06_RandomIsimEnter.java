package F04;

import java.util.Random;
import java.util.Scanner;

public class F06_RandomIsimEnter {
    public static void main(String[] args) {
        String[] isimlerDizi = {"Ahmet", "Omer", "Mehmet", "Elif", "Deniz", "Berivan", "Suleyman", "Samet"};
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter tuşuna basın veya 0 tuşuna basarak çıkın:");
            String giris = scanner.nextLine();

            if (giris.equals("0")) {
                System.out.println("Çıkılıyor...");
                break;
            } else if (giris.isEmpty()) {
                int kacinciEleman = random.nextInt(isimlerDizi.length);
                System.out.println("Rastgele seçilen isim: " + isimlerDizi[kacinciEleman]);
            }
        }

    }
}