package Base;

import java.util.Arrays;
import java.util.Scanner;

public class Demo2_1 {
/*	���г�����������4��ѡ��ֱ�Ϊ��fib,sort,search,
	getBirthDate

	fib:��������n����ӡ쳲��������С��������룺3��
	�����1 1 2

	sort:����һ�����֣�Ȼ�����������������ע������
	Ԫ�������ʽ��ʹ��[ ]��������ʾ����ֱ��ʹ�ú���Arrays
	��غ������������

	search:����ҵ��������ҵ���λ�ã����û�ҵ�������-1��
	��ʾ�����Զ�����������Ȼ��ʹ��Arrays��غ������в��ҡ�

	getBirthDate:����n�����֤��Ȼ��������n����ݺŵ���
	���ճ�ȡ����������-��-�ո�ʽ�����

	�����벻���⼸���ַ���(fib,sort,search,getBirthDate)
	��ʱ����ʾexit��

	ע�⣺�ڴ��������ʱ�򣬾���ȫ��ʹ��Scanner��nextLine()
	�����������룬����������β�س�����δ����Ӱ���´�����������

	�ο���jdk�ĵ���Arrays��String*/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			String s1 = sc.next();   //����Ҫ��һ��String�洢������ַ�����������������ַ�������ƥ��			                         
			if("fib".equals(s1)) {  //����ʹ��if("fib".euqals(sc.nexLine()) ��Ϊ�������sort
				                    //��һ��ƥ�䲻�ɹ��������Ѿ���sort�����˼��̻�����,��һ��ƥ���Ƿ�
				                    //����sort����ȡ��һ�У��������Ҫ��������sort�Ż�ƥ��
				String str = sc.next();
				int n = Integer.parseInt(str);				
				for(int i = 0;i<n;i++) {
					System.out.print(fib(i)+" ");
				}
				
			}else if("sort".equals(s1)){ //����sort			    
				String str = sc.next();// ¼���ַ���
				 
		        String[] strs = str.split("\\s+");// ʹ��������ʽ���зָ�
		        for (String string : strs) {
					System.out.println(string);
				}
		        
		       /* int[] is = new int[strs.length];
		        for (int i = 0; i < strs.length; i++) {// ����String���飬��ֵ��int����
		            is[i] = Integer.parseInt(strs[i]);
		        }
		        System.out.println("1");
		 
		        Arrays.sort(is);// ʹ�����鹤�����������Ҳ�����Լ�ʹ��ð�ݻ�ѡ����������������
		 
		        StringBuffer sb = new StringBuffer();
		        for (int i = 0; i < is.length; i++) {// ��������ƴ��
		            if (i == is.length - 1) {
		                sb.append(is[i]);
		            } else {
		                sb.append(is[i] + ",");
		            }
		        }
		 
		        System.out.println(sb.toString());*/
				    
				  /*  int[] arr = new int[str2.length()]; //����������������
				    for(int i =0;i<str2.length();i++) {
				    	arr[i] = Integer.parseInt(str2.charAt(i)+"");
				    }				
				    Arrays.sort(arr); //�������������				    
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
