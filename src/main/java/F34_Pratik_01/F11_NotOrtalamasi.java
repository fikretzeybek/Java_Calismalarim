package F34_Pratik_01;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class F11_NotOrtalamasi {

    public static void main(String[] args) {



        Scanner scanner = new Scanner(System.in);
        List<Double> notlarListesi = new ArrayList<>();
        double notlarToplami = 0;
        double ortalamaNot;
        int ortalamaUstundekiOgrenciSayisi = 0;
        double not;
        boolean devamEdeyimMi = true;

        do {
            System.out.println("Lutfen notlari giriniz :\nBittiğinde cikmak icin Q' ya basiniz : ");
            try {
                not = scanner.nextDouble();
                if (not<0 || not>100){
                    throw new IllegalArgumentException();
                }
                notlarListesi.add( not);
                notlarToplami += not;
            } catch (InputMismatchException e) {
                String hocaMetin = scanner.nextLine();
                if (hocaMetin.equalsIgnoreCase("q")){
                    devamEdeyimMi = false;
                }else {
                    System.out.println("Not girisi yanlis : ");
                }
            }catch (IllegalArgumentException e){
                System.out.println("Hadi leeen dalgamı geçyonggg  :))");
            }

        }while(devamEdeyimMi);

        ortalamaNot =notlarToplami / notlarListesi.size();

        for (double each : notlarListesi
             ) {
            if (each >= ortalamaNot){
                ortalamaUstundekiOgrenciSayisi ++;
            }
        }
        System.out.println("Not girilen ogrenci sayisi : " + notlarListesi.size()
                          + "\nNot ortalamasi : " + ortalamaNot
                          + "\nOrtalama ustundeki ogrenci sayisi : " + ortalamaUstundekiOgrenciSayisi);


    }

}
