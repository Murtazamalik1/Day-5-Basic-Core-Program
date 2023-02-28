package Day5;

import java.util.Scanner;

public class BasicCoreProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int divisor, divide;
        System.out.println("Enter Quotients Number");
        divide = scanner.nextInt();
        System.out.println("Enter Remainder Number");
        divisor = scanner.nextInt();
        int quotient = divide / divisor;
        int remainder = divide % divisor;
        System.out.println("Quotient : " + quotient);
        System.out.println("Remainder :" + remainder);
    }

}
