/*Task 
Given a string,S, of length N that is indexed from 0 to N-1, print its even-indexed and odd-indexed 
characters as 2 space-separated strings on a single line.
The first line contains an integer, T (the number of test cases). 
Each line i of the T subsequent lines contain a String, S.
*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int T = scan.nextInt();
    String s;

    for(int i=0;i<T;i++){
        s = scan.next();

        for(int j=0; j<s.length(); j++){
            if(j%2==0){
                System.out.print(s.charAt(j));
            }
        } 
        System.out.print(" ");
        
        for(int j=0; j<s.length(); j++){
            if(j%2!=0){
                System.out.print(s.charAt(j));
            }

        }
        System.out.println();
    }

}
}