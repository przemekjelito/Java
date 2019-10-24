package pl.tablice;

public class MainTablice {
    public static void main(String[] args) {
        int[] liczby = new int[10];
        int[] liczby2 = {1, 2, 3, 4, 5, 6, 7, 9};
        char[] literki = {'a','u', 'd','p'};
        liczby[0] = 1;
        liczby[9] = 1000000;
        for (char pierwsza : literki) {
            for (char druga : literki) {
                for (char trzecia : literki) {
                    for (char czwarta : literki) {

                        System.out.println(pierwsza +""+ druga+""+trzecia+""+czwarta);
                    }
                }
            }
        }
    }
}
