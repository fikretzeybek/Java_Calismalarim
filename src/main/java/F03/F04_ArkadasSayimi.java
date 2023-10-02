package F03;

import java.util.Scanner;

public class F04_ArkadasSayimi {
    public static void main(String[] args) {

       //girilen aralıktaki arkadas sayilarini yazdiralim

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen baslangic ve bitis olarak sayi araligi giriniz :");
        int aralikBaslangic = scanner.nextInt();
        int aralikBitis = scanner.nextInt();

        F02_ArkadasSayiBulMethodu.arkadasSayiBulalim(aralikBaslangic, aralikBitis);





    }
}
