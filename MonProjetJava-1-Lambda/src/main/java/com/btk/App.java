package com.btk;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       List<Integer> nombres = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
       //Afficher les nbres pairs avec un style impératif
       
      /* for (Integer nb : nombres ) {
    	   
    	   if (nb % 2 == 0) {
    		   System.out.println(nb + "est PAIR !");
			
		}*/ // ou 
       
       Predicate<Integer> filterPair = a -> a%2 ==0;
       
       List<Integer> pairs = 
    		   nombres
    		   .stream()
    		   .filter(filterPair)  
    		   .collect(Collectors.toList());
       //ou
      /* List<Integer> pairs = 
    		   nombres
    		   .stream()
    		   .filter(a -> a%2 ==0)  // L'operateur -> s'appelle lambda
    		   .collect(Collectors.toList());*/
       
       
       
       pairs.forEach(System.out::println);
       
       
		
	}
    
}
