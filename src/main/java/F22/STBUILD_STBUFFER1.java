package F22;

public class STBUILD_STBUFFER1 {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();
        sb.append("a"); // avoid this
        System.out.println(sb);

        System.out.println("-------");

        StringBuilder sb1 = new StringBuilder();
        sb.append('a'); // use this instead
        System.out.println(sb1);
    }
}
