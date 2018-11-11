package Function;

import java.util.Scanner;

public class F7_1 {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    while (sc.hasNext()) {
	        String choice = sc.next();
	        try {
	            if (choice.equals("number"))
	                throw new NumberFormatException();
	            else if (choice.equals("illegal")) {
	                throw new IllegalArgumentException();
	            } else if (choice.equals("except")) {
	                throw new Exception();
	            } else
	            break;
	        }catch(NumberFormatException e1) {
	        	System.out.println("number format exception");
	        	System.out.println(e1);
	        }catch(IllegalArgumentException e2) {
	        	System.out.println("illegal argument exception");
	        	System.out.println(e2);
	        }catch(Exception e3) {
	        	System.out.println("other exception");
	        	System.out.println(e3);
	        }
	        /*这里放置你的答案*/
	    }//end while
	    sc.close();
	}
}
