package P06;

public class ConstHonda {

    int fiyat = 20000;

    int yil = 2020;

    String marka = "Honda";

    public static void main(String[] args) {

        ConstHonda hondaAraba = new ConstHonda( );

        System.out.println(hondaAraba.fiyat);

        System.out.println(hondaAraba.yil - 3);

        System.out.println(hondaAraba.marka.replace("H", "K"));

    }

}