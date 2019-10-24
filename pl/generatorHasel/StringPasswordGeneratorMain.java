package pl.generatorHasel;

import java.util.Random;
import java.util.Scanner;

public class StringPasswordGeneratorMain {
    public static void main(String[] args) {
        String availableCharacters = "!@#$%^&*()POIUYTREWQASDFGHJKL:?><MNBVCXZqwertyuioplkjhgfdsazxcvbnm1234567890";
        int length = availableCharacters.length();
        Scanner scanner = new Scanner(System.in);
        int passwdLen = scanner.nextInt();
        String password = "";
        Random random = new Random();
        for (int i = 0; i < passwdLen; i++) {
            password += availableCharacters.charAt(random.nextInt(length));
        }

        System.out.println(password);
    }
}
