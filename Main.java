//	Lab 2 - Algoritmer och Datastrukturer,  Uppg 2,3,4,5  
//	Caroline Kabat & Gustav Svalander,	Grupp nr 24 

import java.util.*;

public class Main {
    public static void main(String[] args) {    
         ArrayList<String> names = new ArrayList<String>();

         // Test print for an empty list
         CollectionOps.print(names); 
		 System.out.println();

         // Test print for a list containing one element
         names.add("a");
         CollectionOps.print(names); 
		 System.out.println();

         // Test print for a list containing more than one elment
         names.add("b");
         names.add("c");
         CollectionOps.print(names); 
		 System.out.println();
	 		 
	 
         // Test the return value from reverse		
		 CollectionOps.print(CollectionOps.reverse(names));		
       	 System.out.println();
			 
         // Test that reverse mutates its argument				
 		 CollectionOps.print(names);								
		 System.out.println();

        
		
		 // Write code to test less here 

         // Write code to test map here
             
         // Write code to test filter here
	 }
}














