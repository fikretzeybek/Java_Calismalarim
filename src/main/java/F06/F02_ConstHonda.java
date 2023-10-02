package F06;

public class F02_ConstHonda {

    int fiyat = 20000;

    int yil = 2020;

    String marka = "Honda";

    public static void main(String[] args) {

        F02_ConstHonda hondaAraba = new F02_ConstHonda( );

        System.out.println(hondaAraba.fiyat);

        System.out.println(hondaAraba.yil - 3);

        System.out.println(hondaAraba.marka.replace("H", "K"));

    }

}