/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package samplecode;

/**
 *
 * @author TARUC
 */
public class TimingNano {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] nValues = {10, 100, 1000};
        int iterations = 10;
        String outputStr = String.format
        ("Average Execution (NanoS) for %d iteration \n", iterations);
        
        outputStr += String.format("%8s %13s %13s %13s \n",
                "n","Algorithm A", "Algorithm B", "Algorithm C");
        
        for(int n : nValues){
            long timeA = 0;
            long timeB = 0;
            long timeC = 0;
            
            //inner for
            for(int i=0; i < iterations; i++){
                long startTime = System.nanoTime();
                Algorithms.algorithmA(n);  //algoA
                long endTime = System.nanoTime();
                timeA += endTime - startTime;
                
                startTime = System.nanoTime();
                Algorithms.algorithmB(n);  //algoB
                endTime = System.nanoTime();
                timeB += endTime - startTime;
                
                startTime = System.nanoTime();
                Algorithms.algorithmC(n);   //algoC
                endTime = System.nanoTime();
                timeC += endTime - startTime;
            }  //inner for
            
            outputStr += String.format("%8d %13d %13s %13d\n",
                    n, timeA/iterations,timeB/iterations, timeC/iterations);
        }//outer for
        
        System.out.println(outputStr);
    }//main
    
}
