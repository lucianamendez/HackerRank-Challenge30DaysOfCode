/*Given a base-10 integer,n, convert it to binary (base-2). Then find and print the base-10 integer 
denoting the maximum number of consecutive 1's in n's binary representation.*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        int extra;
        int contador=0;
        int rep=0;
        
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
    
        while(n>0){
            extra=n%2;
            n=n/2;
                if (extra == 1){
                    contador++;
                    if (contador>=rep){
                        rep=contador;
                    }
                }
                else{
                    contador=0;
                }
            }        
                
        System.out.println(rep);
    }
}