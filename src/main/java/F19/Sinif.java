package F19;

public class Sinif extends SinifParent {

    public Sinif(int age) {
        super();
        System.out.println("child class parametreli cons.");
    }

    public Sinif() {
        this(11);
        System.out.println("child class parametresiz cons.");
    }

    public static void main(String[] args) {
        Sinif sinifl = new Sinif();
    }
}
