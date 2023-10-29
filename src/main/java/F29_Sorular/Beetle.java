package F29_Sorular;

interface HasExoskeleton {
     int getNumberOfSections();
}

abstract class Insect implements HasExoskeleton {
    abstract int getNumberOfLegs();

}

public class Beetle extends Insect {


    @Override
    public int getNumberOfSections() {
        return 0;
    }

    @Override
    int getNumberOfLegs() {
        return 0;
    }
}


