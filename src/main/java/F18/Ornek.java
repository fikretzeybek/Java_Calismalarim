package F18;

class Ornek {

    Ornek(){
        System.out.println("Default constructor");
    }

    Ornek(int i, int j){
        System.out.println("Iki parametreli constructor ");
    }

    Ornek(int i, int j, int k){
        System.out.println("Uc parametreli constructor");
    }

    Ornek(int i, String name){
        System.out.println("int ve String parametreli constructor");
    }
    public static void main(String args[]){

        Ornek obj = new Ornek(1,"Kerem Yener");

        Ornek obj1 = new Ornek();

        Ornek obj2 = new Ornek(1, 2, 13);

        Ornek obj3 = new Ornek(12, 12);

    }
}