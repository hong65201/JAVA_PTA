package Demo_6;


import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.Map;
import java.util.List;

public class Demo6_3 {
	public static void main(String[] args) throws IOException {
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder("");
		//��ȡ�ַ����е�Ӣ�ĵ���
		//String str = "";
		while(true) {
			String date = read.readLine();
			
			if(!date.equals("!!!!!")) {
				sb.append(date);
				sb.append("\t\n");
				
			}
			else break;
		}
		read.close();
		String str = sb.toString();
		//���������滻�ɿ��ַ���
		String str2 = str.replaceAll("[!.,:*?]", "");
		//����ո��滻��һ���ո�
		String newStr = str2.replaceAll("\\s+", " ");
		//System.out.println(newStr);
		String[] strArr = newStr.split("(\\s)+");
		//ȫ��ת��ΪСд�ַ���
		for(int i = 0;i<strArr.length;i++) {
			strArr[i] = strArr[i].toLowerCase();
		}

		TreeMap<String, Integer> map = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);
		for (String string : strArr) {
			//�ж�map���Ƿ����������ʣ�������value+1���������½�
			map.put(string, map.containsKey(string)? map.get(string) + 1 :1);
			
		}

		//��TreeMapת��ΪList,ʹ��Collections.sort����
		List<Map.Entry<String, Integer>> entryList = new ArrayList<Entry<String, Integer>>(map.entrySet());
		
		Collections.sort(entryList, new Comparator<Map.Entry<String, Integer>>() {

			@Override
			public int compare(Entry<String, Integer> map1, Entry<String, Integer> map2) {
				//����Ƚ�treeMap��Value
				int n = map2.getValue() - map1.getValue();
				//����Ƚ�treeMap��key
				return n == 0? map1.getKey().compareTo(map2.getKey()) : n;
			}
		});
		//������µ�������
		System.out.println(map.size());
		//������ִ���ǰ10�ĵ���
		int n = 0;			
		for (Entry<String, Integer> entry : entryList) {
			if(n < 10) {
				System.out.println(entry.getKey()+"="+entry.getValue());
				n++;
			}else {
				break;
			}
		}
		
		
}
}
