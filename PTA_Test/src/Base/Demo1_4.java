package Base;

import java.util.Scanner;

public class Demo1_4 {
	/*1.4 jmu-Java-01����-ȡ���ָ�������5 �֣�
	����ĿҪ����������Իس��������ַ�����ʾ������
	���߸�������Ȼ��ÿ�����е���������ȫ��������͡�
	�����ʽ:
	ÿ��һ���������߸���������֤�ڸ�������Χ�ڡ�
	�����ʽ:
	�������߸������е�����֮�͡���Ŀ��֤�������ͷ�Χ�ڡ�
	��������:
	-123.01
	234
	�������:
	7
	9
	int   ��Χ -2^32~2^32
	float ��Χ -2^64~2^64*/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			String s1 = sc.nextLine(); //��ȡ�����ַ���
			int[] arr = new int[s1.length()]; //���ɴ��ÿ�����ֵ�����
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
