package F15;

public class F04_OndalikKisminToplami {
    public static void main(String[] args) {
        //bir ondalik sayinin ondalik kismindaki rakamlarinin toplamini bulunuz.
        //43.4571 ==> 4+5+7+1 = 17

        Double sayi = 43.4571;
        String sayiStr = String.valueOf(sayi);//Double olan degeri String'e cevrildi
        String onadalikTaraf = sayiStr.split("\\.")[1];// "." dan itibaren kesip sag tarafta olanlari alindi

        int toplam = 0;
        for (int i = 0; i < onadalikTaraf.length(); i++) {
            char sayiChar = onadalikTaraf.charAt(i);
            int sayi2 = Character.getNumericValue(sayiChar);
            toplam += sayi2;
        }
        System.out.println("Ondalik kismin toplami : " + toplam);
    }
}





