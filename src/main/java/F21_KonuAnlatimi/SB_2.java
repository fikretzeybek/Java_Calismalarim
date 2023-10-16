package F21_KonuAnlatimi;

public class SB_2 {
    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder("Java is easy");
        System.out.println(sb1);//Java is easy

        sb1.reverse();
        System.out.println(sb1);// ysae si avaJ

        //verilen index deki characteri siler
        sb1.deleteCharAt(0);
        System.out.println(sb1);//sae si avaJ

        //baslangic indexinden bitis indexine kadar(haric) olan characterleri siler
        sb1.delete(0, 3);
        System.out.println(sb1);


        //replace(0,3,"X"); 0 dahil 3 haric olmak üzere
        // indexleri alir ve yerine X koyar
        sb1.replace(0, 3, "X");
        System.out.println(sb1);

        sb1.insert(2, "999");
        System.out.println(sb1);// X 999avaJ

        StringBuilder sb2 = new StringBuilder("Jbva");
        StringBuilder sb3 = new StringBuilder("Mbta");

        int r1 = sb2.compareTo(sb3);
        System.out.println(r1);

        /*
        compareTo(); iki StringBuilder i bastan baslayarak
        harf harf karsilastirir
        ilk harfler ayni ise ikinci harflere gecer
        ikincilerde ayni ise ucunculere gecer ....
        ve ilk farkli olan harfe gider,
        farkli olan iki harfin ascii kodlari arasindaki farki verir

        sonuc 0 ise alafabetik olarak ayni siradalar demektir
        sonuc -1 ise sb2 sb3 den alfabetik olarak onde demektir
        sonuc 1 ise sb2 sb3den alfabetik olarak sonra demektir
         */

        //String class da var olan ama StringBuilder class da var olmayan
        //( split() method gibi ) methodlara
        //ihtiyac duydugumuzda toString() methodunu kullanarak
        //String classa cevirir ve o methodlari kullaniriz
        String str = sb1.toString().toUpperCase();
        System.out.println(str);//X 999AVAJ
        //str.split(2,3);


        //String nasil StringBuilder a cevrilir?
        StringBuilder newSb1 = new StringBuilder(str);
        System.out.println(newSb1);//X 999AVAJ


        /*
        1) StringBuffer java da string ureten bir diger classtir.
        StringBuffer java nin string uretmek icin olusturdugu ilk classtir

        2) StringBuffer, StringBuilder'a cok benzer,
        yani ikiside "mutable" string uretir
        3) StringBuffer "multi-thread" dir, ama StringBuilder "multi-thread" degildir.
        4) StringBuilder  "multi-thread"  olmadigi icin StringBuffer dan daha hizli calisir
        5) multi-thread yapilirken yapilan islerin siralamasi onem arzeder,
        yapilan isleri mantikli bir siraya koymak "synchronization" olarak adlandirilir
        StringBuffer multi-thread oldugu icin ayni zamana synchronized dir(TC Kimlik No)

                3 tane String olusturan class ogrendik;
                1) immutable string lazimsa ==> String class
                2) mutable string lazimsa , StringBuilder veya StringBuffer
                                a) StringBuilder i multi-thread gerekmezse kullaniriz
                                b) StringBuffer i multi-thread gerekirse kullaniriz

         */

        //StringBuffer nasil olusturulur?
        StringBuffer sbf = new StringBuffer("Java");
        System.out.println(sbf);//Java

    }
}
