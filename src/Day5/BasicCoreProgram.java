package Day5;

import java.util.Scanner;

public class BasicCoreProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1,num2,num3;
        int large;
        System.out.println("Enter First Number :");
        num1 = scanner.nextInt();
        System.out.println("Enter Second Number :");
        num2 = scanner.nextInt();
        System.out.println("Enter Third Number :");
        num3 = scanner.nextInt();

        if (num1 > num2 || num1 > num3){
            large = num1;
        } else if (num2 > num3) {
            large = num2;
        }
        else{
            large = num3;
        }
        System.out.println(" The Largest Number Among Three Is :" +large);
    }
}
