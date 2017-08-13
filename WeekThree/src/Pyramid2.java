/*How to create a pyramid of numbers in java?

			Write a java program to create a pyramid of numbers in different patterns. [Solution]
*/



import java.util.Scanner;


public class Pyramid2 {
	private static int noOfRows;
	private static  int rowCount;
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args)
    {
		print();
		method1();
		print();
		method2();
		print();
		method3();
		print();
		method4();
		method5();
		method6();
		
		
    }
	public static void print() {
		
		 
        //Taking noOfRows value from the user
 
        System.out.println("How Many Rows You Want In Your Pyramid?");
 
         noOfRows = sc.nextInt();
         rowCount = 1;
		 
	        System.out.println("Here Is Your Pyramid");
	}
    
		public static void method1()
			    {
			
			        //Implementing the logic
			 
			        for (int i = noOfRows; i > 0; i--)
			        {
			            //Printing i spaces at the beginning of each row
			 
			            for (int j = 1; j <= i; j++)
			            {
			                System.out.print(" ");
			            }
			 
			            //Printing 'rowCount' value 'rowCount' times at the end of each row
			 
			            for (int j = 1; j <= rowCount; j++)
			            {
			                System.out.print(rowCount+" ");
			            }
			 
			            System.out.println();
			 
			            //Incrementing the rowCount
			 
			            rowCount++;
			        }
			    }
			

			public static void method2()  {
				
			        for (int i = noOfRows; i > 0; i--)
			        {
			            //Printing i spaces at the beginning of each row
			 
			            for (int j = 1; j <= i; j++)
			            {
			                System.out.print(" ");
			            }
			 
			            //Printing 'j' value at the end of each row
			 
			            for (int j = 1; j <= rowCount; j++)
			            {
			                System.out.print(j+" ");
			            }
			 
			            System.out.println();
			 
			            //Incrementing the rowCount
			 
			            rowCount++;
			        }
			    }
			

			 public static void method3()
			   
			    {
				

			        //Implementing the logic
			 
			        for (int i = noOfRows; i > 0; i--)
			        {
			            //Printing i spaces at the beginning of each row
			 
			            for (int j = 1; j <= i; j++)
			            {
			                System.out.print(" ");
			            }
			 
			            //Printing * at the end of each row
			 
			            for (int j = 1; j <= rowCount; j++)
			            {
			                System.out.print("* ");
			            }
			 
			            System.out.println();
			 
			            //Incrementing the rowCount
			 
			            rowCount++;
			        }
			    }
			

			 public static void method4()
			   
			    {
				 
				
			        //Implementing the logic
			 
			        for (int i = noOfRows; i > 0; i--)
			        {
			            //Printing i spaces at the beginning of each row
			 
			            for (int j = 1; j <= i; j++)
			            {
			                System.out.print(" ");
			            }
			 
			            //Printing * at the end of each row
			 
			            for (int j = 1; j <= rowCount; j++)
			            {
			                System.out.print("* ");
			            }
			 
			            System.out.println();
			 
			            //Incrementing the rowCount
			 
			            rowCount++;
			        }
			    }
			

			 public static void method5()
			   
			    {
				 		rowCount = noOfRows;
			 
			        //Implementing the logic
			 
			        for (int i = 0; i < noOfRows; i++)
			        {
			            //Printing i*2 spaces at the beginning of each row
			 
			            for (int j = 1; j <= i*2; j++)
			            {
			                System.out.print(" ");
			            }
			 
			            //Printing j where j value will be from 1 to rowCount
			 
			            for (int j = 1; j <= rowCount; j++)             
			            {
			                System.out.print(j+" ");
			            }
			 
			            //Printing j where j value will be from rowCount-1 to 1
			             
			            for (int j = rowCount-1; j >= 1; j--)
			            {                 
			                System.out.print(j+" ");             
			            }
			             
			            System.out.println();
			 
			            //Decrementing the rowCount
			 
			            rowCount--;
			        }
			    }
			


			 public static void method6()
			   
			    {
			        
				 
			        //Implementing the logic
			 
			        for (int i = noOfRows; i >= 1; i--)
			        {
			            //Printing i*2 spaces at the beginning of each row
			 
			            for (int j = 1; j <= i*2; j++)
			            {
			                System.out.print(" ");
			            }
			 
			            //Printing j where j value will be from i to noOfRows
			 
			            for (int j = i; j <= noOfRows; j++)             
			            {
			                System.out.print(j+" ");
			            }
			 
			            //Printing j where j value will be from noOfRows-1 to i
			             
			            for (int j = noOfRows-1; j >= i; j--)
			            {                 
			                System.out.print(j+" ");             
			            }
			            System.out.println();
			 
			            //Incrementing the rowCount
			 
			            rowCount++;
			        }
			    }
			}



