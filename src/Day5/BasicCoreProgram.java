package Day5;

import java.util.Scanner;

public class BasicCoreProgram {
        static void LineDistance() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the values");
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            double distance = Math.sqrt(x ^ 2 + y ^ 2);
            System.out.println("Distance between(" + x + "," + y + ") and (0,0) is " + distance);
        }

        public static void main(String[] args) {
            LineDistance();
        }
    }
