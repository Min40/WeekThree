package com.afrohitech.weekfour;

/*
 * 
  How to find duplicate characters in a string in java?

			Write a java program to find duplicate characters and their count in a given string. For example, in a string "Better Butter", duplicate characters and their count is t : 4, e : 3, r : 2 and B : 2.

 * @author minya
 *
 */
import java.util.HashMap;
import java.util.Set;

public class DuplicateChar {

	 public static void main(String[] args)
	    {
	       duplicateCharCount("Duplicate characters");
	 
	       duplicateCharCount("Fresh Fish");
	 
	       duplicateCharCount("Better Butter");
	    }	
			 
			public  static void duplicateCharCount(String inputString)
			    {
			        //Creating a HashMap containing char as key and its occurrences as value
			 
			        HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();
			 
			        //Converting given string to char array
			 
			        char[] strArray = inputString.toCharArray();
			 
			        //checking each char of strArray
			 
			        for (char c : strArray)
			        {
			            if(charCountMap.containsKey(c))
			            {
			                //If char is present in charCountMap, incrementing it's count by 1
			 
			                charCountMap.put(c, charCountMap.get(c)+1);
			            }
			            else
			            {
			                //If char is not present in charCountMap,
			                //putting this char to charCountMap with 1 as it's value
			 
			                charCountMap.put(c, 1);
			            }
			        }
			 
			        //Getting a Set containing all keys of charCountMap
			 
			        Set<Character> charsInString = charCountMap.keySet();
			 
			        System.out.println("Duplicate Characters In "+inputString);
			 
			        //Iterating through Set 'charsInString'
			 
			        for (Character ch : charsInString)
			        {
			            if(charCountMap.get(ch) > 1)
			            {
			                //If any char has a count of more than 1, printing it's count
			 
			                System.out.println(ch +" : "+ charCountMap.get(ch));
			            }
			        }
			    }
			 
			   
			}



