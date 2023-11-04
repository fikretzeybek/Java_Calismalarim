package F34_Pratik_01;

public class F01_dortİslemMethodu {

    public static void main(String[] args) {
        // Parametre olarak gönderilen 2 sayi ile
        // toplama,carpma,cikarma,bolme islemlerinin yapılarak
        // ekrana yazdirilacagi 4 method olusturun

        topla(30, 20);
        carp(30, 20);
        cikar(30,20);
        bol(30,20);
    }

    public static void topla(int a, int b) {
        int toplama = a + b;
        System.out.println(toplama);

    }

    public static void carp(int a, int b) {
        int carpma = a * b;
        System.out.println(carpma);
    }

    public static void cikar(int a, int b) {
        int fark = a - b;
        System.out.println(fark);

    }
    public static void bol(double a, double b){
        double bolme = a/b;
        System.out.println(bolme);
    }
}
