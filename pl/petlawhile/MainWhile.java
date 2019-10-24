package pl.petlawhile;

public class MainWhile {
    public static void main(String[] args) {
        int index = 11;

        while (index < 10) {
            System.out.println(index++);
            System.out.println("Adrian");
        }

        int indexTwo = 11;
        do {
            System.out.println(indexTwo++);
            System.out.println("Adrian");
        } while (indexTwo < 10);
    }
}
