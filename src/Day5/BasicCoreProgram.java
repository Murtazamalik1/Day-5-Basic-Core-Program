package Day5;

import java.util.Scanner;

public class BasicCoreProgram {
    public static void main(String[] args) {
        int N;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Any Number");
        N = scanner.nextInt();
        for (int i = 2; i * i <= N; i++){
            if (N%i == 0){
                N = N/i;
                System.out.println(i+ " ");
            }
        }
        if (N != 0){
            System.out.println(N);
        }
    }

}
