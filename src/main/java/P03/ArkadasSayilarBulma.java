package P03;

public class ArkadasSayilarBulma {

    public static void main(String[] args) {
        int aralikBaslangic = 1;
        int aralikBitis = 10000; // İstediğiniz aralığı burada ayarlayabilirsiniz.

        for (int i = aralikBaslangic; i <= aralikBitis; i++) {

            int arkadasMi = toplamBolenler(i);

            if (i < arkadasMi && toplamBolenler(arkadasMi) == i) {
                System.out.println(i + " ve " + arkadasMi + " arkadaş sayılardır.");
            }
        }
    }
    public static int toplamBolenler(int sayi) {
        int toplam = 0;
        for (int i = 1; i <= sayi / 2; i++) {
            if (sayi % i == 0) {
                toplam += i;
            }
        }
        return toplam;
    }
}
