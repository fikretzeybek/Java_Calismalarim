package F29_Sorular;

public interface CanHop {}

class Frog implements CanHop {

    public static void main(String[] args) {
      TurtleFrog  frog = new TurtleFrog();
    }
}
class BrazilianHornedFrog extends Frog {}
class TurtleFrog extends Frog {}
