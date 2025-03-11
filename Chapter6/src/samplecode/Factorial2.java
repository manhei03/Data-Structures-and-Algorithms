package samplecode;

import java.util.Scanner;

/**
 * Factorial.java Computes the factorial of a given number using recursion.
 * @author Kat Tan
 */
public class Factorial2 {

  public static int factorial(int n) {
  /*
    if (n == 0) {
      return 1;
    } else {
      return n * factorial(n - 1);
    }
    */
  
  return(n == 0)? 1:n * factorial(n - 1); 
  }//Fac
  
 public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a non-negative integer number: ");
    int number = scanner.nextInt();
    System.out.printf("factorial(%d) = %d\n", number, Factorial2.factorial(number));
  }
  
}

