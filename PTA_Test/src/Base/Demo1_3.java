package Base;

import java.util.Scanner;
public class Demo1_3 {

	public static void main(String[] args) {
		/*如果该数＞＝10000且＜＝20000，则依次输出其对
		 * 应的二进制字符串、八进制字符串、十六进制字符串。
		 *否则将字符串中的每个数字抽取出来，然后将所有数字加总求和。
		 */
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			int a = sc.nextInt();			
			if(a>=10000 && a<=20000) {
				System.out.println(Integer.toBinaryString(a)+","+Integer.toOctalString(a)+","+Integer.toHexString(a));
			}else {
				String str = String.valueOf(a);
				int[] arr = new int[str.length()];
				String str2 = str.replace("-","");  //正则去除“-”
				System.out.println(str2);
				for(int i =0 ; i<str2.length();i++) {
					arr[i] = Integer.parseInt(str2.charAt(i)+"");
					System.out.print(arr[i]+" ");
					
				}
				int y =0;   //必须定义在循环外，否则for循环执行完后
				            //变量y会被当做垃圾回收
				for(int z = 0;z<arr.length;z++) {				
					y=y+arr[z];					
				}
				System.out.println(y);
				
			}
		}
	}

}
