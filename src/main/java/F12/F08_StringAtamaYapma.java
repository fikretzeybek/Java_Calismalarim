package F12;

public class F08_StringAtamaYapma {
    public static void main(String[] args) {
        String s= "purr";

        s.toUpperCase();// atama yapilmamis degisiklik olmaz

        s.trim();// atama yapilmamis degisiklik olmaz

        s.substring(1,3);// atama yapilmamis degisiklik olmaz

        s+=" two"; //en basta bir bosluk var

        System.out.println(s.length());// 8
    }
}
