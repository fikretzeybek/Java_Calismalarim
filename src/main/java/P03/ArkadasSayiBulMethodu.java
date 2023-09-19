package P03;
public class ArkadasSayiBulMethodu {

    public static void main(String[] args) {
        int aralikBaslangic = 1;
        int aralikBitis = 10000; // İstediğiniz aralığı burada ayarlayabilirsiniz.

        arkadasSayiBulalim(aralikBaslangic, aralikBitis);
    }

    public static void arkadasSayiBulalim(int baslangic, int bitis) {
        for (int i = baslangic; i <= bitis; i++) {
            int potansiyelArkadas = toplamBolenler(i);
            if (i < potansiyelArkadas && toplamBolenler(potansiyelArkadas) == i) {
                System.out.println(i + " ve " + potansiyelArkadas + " arkadas sayilardir.");
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
