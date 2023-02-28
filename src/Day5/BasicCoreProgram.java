package Day5;

import java.util.Scanner;

public class BasicCoreProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b;
        System.out.println("Enter the number of a");
        a = scanner.nextInt();
        System.out.println("Enter the Number of b");
        b = scanner.nextInt();
        System.out.println("Before Swap :" + a + " " + b);

        int temp;
        temp = a;
        a = b;
        b = temp;

        System.out.println("After Swap :" + a +" " + b);

    }

}
