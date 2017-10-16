/*Objective 
Today, we're learning about the Array data structure.
Task 
Given an array,A, of N integers, print A's elements in reverse order as a single line of space-separated numbers.*/
import java.io.*;
import java.util.*;


public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = in.nextInt();
        }
        in.close();
        
        for (int c=n-1; c>=0; c--){
            System.out.print(arr[c]+" ");
        }
    }
}
