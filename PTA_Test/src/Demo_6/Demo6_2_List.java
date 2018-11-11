package Demo_6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Demo6_2_List {
	public static void main(String[] args) throws IOException {
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder("");
		//��ȡ�ַ����е�Ӣ�ĵ���
		while(true) {
			String date = read.readLine();
			
			if(!date.equals("!!!!!")) {
				sb.append(date);
				sb.append("\t\n");
				
			}
			else break;
		}
		read.close();
		//StringBuilderת��ΪString
		String str = sb.toString();
		//�ָ�Ϊ�ַ�������
		String[] strArr = str.split("\\s+");
		//��ӵ�list
		ArrayList<String> list = new ArrayList<>();
		for (String string : strArr) {
			if(!list.contains(string)) {
				list.add(string);
			}
		}
		//��list����,Ĭ������ĸ˳������
		Collections.sort(list);
		//�����ͬ��������
		System.out.println(list.size());
		//�����������>10�����ǰʮԪ�أ��������ȫ��List
		int n = 0;
		if(list.size() > 10) {
			for(int i = 0;i < 10;i++) {
				System.out.println(list.get(i));
			}
		}else {
			for (String string : list) {
				System.out.println(string);
			}
		}
		
	}
}
