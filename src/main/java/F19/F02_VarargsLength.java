package F19;

public class F02_VarargsLength {
    public static void main(String[] args) {

       methodA(1,2,3,4,5);//3

    }
    public static void methodA(int i, int j, int... k) {


        System.out.println(k.length);

    }


}
