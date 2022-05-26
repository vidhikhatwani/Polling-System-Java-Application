package myproject;

public class Myproject {

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(Myproject::run);
    }
    private static void run() {
        new WelcomeFrame().setVisible(true);
    }
}