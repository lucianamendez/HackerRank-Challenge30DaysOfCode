
import java.util.Scanner;

public class Day1_DataTypes {
    
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);
        
            // Declare second integer, double, and String variables.
    int i2;
    Double d2;
    String s2;
    String s3;
    // Read and save an integer, double, and String to your variables.
    i2 = scan.nextInt();
    d2 = scan.nextDouble();
    s2 = scan.next();
    s3= scan.nextLine();
    scan.close();
    // Print the sum of both integer variables on a new line.
    System.out.println(i+i2);
    // Print the sum of the double variables on a new line.
    System.out.println(d+d2);
    // Concatenate and print the String variables on a new line
    // The 's' variable above should be printed first.
    System.out.println(s+s2+s3);
    scan.close();
    }
    
}


