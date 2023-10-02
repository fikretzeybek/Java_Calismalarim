package F07;

public class F08_TekCiftWhile {
    //While döngüsü kullanarak 0 ile 1000 arasında kaç tane tek,
    //kaç tane çift sayı olduğunu bulup ekrana yazdırınız

    public static void main(String[] args) {
        int sayac = 0;
        int tekSayac = 0;
        int ciftSayac = 0;

        while (sayac <= 1000) {
            if (sayac % 2 == 0) {
                ciftSayac++;
            } else {
                tekSayac++;
            }
            sayac++;
        }
        System.out.println("Tek sayilarin adedi = " + tekSayac + "\nCift sayilarin adedi = " + ciftSayac);

    }
}
