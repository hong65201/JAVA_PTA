package Base;

import java.util.Scanner;

public class Demo1_4 {
	/*1.4 jmu-Java-01入门-取数字浮点数（5 分）
	本题目要求读入若干以回车结束的字符串表示的整数
	或者浮点数，然后将每个数中的所有数字全部加总求和。
	输入格式:
	每行一个整数或者浮点数。保证在浮点数范围内。
	输出格式:
	整数或者浮点数中的数字之和。题目保证和在整型范围内。
	输入样例:
	-123.01
	234
	输出样例:
	7
	9
	int   范围 -2^32~2^32
	float 范围 -2^64~2^64*/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			String s1 = sc.nextLine(); //获取输入字符串
			int[] arr = new int[s1.length()]; //生成存放每个数字的数组
			String s2 = s1.replaceAll("[^\\d]", "");
			for(int i = 0;i<s2.length();i++) {
				arr[i] = Integer.parseInt(s2.charAt(i)+"");				
			}
			int sum = 0;
			for(int i = 0 ;i<arr.length;i++) {
				
				sum=sum+arr[i];
			}
			System.out.println(sum);
			
		}

	}

}
