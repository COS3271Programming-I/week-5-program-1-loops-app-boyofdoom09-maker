package test;
import java.util.Scanner;

class Im {   
    static Scanner userinput = new Scanner(System.in); 

    public static void main(String[] args){
        int i;
        for(i=1; i<5000; i=2*i+1){
             System.out.println("Count is: " + i);
        }
   }}

// This code defines the main method, which is the entry point of a Java program.
// Inside the method, an integer variable i is declared. 
// The for loop initializes i to 1 and continues running as long as i is less than 5000.
// After each iteration, i is updated using the expression i = 2*i + 1, which doubles the current value of i and then adds 1.
// During each loop iteration, the program prints the current value of i with the message "Count is: " followed by the number.

//Because the value of i grows quickly, the output increases at an exponential rate rather than by simple addition. The printed values are:

// Count is: 1
// Count is: 3
// Count is: 7
// Count is: 15
// Count is: 31
// Count is: 63
// Count is: 127
// Count is: 255
// Count is: 511
// Count is: 1023
// Count is: 2047
// Count is: 4095

// After 4095, the next value would be 8191, which is greater than 5000, so the loop stops.
