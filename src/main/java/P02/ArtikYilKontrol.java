package P02;

import java.util.Scanner;

public class ArtikYilKontrol {
    public static void main(String[] args) {
        /*
    Soru ) Interview Question
    Kullanicidan artik yil olup olmadigini kontrol
    etmek icin yil girmesini isteyin.
    Kural 1: 4 ile bolunen yillar artik yildir
    Kural 2: 4 ile bolunup 100 ile bolunemeyen yillar artik yildir
    Kural 3: 4’un kati olmasina ragmen 100 ile bolunebilen yillardan
    sadece 400’un kati olan yillar artik yildir
     */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen yil giriniz :");
        int yil = scanner.nextInt();



        String artikYilMi = yil % 100 == 0 ? yil % 400 == 0 ? "Artik yildir " : "Artik yil degildir " :
                yil  % 4 == 0 ? "Artik yildir " : "Artik yil degildir " ;
        System.out.println(artikYilMi);

        System.out.println("If_ElseIf_Statements ile cozum");

        if (yil % 4 == 0 && yil % 100 != 0){
            System.out.println("Artik yildir");

        } else if (yil % 100 == 0 && yil % 400 == 0) {
            System.out.println("Artik yildir");

        }else {
            System.out.println("Artik yil degildir ");
        }


    }
}
