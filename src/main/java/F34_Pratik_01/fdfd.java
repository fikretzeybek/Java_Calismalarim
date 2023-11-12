package F34_Pratik_01;

public class fdfd {


    // bir array icerisinde aranan "data" nin
    // olup olmadigini konsola yazdiran bir metod olusturun

    static int[] arr = {1, 3, 6, 8, 9, 4, 0};


    public static void main(String[] args) {

        varMi(arr, 9);


    }

    private static void varMi(int[] arr, int aranan) {

        boolean flag = false;

        for (int each : arr) {

            if (each == aranan) {

                flag = true;
                break;

            }
        }
        if (flag == true) System.out.println("Aranan sayı var");

        else if (flag == false) System.out.println("Aranan sayi yok");


    }

}