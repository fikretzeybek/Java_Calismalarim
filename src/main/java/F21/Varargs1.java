package F21;

public class Varargs1 {

    //Variety of arguments-argument cesitliligi
    //Method call sirasinda istenilen kadar argument yazabilmek
    //Array alt yapisi
    //Method icinde YOK
    //Parametre listesinde EN SONDA

    void m1(int a, int... b) {

        System.out.println(b.length);
    }

    void m1(char c, String... d) {
        System.out.println(d.length);
    }

    /*
    void m1(String... e, int f) {
        System.out.println(e.length);
    }
     */

    public static void main(String[] args) {

        Varargs1 vrg = new Varargs1();

        vrg.m1(3, 4, 5, 6, 7);
        vrg.m1('6',"Hello", "Hi");
        vrg.m1('c', 75, 80, 90);
        vrg.m1('d', "Hello");

    }
}