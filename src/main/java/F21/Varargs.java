package F21;

public class Varargs {

    static void islemTest(int  ...  sayi) {

        //int...sayilar = 1,2,3,7,8,9; Method icinde kullanim YOK

        System.out.println(sayi.length);
        System.out.println(sayi[1]);
    }


    public static void main(String[] args) {

islemTest(1,3);
        System.out.println("-----------");
islemTest(4,1,3);
        System.out.println("-----------");
islemTest(3,3,8,9,5,8);
    }
    //array alt yapisi örnek
}

