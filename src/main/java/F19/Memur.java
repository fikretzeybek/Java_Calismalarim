package F19;

public class Memur extends MemurParent {

    public void yazdir() {

        System.out.println("Memur class");

    }

    public void goster() {

        yazdir();

        super.yazdir();

    }

}
