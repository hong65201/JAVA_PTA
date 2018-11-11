package Base;

import java.util.Scanner;

public class Demo2_2 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		while(sc.hasNext()) {
			int n = sc.nextInt();
			int begin = sc.nextInt();
			int end = sc.nextInt();
			for(int i =0;i<n;i++) {
				
				sb.append(i);
			}
			String s1 = sb.substring(begin, end);
			System.out.println(s1);
		}
		
	}

}
