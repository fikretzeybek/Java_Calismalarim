package F10;

public class Runner {

    public static void main(String[] args) {

        Student student1 = new Student();

        student1.ad = "Ali      ";
        student1.soyAd = "Can     ";
        student1.sinif = "10-D       ";
        student1.no = 325;
        System.out.println("Student1 : " + student1);

        Student student2 = new Student("Gultekin ","Serdar  ");
        System.out.println("Student2 : " + student2);

        Student student3 = new Student("Cihangir ","Korkut  ","10-C       ");
        System.out.println("Student3 : " + student3);

        Student student4 = new Student();
        System.out.println("Student4 : " + student4);

        Student student5 = new Student("Nevzat   ","Karacan ","10-A       ",128);
        System.out.println("Student5 : " + student5);








    }

}
