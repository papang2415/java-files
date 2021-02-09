/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swapnum;

/**
 *
 * @author 2ndyrGroupB
 */
import java.util.Scanner;
public class SwapNum {

 
    public static void main(String[] args) {
//        num1 = 2 num2 = 5
        int num1, num2;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number1: ");
        num1 = in.nextInt();
        System.out.print("Enter a number2: ");
        num2 = in.nextInt();
        num1 = (num1 + num2);
        num2 = (num1 - num2);
//        num1 = (num1 - num2);
        System.out.println("Swap numner1: " +num1);
        System.out.println("Swap numner2: " +num2);
    }
    
}
