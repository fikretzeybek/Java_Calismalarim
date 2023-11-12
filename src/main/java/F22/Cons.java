package F22;

public class Cons {
    public static int length = 0;
}

class ConsLength {
    static Cons cons1 = new Cons();
    static Cons cons2 = new Cons();

    static {
        System.out.print(cons1.length);
    }

    public static void main(String[] args) {

        cons1.length = 2;
        cons2.length = 8;

        System.out.println(cons1.length);
    }
}