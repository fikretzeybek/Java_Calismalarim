package F05;

public class VariableArguments {
    public static void main(String[] args) {

        System.out.println(toplamaYap(1, 7, 8, 5, 3, 4, 11, 12));

        String donenSehir =  sehirDondur().substring(1,5);

        System.out.println(donenSehir);




        modAl();



    }

    public static int toplamaYap(int... sayilar) {

        int toplam = 0;

        for (int sayi : sayilar) {

            toplam += sayi;

        }

        return toplam;
    }

    public static String sehirDondur() {

        return "Istanbul";
    }

    public static void modAl() {

        int sayi = 25;

        sayi = sayi % 7;


    }


}
