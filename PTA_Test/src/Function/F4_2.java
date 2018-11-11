package Function;

import java.util.Scanner;

public class F4_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//ÎÒµÄ´úÂë
		int n = Integer.parseInt(sc.nextLine());
		Object[] arr = new Object[n];
		int i = 0;
		for(int j = 0;j < n;j++) {
			String in = sc.nextLine();
			String[] inArr = in.split("\\s"); 
			if(inArr[0].equals("c")) {
				Computer c = new Computer();
				arr[i++] = c;
			}else if(inArr[0].equals("d")) {
				Double d = new Double(inArr[1]);
				arr[i++] = d;
			}else if(inArr[0].equals("i")) {
				Integer i1 = new Integer(Integer.parseInt(inArr[1]));
				arr[i++] = i1;
			}else if(inArr[0].equals("s")) {
				String s = new String(inArr[1]);
				arr[i++] = s;
			}else {
				arr[i++] = null;
			}
		}
		for(int z = arr.length - 1;z>=0;z--) {
			if(arr[z] == null) {
				
			}else {
				
				System.out.println(arr[z]);
			}
		}
		
		sc.close();
	}
}
