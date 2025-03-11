/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package samplecode;
import java.util.Scanner;

/**
 *
 * @author TARUC
 */
public class GCD {

    /**
     * @param args the command line arguments
     */
    public static int gcd(int number1, int number2){
        if(number2 == 0)
            return number1;
        else
            return gcd(number2, number1 % number2);  //recursive call
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1st number: ");
        int number1 = scanner.nextInt();
        System.out.println("2nd number: ");
        int number2 = scanner.nextInt();
        System.out.println("GCD: " + number1 + " & " + number2 + ": " + gcd(number1, number2));
    }
    
}
