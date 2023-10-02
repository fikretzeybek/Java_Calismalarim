package F06;




        public class F08_ThisKeyword {

            F08_ThisKeyword(int x){

                this();

                System.out.println("Parametreli constructor");

            }

            F08_ThisKeyword(){

                System.out.println("Parametresiz constructor");

            }

            public static void main(String[] args) {

                F08_ThisKeyword obj = new F08_ThisKeyword(7);

            }

        }