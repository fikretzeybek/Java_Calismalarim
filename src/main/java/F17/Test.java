package F17;

class Test {
    int i;

    public Test(int k) {

        i = k;
    }

    public Test(int k, int m) {
        System.out.println("Hi I am assigning the value max(k, m) to i");
        if (k > m) {
            i = k;
        } else {
            i = m;
        }
    }

}
