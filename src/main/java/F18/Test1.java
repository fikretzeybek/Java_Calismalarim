package F18;

public class Test1 {
    Test1(int a, int b) {
        System.out.println("a = " + a + " b = " + b);
    }

    Test1(int a, float b) {
        System.out.println("a = " + a + " b = " + b);
    }

    public static void main(String args[]) {
        byte a = 10;
        byte b = 15;
        Test1 test = new Test1(a, b);
    }
}