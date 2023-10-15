package F18;

public class Employee {
    int no, yas;
    String isim, adres;

    public Employee(int yas) {
        this.yas = yas;
    }

    public Employee(int no, int yas) {
        this(yas);
        this.no = no;
    }

    public Employee(int no, int yas, String isim, String adres) {
        this(no, yas);
        this.isim = isim;
        this.adres = adres;
    }

    public static void main(String args[]) {
        Employee emp = new Employee(105, 22, "Vedat", "Bursa");
        //Employee emp2 = new Employee(123,34);
        System.out.println("NO: " + emp.no + " Isim:" + emp.isim + " Yas:" + emp.yas + " Adres: " + emp.adres);
        //System.out.println("Yas : " + emp2.yas +"  NO : "+ emp2.no);
    }

}