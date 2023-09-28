package P05;

public class MethodOlusturma {

    //Soru 1- Kullanicidan input olarak verilen bir String,
    //        baslangic ve bitis indexlerine gore
    //        baslangic index'i dahil, bitis index'i haric olacak sekilde
    //        aradaki harfleri yazdiran bir method olusturun.
    //
    //          - kullanici baslangic degeri olarak,
    //          bitis degerinden buyuk bir sayi girerse, hata mesaji verin
    //          - kullanici str'da olan index'lerden daha buyuk bir index girerse
    //          hata mesaji yazdirin.

    public static void main(String[] args) {

        sonMetin("Yaktin bizi Java", 7,15);
        sonMetin("Hic ogrenemiyor gibiyim", 9,4);
        sonMetin("Hersey yavas yavas olacak",9,29);



        String str = "Bu hamur daha cok su alir";
        sonMetin(str,4,11);


    }

    public static void sonMetin(String metin, int basIndex, int bitIndex) {

        if (basIndex > bitIndex) {
            System.out.println("Baslangic index' i bitis index' inden buyuk olamaz");
        } else if (basIndex >= metin.length() || bitIndex >= metin.length()) {
            System.out.println("Girilen index sinirlarin haricindedir ");
        } else {

            for (int i = basIndex; i < bitIndex ; i++) {
                System.out.print(metin.charAt(i));

            }
            System.out.println("");
        }

        System.out.println("");
    }



}
