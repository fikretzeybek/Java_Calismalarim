package Day1;

import java.util.Scanner;

public class IkiSayiArasiToplama {
    public static void main(String[] args) {
        //Soru 4- Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin,
        //        sinirlar dahil olarak aralarindaki tum sayilarin toplamini yazdirin.
        //        Bitis degeri baslangic degerinden kucuk olsa da program calissin

        Scanner scanner = new Scanner(System.in);

        System.out.println("Baslangic degeri giriniz");
        int first = scanner.nextInt();
        System.out.println("Bitis degeri giriniz");
        int secand = scanner.nextInt();

        int toplam = 0;

        if(secand > first){
            for (int i = first; i <= secand ; i++) {
                toplam += i;
            }

        }else if (first > secand){
            for (int i = secand; i <= first ; i++) {
                toplam += i;
            }
        }

        System.out.println("toplam : " + toplam);

    }

}
