package F10;

public class F01_Student {

    String ad = "Atanmadi ";
    String soyAd = "Atanmadi";
    String sinif = "Atanmadi   ";
    int no ;

   /* veya yazılarak atamalar daha sonra da yapılabiliyor
     String ad ;
     String soyAd ;
     String sinif ;
     int  no ;    */

    public F01_Student() {//Student1 ve Student4
        //System.out.println("F01_Student class' ini constructor' i calisti");
    }

    F01_Student(String ad, String soyAd, String sinif, int no) {//Student5
        this.ad = ad;
        this.soyAd = soyAd;
        this.sinif = sinif;
        this.no = no;
    }

    public F01_Student(String ad, String soyAd, String sinif) {//Student3
        this.ad = ad;
        this.soyAd = soyAd;
        this.sinif = sinif;
        no = 234;

    }

    public F01_Student(String ad, String soyAd) {//Student2
        this.ad = ad;
        this.soyAd = soyAd;
        sinif = "10-B       ";
        no = 256;

    }



    public String toString() {
        return  "Ad :" + ad +
                "  Soyad :" + soyAd +
                "  Sınıf :" + sinif +
                "No :" + no;


    }


}
