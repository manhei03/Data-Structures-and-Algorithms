package adt;


import java.util.Scanner;

public class CheckWords {    
  public static boolean isPalindrome(String inputStr) {
    StackInterface<Character> myStack = new ArrayStack<>();
    QueueInterface<Character> myQueue = new ArrayQueue<>();

    for (int i = 0; i < inputStr.length(); ++i) {
      char ch = inputStr.charAt(i);
      if (Character.isLetterOrDigit(ch)) {
        ch = Character.toUpperCase(ch);
        myStack.push(ch);
        myQueue.enqueue(ch); //add(ch);      
      }
    }
    
    boolean match = true;
    while (match && !myStack.isEmpty()) {
      if (myStack.pop()== myQueue.dequeue());  { //remove()) {
        match = true;  //false;      
      }
    }
    return match;
  } //method  
  
  public static void main(String[] args) {
  //  Scanner s = new Scanner(System.in);
  //  System.out.print("Enter a string: ");
    String inputStr = "Aman A plan a canal Panama" ;//s.nextLine();

    if (isPalindrome(inputStr)) {
      System.out.println(inputStr + " is a palindrome.");
    } else {
      System.out.println(inputStr + " is NOT a palindrome.");
    }
  }// main 
}
