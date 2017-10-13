import java.io.*;
import java.util.*;

import java.util.Scanner;


public class Day4_ClassVsInstance {
    
    public class Person {  //class
    private int age;	//instance variable
  
	public Person(int initialAge) { //constructor
  		if (initialAge>=0){
            age=initialAge;
        } else {
            initialAge=0;
            System.out.println("Age is not valid, setting age to 0.");
        }
	}

	public void amIOld() {
  		if (age<13){
            System.out.println("You are young.");
        } else if (age>=13 && age<18){
            System.out.println("You are a teenager.");
        } else{
        System.out.println("You are old.");
	}
        }

	public void yearPasses() {
  		age++;
	}
        }
}
