package pl.metody;

public class MetodyMain {
    public static void main(String[] args) {
        System.out.println("Myśmy sobie tutaj coś zawsze robili");
        innaMethoda();
        metodaHello("Adrian");
        dodawanie(10, 20);
//        System.out.println(wynik);
    }

    public static int dodawanie(int a, int b){
        int suma = a + b;
        System.out.println(suma);
        return suma;
    }

    public static  void metodaHello(String imie){
        System.out.println("Witaj "+ imie);
    }

    public static void innaMethoda(){
        System.out.println("ona też może coś zrobić");
    }
}
