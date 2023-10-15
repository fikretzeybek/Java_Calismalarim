package SerbestCalisma;

public class Strings {
    public static void main(String[] args) {

        String msj = "Çok güzel bir gün";

        System.out.println(msj);

        System.out.println("Eleman sayisi : " + msj.length());
        System.out.println("7.eleman ne : " + msj.charAt(6));
        System.out.println(msj.concat(", değil mi?"));
        System.out.println(msj.startsWith("h"));
        System.out.println(msj.endsWith("n"));
        System.out.println(msj.indexOf('ü'));
        System.out.println(msj.lastIndexOf('ü'));


        String yenimsj = msj.replace(' ', '-');
        System.out.println("yenimsj = " + yenimsj);
        System.out.println(msj.substring(4, 9));
        System.out.println(msj.substring(7));

        for (String kelime : msj.split(" ")) {
            System.out.println(kelime);
        }

        System.out.println(msj.trim());


    }
}
