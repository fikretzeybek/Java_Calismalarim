package F28_S_A_and_I;

class A {
    void yazdir() {
        System.out.println("This is class A");
    }

}

class B {
    void yazdir() {
        System.out.println("This is class B");

    }

}

class CokluInherit extends B{

    public static void main(String[] args) {
        CokluInherit m = new CokluInherit();
        m.yazdir();

    }
}

