package Base;

import java.util.Scanner;
public class Demo1_3 {

	public static void main(String[] args) {
		/*�����������10000�ң���20000��������������
		 * Ӧ�Ķ������ַ������˽����ַ�����ʮ�������ַ�����
		 *�����ַ����е�ÿ�����ֳ�ȡ������Ȼ���������ּ�����͡�
		 */
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			int a = sc.nextInt();			
			if(a>=10000 && a<=20000) {
				System.out.println(Integer.toBinaryString(a)+","+Integer.toOctalString(a)+","+Integer.toHexString(a));
			}else {
				String str = String.valueOf(a);
				int[] arr = new int[str.length()];
				String str2 = str.replace("-","");  //����ȥ����-��
				System.out.println(str2);
				for(int i =0 ; i<str2.length();i++) {
					arr[i] = Integer.parseInt(str2.charAt(i)+"");
					System.out.print(arr[i]+" ");
					
				}
				int y =0;   //���붨����ѭ���⣬����forѭ��ִ�����
				            //����y�ᱻ������������
				for(int z = 0;z<arr.length;z++) {				
					y=y+arr[z];					
				}
				System.out.println(y);
				
			}
		}
	}

}
