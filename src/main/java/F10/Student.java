package F10;

public class Student {

    String ad = "Girilmedi ";
    String soyAd = "Girilmedi";
    String sinif = "Girilmedi   ";
    int no ;

   /* veya yazılarak atamalar daha sonra da yapılabiliyor
     String ad ;
     String soyAd ;
     String sinif ;
     int  no ;    */

    public Student() {//Student1 ve Student4

    }

    Student(String ad, String soyAd, String sinif, int no) {//Student5
        this.ad = ad;
        this.soyAd = soyAd;
        this.sinif = sinif;
        this.no = no;
    }

    public Student(String ad, String soyAd, String sinif) {//Student3
        this.ad = ad;
        this.soyAd = soyAd;
        this.sinif = sinif;
        no = 234;

    }

    public Student(String ad, String soyAd) {//Student2
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
