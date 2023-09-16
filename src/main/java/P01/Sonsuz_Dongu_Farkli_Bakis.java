package P01;

public class Sonsuz_Dongu_Farkli_Bakis {
    public static void main(String[] args) {

        int carpim = 1;

        int sayi = 1;

        while(sayi<5) {

            carpim = carpim * sayi;

            carpim++;

        }
        System.out.println(carpim);;

    }
}// bu hali ile kodda problem olmadigi icin calisiyor
// ama konsolda bir sey gostermiyor, BU BIZI YANILTMASIN
// KOD CALISIYOR, AMA SONSUZ DONGU OLUSUYOR,
// Zira, (bu ornek ozelinde) sayi<5 sartı her zaman True
// verecegi icin calisma hic bitmeyecek!!!
