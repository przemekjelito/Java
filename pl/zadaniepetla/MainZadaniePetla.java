package pl.zadaniepetla;

public class MainZadaniePetla {
    public static void main(String[] args) {
        int count = 110;
        int suma = 1;

        for (int i = 1; i <= count; i++) {
            suma = suma * i;
        }

//        int i = 0;
//        while (i <= count) {
//            suma = suma + i++;
//        }
        System.out.println("suma:" + suma);
    }
}
