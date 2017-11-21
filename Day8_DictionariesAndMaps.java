/*Given n names and phone numbers, assemble a phone book that maps friends' names to their respective phone numbers. 
You will then be given an unknown number of names to query your phone book for. For each name queried, print the associated entry 
from your phone book on a new line in the form name=phoneNumber; if an entry for name is not found, print Not found instead.

Note: Your phone book should be a Dictionary/Map/HashMap data structure.*/
import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<String, Integer> phoneBook = new HashMap<String,Integer>();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            phoneBook.put(name,phone);
        }
        while(in.hasNext()){
            String s = in.next();
            if(phoneBook.containsKey(s)){
                System.out.println(s+"="+phoneBook.get(s));
            }
            else{
                System.out.println("Not found");
            }
        }
        in.close();
    }
}

/*// Create a Map of String Keys to String Values, implemented by the HashMap class
Map<String,String> myMap = new HashMap<String,String>(); 
    
// Adds ("Hi","Bye") mapping to myMap
myMap.put("Hi", "Bye");	

// Print the Value mapped to from "Hi"
System.out.println(myMap.get("Hi")); 

// Replaces "Bye" mapping from "Hi" with "Bye!" 
myMap.put("Hi", "Bye!"); 

// Print the Value mapped to from "Hi"
System.out.println(myMap.get("Hi")); 

Here are a few Map methods you will find helpful for this challenge:
containsKey(Object key): Returns true if the map contains a mapping for ; returns false if there is no such mapping.
get(Object key): Returns the value to which the  is mapped; returns null if there is no such mapping.
put(K key, V value): Adds the (Key, Value) mapping to the Map; if the  is already in the map, the  is overwritten.
*/