package helloworld;

public class Primeornot {
	  public static void main(String[] args)
	 {
	    int n = 3;
	   int c = 0;    
	    if (n <= 1) {
	      System.out.println("The number is not prime");
	    }
	    for (int i = 1; i <= n / 2; i++) {
	      if (n % i == 0) {
	        c++;
	      }
	    }
	    if (c > 1) {
	        System.out.println("it is not a  prime");
	    }
	    else {
	      System.out.println("it is prime");
	    }
	  }
	}



