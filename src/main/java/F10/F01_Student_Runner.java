package F10;

public class F01_Student_Runner {

    public static void main(String[] args) {

        F01_Student student1 = new F01_Student();

        student1.ad = "Ali      ";
        student1.soyAd = "Can     ";
        student1.sinif = "10-D       ";
        student1.no = 325;
        System.out.println("Student1 : " + student1);

        F01_Student student2 = new F01_Student("Gultekin ","Serdar  ");
        System.out.println("Student2 : " + student2);

        F01_Student student3 = new F01_Student("Cihangir ","Korkut  ","10-C       ");
        System.out.println("Student3 : " + student3);

        F01_Student student4 = new F01_Student();
        System.out.println("Student4 : " + student4);

        F01_Student student5 = new F01_Student("Nevzat   ","Karacan ","10-A       ",128);
        System.out.println("Student5 : " + student5);








    }

}
