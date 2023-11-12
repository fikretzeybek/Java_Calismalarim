package F19;

public class F01_VarargsLength {


    public int blMethod(boolean b1, boolean... b2) {
        return b2.length;
    }

    public static  void main(String[] args) {


        F01_VarargsLength bl = new F01_VarargsLength();

        int sonuc = bl.blMethod(true, false, false, false);

        System.out.println("Sonuç : " + sonuc);
    }



}