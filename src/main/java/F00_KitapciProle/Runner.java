package F00_KitapciProle;

import F00_KitapciProle.Islemler;
import F00_KitapciProle.Menu;

import java.time.LocalDateTime;

public class Runner {

    public static void main(String[] args) {
        Islemler islemler=new Islemler();
        kitapci_project.Kitap kitap1=new kitapci_project.Kitap(1000,"SERENAD","ZÜLFÜ LİVANELİ",150, LocalDateTime.now());
        islemler.kitapList.add(kitap1);
        kitapci_project.Kitap kitap2=new kitapci_project.Kitap(1001,"EMPATİ","ADAM FAWER",200, LocalDateTime.now());
        islemler.kitapList.add(kitap2);
        kitapci_project.Kitap kitap3=new kitapci_project.Kitap(1002,"MELEKLER VE ŞEYTANLAR","DAN BROWN",170, LocalDateTime.now());
        islemler.kitapList.add(kitap3);
        kitapci_project.Kitap kitap4=new kitapci_project.Kitap(1003,"BEYAZ ZAMBAKLAR ÜLKESİNDE","GRİGORİY PETROV",100, LocalDateTime.now());
        islemler.kitapList.add(kitap4);
        kitapci_project.Kitap kitap5=new kitapci_project.Kitap(1004,"UÇURTMA AVCISI","KHALED HOSSEİNİ",150, LocalDateTime.now());
        islemler.kitapList.add(kitap5);
        Menu menu = new Menu();
        menu.liste();
    }
}
