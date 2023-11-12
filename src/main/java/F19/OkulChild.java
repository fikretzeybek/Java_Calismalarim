package F19;

 public class OkulChild extends Okul {
    String sinif = "11-F";
    String telefon = "111";

    OkulChild(String telefon) {

        System.out.println(telefon);
        System.out.println(this.telefon);
        System.out.println(super.telefon);
        //System.out.println(super.sifre);
        System.out.println(super.giris);
        sifreYazdir();
    }


    public static void main(String[] arg) {

        OkulChild obj = new OkulChild("222");
    }
}
