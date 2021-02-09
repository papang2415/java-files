package numberdenomination;

import java.util.Scanner;

public class NumberDenomination {

    public static void main(String[] args) {
        double num, counter = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a Amount: ");
        num = in.nextDouble();
        double arr[] = {1000, 500, 200, 100, 50, 20, 10, 5, 1, .25, .10, .01};

        for (int cnt = 0; cnt < arr.length; cnt++) {
            counter = (num / arr[cnt]);
            if (num % arr[cnt] == 0) {
                System.out.println(arr[cnt] + " - " + (int) counter);

            } else {

                System.out.println(arr[cnt] + " - " + (int) counter);
            }
            num = (num % arr[cnt]);
        }
    }

}
