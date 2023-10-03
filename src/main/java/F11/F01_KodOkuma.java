package F11;

public class F01_KodOkuma {

    String isim="Ali";
    int yas=25;

    public static void main(String[] args) {
        F01_KodOkuma obj1=new F01_KodOkuma("Eylul");
        F01_KodOkuma obj2=new F01_KodOkuma("Zehra",32);
        F01_KodOkuma obj3=new F01_KodOkuma();

    }

    public F01_KodOkuma(String isim){
        isim="Metin";
        System.out.println("isim: "+isim);
    }
    public F01_KodOkuma(){
        this("Tugce");
        this.yas=30;
        System.out.println("isim: "+isim);
    }
    public F01_KodOkuma(String isim, int yas){
        this("Neslihan");
        this.yas=45;

    }


}