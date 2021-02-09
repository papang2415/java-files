package fizzbuzz;

import java.util.Scanner;

public class FizzBuzz {

    public static void main(String[] args) {
        int num;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        num = in.nextInt();
        
        int arr[] = new int[num];

        for (int cnt = 1; cnt <= arr.length; cnt++) {
            if (cnt % 2 == 0) {
                if (cnt % 2 == 0 && cnt % 5 == 0) {
                    System.out.println(cnt + " - FizzBuzz");
                } else {
                    System.out.println(cnt + " - Fizz");
                }
            } else if (cnt % 5 == 0) {
                if (cnt % 2 == 0 && cnt % 5 == 0) {
                    System.out.println(cnt + " - FizzBuzz");
                } else {
                    System.out.println(cnt + " - Buzz");
                }
            } else {
                System.out.println(cnt + " -");
            }
        }
    }
}
