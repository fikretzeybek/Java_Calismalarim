package P03;

public class DizedeElemanArama {
    public static void main(String[] args) {
        // Soru 4- Verilen bir array’de istenen bir elemanin
        // var olup olmadigini ve  varsa kac kere
        // kullanildigini yazdiran bir method olusturun

        int [] dize = {3,4,2,6,5,4,3,6,2,0,1,5,7,8,2,3,};
        int arananSayi = 3;

        elemanVarmiYazdir(dize,0);
        elemanVarmiYazdir(dize,3);
        elemanVarmiYazdir(dize,4);
        elemanVarmiYazdir(dize,9);




    }
    public static void elemanVarmiYazdir(int[] dize , int arananSayi ){

        int sayac = 0;

        for (int i = 0; i < dize.length; i++) {

            if (dize[i] == arananSayi){
                sayac ++;
            }

        }
        if (sayac == 0){
            System.out.println("Aranan sayi arrayde yoktur.");
        }else {
            System.out.println("Aranan sayi arrayde " +sayac + " defa kullanilmiştir.");
        }



    }
}
