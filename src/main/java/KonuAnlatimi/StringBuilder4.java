package KonuAnlatimi;

public class StringBuilder4 {

    public static java.lang.StringBuilder work(java.lang.StringBuilder a,
                                               java.lang.StringBuilder b) {
        a = new java.lang.StringBuilder("a");
        b.append("b");
        return a;
    }
    public static void main(String[] args) {
        java.lang.StringBuilder s1 = new java.lang.StringBuilder("s1");
        java.lang.StringBuilder s2 = new java.lang.StringBuilder("s2");
        java.lang.StringBuilder s3 = work(s1, s2);
        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
        System.out.println("s3 = " + s3);
    }
}