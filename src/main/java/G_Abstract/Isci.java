package G_Abstract;

public class Isci extends Muhasebe {




    public String toString() {
        return "==Isci==" +
                "\nisim= " + isim +
                "\nsoyisim= " + soyisim +
                "\ntcNo= " + tcNo +
                "\ntelefon= " + telefon +
                "\niseBaslamaTarihi= " + iseBaslamaTarihi +
                "\nsigortaNo= " + sigortaNo +
                "\npersonelNo= " + personelNo +
                "\nsirket ismi= " + sirketIsmi +
                "\nsirket adresi= " + sirketAdresi +
                "\nsaatUcreti= " + saatUcreti +
                "\naylikCalismaSuresi= " + aylikCalismaSuresi +
                "\nmaas= " + maas;


    }

    public static void main(String[] args) {

        Isci isci1 = new Isci();
        isci1.saatUcreti = isci1.saatUcreti();
        isci1.aylikCalismaSuresi = isci1.aylikCalismaSuresi();
        isci1.maas = isci1.maas(isci1.saatUcreti, isci1.aylikCalismaSuresi);
        isci1.isim = "Hasan";
        isci1.soyisim = "Can";
        System.out.println(isci1);

    }

    @Override
    protected int saatUcreti() {
        return 0;
    }

    @Override
    protected int aylikCalismaSuresi() {
        return 0;
    }
}
