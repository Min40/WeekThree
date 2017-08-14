
package  com.afrohitech.weekthree;

/*
 * 
 	How do you remove all white spaces from a string in java?

			Write a java program to remove all white spaces from a given string. 
			Using replaceAll() method and without it

*/

public class WhiteSpace {

	
			    public static void main(String[] args)
			    {
			        String str = " How do you remove all white            spaces from a string in java  ";
			 
			        //1. Using replaceAll() Method
			 
			        String strWithoutSpace = str.replaceAll("\\s", "");
			 
			        System.out.println(strWithoutSpace);         
			 
			        //2. Without Using replaceAll() Method
			 
			        char[] strArray = str.toCharArray();
			 
			        StringBuffer sb = new StringBuffer();
			 
			        for (int i = 0; i < strArray.length; i++)
			        {
			            if( (strArray[i] != ' ') && (strArray[i] != '\t') )
			            {
			                sb.append(strArray[i]);
			            }
			        }
			 
			        System.out.println(sb);          
			    }
			}


