package samplecode;


public class Algorithms {

  public static int algorithmA(int n) {
    int sum = 0;
    for (int i = 1; i <= n; i++) 
      sum = sum + i;
   
    return sum;
  }

  public static int algorithmB(int n) {
    int sum = 0;
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        sum = sum + 1;
      }
    }
    return sum;
  }
  
  public static int algorithmC(int n) {
    return n * (n + 1) / 2;
  }
}
