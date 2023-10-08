package F14;

public class F03_TekBoyutluCarpma {
    public static void main(String[] args) {
        /*
            1 x 1 = 1
            1 x 2 = 2
            1 x 3 = 3
            1 x 4 = 4
            1 x 5 = 5
            1 x 6 = 6
            1 x 7 = 7
            1 x 8 = 8
            1 x 9 = 9
            1 x 10 = 10
            Yuarıdaki çarpım tablosunu 10 a kadar ekrana yazdırınız.
            */

        int sabitSayi = 1;
        int carpanSayi = 1;

        for (int i = 1; i <= 10; i++) {
            carpanSayi = i;
            int carpim = sabitSayi * carpanSayi;
            System.out.println(sabitSayi + " * " + carpanSayi + " = " + carpim);
        }

    }
}
