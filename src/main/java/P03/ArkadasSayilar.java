package P03;
public class ArkadasSayilar {

    public static void main(String[] args) {
        int sayi1 = 220;
        int sayi2 = 284;

        if (arkadasSayiMi(sayi1, sayi2)) {
            System.out.println(sayi1 + " ve " + sayi2 + " arkadaş sayılardır.");
        } else {
            System.out.println(sayi1 + " ve " + sayi2 + " arkadaş sayı değildir.");
        }
    }

    public static boolean arkadasSayiMi(int sayi1, int sayi2) {
        int toplam1 = toplamBolenler(sayi1);
        int toplam2 = toplamBolenler(sayi2);

        return (toplam1 == sayi2) && (toplam2 == sayi1);
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
