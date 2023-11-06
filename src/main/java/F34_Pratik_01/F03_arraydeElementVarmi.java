package F34_Pratik_01;

public class F03_arraydeElementVarmi {

    public static void main(String[] args) {

        // bir array icerisinde aranan "data" nin
        // olup olmadigini konsola yazdiran bir metod olusturun

        int[] arr = {1, 3, 6, 8, 9, 4, 0};

        elementVarmi(arr, 0);


    }

    public static void elementVarmi(int[] arr, int aranan) {

        boolean varMi = false;

        for (int each : arr
        ) {
            if (each == aranan) {
                varMi = true;
                break;
            }
        }
        System.out.println("Data var mı : " + varMi);
    }
}
