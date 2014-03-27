//	Lab 2 - Algoritmer och Datastrukturer,  Uppg 1 
//	Caroline Kabat & Gustav Svalander,	Grupp nr 24 

import java.util.*;

public class SingleBuffer<T>{
	
	private T buf = null;		// Skapar tom buffert
               
	// Sätter in ett nytt dataelement i en tom buffert
	public boolean put(T value){
		
		if(buf != null){
	    	return false;
	    }
	    
		else{
	        buf = value;
	        return true;
	    }
	}
		
	// Tömmer bufferten, returnerar sedan det senaste innehållet 		
	public T get(){
		T temp = buf;
	    buf = null;          
	    return temp;
	}		
}		