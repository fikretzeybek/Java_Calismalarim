package F19;

public class F03_ {

    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("OCAJP8");


        sb1.subSequence(2, 4);// yazdırırsak AJ yazdırır ama kalıcı olmaz,
        //System.out.println(sb1.subSequence(2, 4));


        sb1.deleteCharAt(3);// 3. index'tekini kalıcı siler

        sb1.reverse( );//StringBuilder i ters çevirir

        System.out.println(sb1);// degistirilmis halini yazdirir

    }
}
