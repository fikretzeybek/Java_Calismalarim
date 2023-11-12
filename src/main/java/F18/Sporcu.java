package F18;

class Sporcu {
    String n;
    String s;
    int a = 15;

    Sporcu(String name, String sport, int age) {
        n = name;
        s = sport;
        a = age;
    }
    Sporcu(String sport, int age) {
        this.s = sport;
        this.a = age;
    }
    Sporcu(String name, String sport) {
        this.n = name;
        this.s = sport;
    }
    @Override
    public String toString() {
        return "" +
                "n='" + n + '\'' +
                ", s='" + s + '\'' +
                ", a=" + a   ;
    }
    public static void main(String[] args) {

        Sporcu myObj = new Sporcu("Berk", "Basketbol", 23);
        Sporcu myObj2 = new Sporcu("Futbol", 17);
        Sporcu myObj3 = new Sporcu("Semih", "Karate");

        System.out.println("Sporcu 1 : "+myObj);
        System.out.println("Sporcu 2 : "+myObj2);
        System.out.println("Sporcu 3 : "+myObj3);
    }
}