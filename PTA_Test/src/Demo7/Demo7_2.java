package Demo7;

import java.util.Arrays;
import java.util.Scanner;

public class Demo7_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		int[] arry = new int[n];
		int num = 0;
		while (num<n) { //num = 2
			int data;
			try {
			data = Integer.parseInt(sc.nextLine());			
			} catch (NumberFormatException e) {
				System.out.println(e);
				continue;
			}
			if(num == 2) {
				System.out.println("²âÊÔ"+data);
			}
			arry[num++] = data;
		}
		sc.close();
		String s = Arrays.toString(arry);
		System.out.println(s);
	}
}
