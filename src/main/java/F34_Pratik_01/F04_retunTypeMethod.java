package F34_Pratik_01;

public class F04_retunTypeMethod {

    public static void main(String[] args) {
        /*
        return tipi "int" olan ve kendisine gönderilen 2 tane tamsayı parametresini
        kullanarak işlem yapan aşağıdaki isimlerde dört tane method oluşturun
        toplama (int sayi1, int sayi2)
        cikarma(int sayi1, int sayi2)
        carpma (int sayi1, int sayi2)
        bolme (int sayi1, int sayi2)
                                                */
        System.out.println(toplamaYap(3,7));
        System.out.println(cikarmaYap(3,7));
        System.out.println(carpmaYap(3,7));
        System.out.println(bolmeYap(21,7));

    }

    public static int toplamaYap(int sayi1, int sayi2) {

        return sayi1 + sayi2;
    }

    public static int cikarmaYap(int sayi1, int sayi2) {

        return sayi1 + sayi2;
    }

    public static int carpmaYap(int sayi1, int sayi2) {

        return sayi1 * sayi2;
    }

    public static double bolmeYap(double sayi1, double sayi2) {

        return sayi1 /sayi2;
    }
}
