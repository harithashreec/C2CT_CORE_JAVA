/**
 * 
 */
package helloworld;


public class Fibbannocci {

		  public static void  main(String[]  args) 
		{
		    int n = 5, first = 0, second = 1;
		      for (int i = 1; i <= n; i++)
		 {
		      System.out.println(first + ",");
		      int next = first + second;
		      first = second;
		      second = next;
		    }
		  }
		}



