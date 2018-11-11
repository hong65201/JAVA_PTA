package Demo_6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.Map.Entry;

public class Demo6_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = "";
		//��ȡ�ı�
		while(true) {
			String str2 = sc.nextLine();
			if(!str2.equals("!!!!!")) {
				str += str2 + " ";
			}else {
				break;
			}
		}
		//�õ����ո��滻����ո�
		str = str.replaceAll("\\s+", " ");
		String[] strArr = str.split("\\s");
		//����strArr��ÿ��Ԫ����ӵ�treeMap
		TreeMap<String, Integer> map = new TreeMap<>();
		for (String string : strArr) {
			map.put(string, map.containsKey(string)? map.get(string) + 1 :1);
		}

		//��TreeMapת��ΪList,ʹ��Collections.sort����
		List<Map.Entry<String, Integer>> entryList = new ArrayList<Entry<String, Integer>>(map.entrySet());
		
		Collections.sort(entryList, new Comparator<Map.Entry<String, Integer>>() {

			@Override
			public int compare(Entry<String, Integer> map1, Entry<String, Integer> map2) {
				//����Ƚ�treeMap��key
				return map1.getKey().compareTo(map2.getKey()) ;
			}
		});
		//������²�ͬ��������
		System.out.println(map.size());
		//�������������10�����ǰ10������ȫ�����
		int n = 0;
		if(entryList.size()<10) {
			for(int i = 0;i < entryList.size();i++) {
				System.out.println(entryList.get(i));
			}
		}else {
			for(int i = 0;i < 10;i++) {
				System.out.println(entryList.get(i));
			}
		}
		

}
}