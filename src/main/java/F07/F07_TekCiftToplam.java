package F07;

public class F07_TekCiftToplam {

    public static void main(String[] args) {
        //0 ile 100 arasındaki tek ve çift sayıların toplamlarını
        //ayrı ayrı ekrana yazdıran bir program:

        int sayac = 0;
        int tekSayac = 0;
        int ciftSayac = 0;

        while (sayac <= 100) {
            if (sayac % 2 == 0)
                ciftSayac += sayac;
            else tekSayac += sayac;
            sayac++;
        }
        System.out.println("Tek sayilar toplami = " + tekSayac + "\nCift sayilar toplami = " + ciftSayac);

    }

}
