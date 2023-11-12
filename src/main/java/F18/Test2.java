package F18;

class Test2 {
    int test_a, test_b;

    Test2(int a, int b) {
        test_a = a;
        test_b = b;
    }

    public static void main(String args[]) {
        Test2 test = new Test2(3,5);
        System.out.println(test.test_a + " " + test.test_b);
    }
}