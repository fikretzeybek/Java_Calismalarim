package F04;

import javax.swing.*;

public class F03_NeDusunuyorsun {

    public static <kutu> void main(String[] args) {
        System.out.println("Çalıştırılıyor...");
        String dusunce = JOptionPane.showInputDialog(
                null,
                "Ne düşünüyorsun:"
        );
        String yazi = "Demek \""+dusunce+"\" diyorsun.";
        JOptionPane.showMessageDialog(
                null,
                yazi
        );
    }
}