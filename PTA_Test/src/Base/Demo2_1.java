package Base;

import java.util.Arrays;
import java.util.Scanner;

public class Demo2_1 {
/*	运行程序后可以输入4个选项，分别为：fib,sort,search,
	getBirthDate

	fib:根据输入n，打印斐波那契数列。比如输入：3，
	输出：1 1 2

	sort:输入一串数字，然后进行排序并输出输出，注意数组
	元素输出格式，使用[ ]包括。提示：可直接使用函数Arrays
	相关函数处理输出。

	search:如果找到返回所找到的位置，如果没找到，返回-1。
	提示：可以对数组先排序，然后使用Arrays相关函数进行查找。

	getBirthDate:输入n个身份证，然后把输入的n个身份号的年
	月日抽取出来，按年-月-日格式输出。

	当输入不是这几个字符串(fib,sort,search,getBirthDate)
	的时候，显示exit。

	注意：在处理输入的时候，尽量全部使用Scanner的nextLine()
	方法处理输入，否则会出现行尾回车换行未处理影响下次输入的情况。

	参考：jdk文档的Arrays，String*/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			String s1 = sc.next();   //这里要用一个String存储输入的字符串，用来跟输入的字符串进行匹配			                         
			if("fib".equals(s1)) {  //不能使用if("fib".euqals(sc.nexLine()) 因为如果输入sort
				                    //第一次匹配不成功，但是已经把sort存入了键盘缓冲区,下一次匹配是否
				                    //等于sort则会读取下一行，结果就是要输入两次sort才会匹配
				String str = sc.next();
				int n = Integer.parseInt(str);				
				for(int i = 0;i<n;i++) {
					System.out.print(fib(i)+" ");
				}
				
			}else if("sort".equals(s1)){ //输入sort			    
				String str = sc.next();// 录入字符串
				 
		        String[] strs = str.split("\\s+");// 使用正则表达式进行分割
		        for (String string : strs) {
					System.out.println(string);
				}
		        
		       /* int[] is = new int[strs.length];
		        for (int i = 0; i < strs.length; i++) {// 遍历String数组，赋值给int数组
		            is[i] = Integer.parseInt(strs[i]);
		        }
		        System.out.println("1");
		 
		        Arrays.sort(is);// 使用数组工具类进行排序，也可以自己使用冒泡或选择排序来进行排序
		 
		        StringBuffer sb = new StringBuffer();
		        for (int i = 0; i < is.length; i++) {// 遍历进行拼接
		            if (i == is.length - 1) {
		                sb.append(is[i]);
		            } else {
		                sb.append(is[i] + ",");
		            }
		        }
		 
		        System.out.println(sb.toString());*/
				    
				  /*  int[] arr = new int[str2.length()]; //构建新数组存放数字
				    for(int i =0;i<str2.length();i++) {
				    	arr[i] = Integer.parseInt(str2.charAt(i)+"");
				    }				
				    Arrays.sort(arr); //对数组进行排序				    
				    System.out.println(Arrays.toString(arr));*/
				
				
			}else {
				System.out.println("exit");
				break;
			}
			
		}

	}
	public static int fib(int n) {
		if(n==1|n==0) {
			return 1;
		}else {
			return fib(n-2)+fib(n-1);
		}
				
	}
	public static void printArr(int[] arr) {
		
		Arrays.toString(arr);
		
	}
}
