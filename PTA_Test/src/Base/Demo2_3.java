package Base;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
/*
 * ˼·��
 * 1.����Scanner����
 * 2.�ظ�n�ΰ����֤����ַ�������IdNums
 * 3.�ظ�n�ΰ����֤���� ��6,10��+"-"+��10,12��+"-"+��12,14�� ��ʽ�浽list������
 * 4.��list��������
 * 5.�ظ�n�ΰ����(6,16)��ȡ�����ڵ�list2������
 * 6.��list2��������
 * 7.��list2ת��Ϊ�ַ�������temp
 * 8.����ѭ���ж�������ַ�����ʲô���ֱ�ִ�в���
 * 9.sort1:�����������list
 * 10.sort2:˫��ѭ�������ַ�������IDNums[i]�Ƿ����temo[j]��������������IDNums[i]
 */
public class Demo2_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int n = Integer.parseInt(s);
		String[] ID_18 = new String[n]; //�洢18λ���֤
		//�����֤����ַ�������
		for(int i =0;i<n;i++) {
			String str2 = sc.nextLine();
			ID_18[i] = str2;
		}
		String[] ID_YMD = new String[n];//�洢���֤����-��-��
		ArrayList<String> sort1List = new ArrayList<>();//�洢8λ����
		for(int i =0;i < n;i++) {
			ID_YMD[i] = ID_18[i].substring(6, 10)+"-"+ID_18[i].substring(10,12)+"-"+ID_18[i].substring(12, 14);
			sort1List.add(ID_YMD[i]); //���뼯���Ա�����
		}
		Collections.sort(sort1List);//����-��-������
		
		String[] ID_YMD2 = new String[n];
		ArrayList<String> sort2List = new ArrayList<>();
		for(int i = 0;i <n ;i++) {
			ID_YMD2[i] = ID_18[i].substring(6, 14);
			sort2List.add(ID_YMD2[i]);
		}
		Collections.sort(sort2List);
		//��list2ת��Ϊ�ַ�������temp
		String[] temp = new String[sort2List.size()];
		sort2List.toArray(temp);


		
		//����ѡ��
		while(true) {
			String Option = sc.nextLine();
			if(Option.equals("sort1")) {
				for (String string : sort1List) {
					System.out.println(string);
				}
				continue;
				
			}else if(Option.equals("sort2")) {
				for(int i =0;i < n;i++) {
					for(int j =0;j < n;j++) {
						if(ID_18[j].contains(temp[i])) {
							System.out.println(ID_18[j]);
							break;
						}
					}
				}

				continue;
				
			}else {
				System.out.println("exit");
				break;
			}
		}
	}

}
