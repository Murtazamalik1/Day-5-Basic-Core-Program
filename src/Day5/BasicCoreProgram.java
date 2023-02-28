package Day5;

import java.util.Scanner;

public class BasicCoreProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char alphabet;
        System.out.println("Enter any Alphabet");
        alphabet = scanner.next().charAt(0);
        if (alphabet == 'a' || alphabet == 'e' || alphabet == 'i' || alphabet == 'o' || alphabet == 'u'){
            System.out.println("Alphabet is Vowel :" + alphabet);
        }
        else{
            System.out.println("Alphabet Is Consonant :" + alphabet);
        }
    }

}
