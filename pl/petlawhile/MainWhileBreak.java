package pl.petlawhile;

public class MainWhileBreak {
    public static void main(String[] args) {
        int i = 0;
        while (true) {
            if (i++ < 4) {
                System.out.println("Adrian");
            } else {
                return;
            }
        }
    }
}
