package Day5;

import java.util.Scanner;

public class BasicCoreProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        System.out.println("Enter any number To Check Whether Number Is Even Or odd");
        num = scanner.nextInt();

        if (num % 2 == 0){
            System.out.println("Number is Even :" + num);
        }
        else {
            System.out.println("Number Is Odd :" + num);
        }

    }

}
