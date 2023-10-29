package F28_S_A_and_I;

interface A1 {
    void show();
}
interface B1 {
    void ekran();
}
interface C1 {
    void show();
}
class Alfabe implements A1, B1, C1 {

    public static void main(String[] args) {
        Alfabe alfabe = new Alfabe();
        alfabe.show();   alfabe.ekran();
    }
    @Override
    public void show() {
        System.out.println("Interface A1 & C1");
    }
    @Override
    public void ekran() {
        System.out.println("Interface B1");
    }
}

