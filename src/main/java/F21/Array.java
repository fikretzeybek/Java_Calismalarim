package F21;

public class Array {

    public static void main(String[] args) {


        islemYap(3, 4, 5, 8, 1, 2); // 60


    }

    private static void islemYap(int... sayilar) {

        System.out.println(sayilar.length);

        int toplam = 0;

        for (int i = 1; i < sayilar.length; i++) {

            toplam += sayilar[i];

        }
        System.out.println(toplam * sayilar[sayilar.length - 1]);
    }
}