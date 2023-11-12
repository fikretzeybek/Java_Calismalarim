package F19;

  public class Okul {

    protected String okulIsmi = "Yildiz koleji";

    protected String telefon = "333";

    private String sifre = "xy12345z";

    String giris = "234";

    // baska class' dan PRIVATE' a ulasma ve yazdirma
    // kodu 1 sifre methodu, 1 yazdirma methodu

    public void sifre(String sfr){

        sifre = sfr;
    }
    public void sifreYazdir(){

        System.out.println("Şifre : " + sifre);
    }
}

