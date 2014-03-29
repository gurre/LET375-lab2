//	Lab 2 - Algoritmer och Datastrukturer,  Uppg 2,3,4,5  
//	Caroline Kabat & Gustav Svalander,	Grupp nr 24 

import java.util.*;

public class CollectionOps {

    // Put your code for print here ... 
	public static <T> void print(Collection<T> l){			// Uppg 2
			
		Iterator<T> it = l.iterator();
			
		// OM samlingen INTE är tom, skriv ut alla element.
		if(!l.isEmpty()){
			
			System.out.print("[");
			
			if (it.hasNext()) {
			    System.out.print(it.next());
			}	
			while (it.hasNext()) {
			    System.out.print("," + it.next());
			}

			System.out.print("]");			
		}
		//	ANNARS om den är tom, så skriv bara ut [].
		else
			System.out.print("[]");		
	}
    
	
    // Put your code for reverse here ...				// Uppg 3
	public static <T> List<T> reverse(List<T> l){
		
		Collections.reverse(l);
		return l;
	}


    // Put your code for less here ...					// Uppg 4
    
    // Example
    public static <T1,T2> Collection<T2>
    map(UnaryOp<T1,T2> functor,Collection<T1> c) 
    {
        // Determine the dynamic type of the collection
        Class<? extends Collection> cls = c.getClass();
        try {
            // Create an object of the same dynamic type as c
            Collection<T2> result = cls.newInstance();
            // Copy the elements and apply op to them
            for ( T1 x : c )
                result.add(functor.op(x));
            return result;   
        }
        catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    // Put your code for filter here ...

}
