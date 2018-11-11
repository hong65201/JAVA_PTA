package Demo_6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;
/*
 * ��hashMap<String,List<Integer>>�洢
 * ����hashMap��String�洢�����ַ���
 * List�洢���ֹ�������line
 * 
 * ��������ʱ�򣬽��ؼ����и�ΪString���飬����ÿ�����ʣ�ȡ������List
 * Ȼ��������List�Ľ�����retainAll������
 * ���û�н��������"found 0 results"
 */

public class Demo6_4 {
	public static void main(String[] args) {
		//��List��������������
		ArrayList<String> lineList = new ArrayList<>();
		TreeMap<String, ArrayList<Integer>> map = new TreeMap<>();
		//����ע��list����ʵ��������ΪhashMap��ÿһ��Key��Ҫ��һ��������List�洢���ʳ��ֵ�line
		//�����ܹ���List
		ArrayList<Integer> list ;
		
		Scanner sc = new Scanner(System.in);
		int line = 1;
		//int line_Arr = 0;
		
		while(true) {
			String str = sc.nextLine();
			//��ÿ�����ݴ���lingArr,�Ա�������
			lineList.add(str);
			
			//�ж������Ƿ����
			if(str.equals("!!!!!")) {
				break;
			}
			//��ȡ����String����
			String[] word = str.split("\\s");
			for (String string : word) {
				//hashMap�в������������
				if(!map.containsKey(string)) {
					list = new ArrayList<>();
					list.add(line);
					map.put(string, list);
				}else {
					//hashMap�����������
					//��listȥ�ظ�
					if(!map.get(string).contains(line)) {
						
						map.get(string).add(line);
					}
				}
			}
			//�������������,line++
			line++;
		}
		//���map
		for (Entry<String, ArrayList<Integer>> word : map.entrySet()) {
			System.out.println(word.getKey()+"="+word.getValue().toString());
			
		}
		while(true) {
			
			//��ȡҪ�����Ĺؼ���
			String index = sc.nextLine();
			String[] indexArr = index.split("\\s");
			//���ֻ��һ���ؼ��ʣ���ֱ���������list������line
			if(indexArr.length == 1) {
				//�ҵõ�
				if(map.containsKey(indexArr[0])) {					
					ArrayList<Integer> resultList = map.get(indexArr[0]);
					System.out.println(resultList);
					for (Integer integer : resultList) {
						System.out.println("line "+integer+":"+lineList.get(--integer));
					}
					//�Ҳ���
				}else {
					System.out.println("found 0 results");
				}
				//����ؼ�����������1�����
				/*
				 *  �Ȱѵ�һ���ؼ���List��newlist��Ȼ��ѭ��n-1�θ�newlist�Ա��󽻼�
					�ó��ļ��Ͼ��ǽ��
					������newlistΪ�գ����Ҳ�������ӡ found 0 results
					�����ӡ���ϣ������������
				 */
			}else {
				
				//�������ؼ����޷��ҵ������
				for(int i = 0;i < indexArr.length;i++) {
					if(map.get(indexArr[i]) == null) {
						System.out.println("found 0 results");
						System.exit(0);
					}
				}
				//�����Աȵļ���newList
				ArrayList<Integer> newList  = map.get(indexArr[0]);
				//ʣ�µ�ѭ����newList���Ƚ��󽻼�
				for(int i = 1 ;i < indexArr.length;i++) {
					ArrayList<Integer> keyList = map.get(indexArr[i]);
					newList.retainAll(keyList);
				}
				//�ж�newList�Ƿ�Ϊ�գ������ѯʧ��
				if(newList.size() == 0) {
					System.out.println("found 0 results");
				}else {
					System.out.println(newList);
					for (Integer integer : newList) {
						System.out.println("line "+integer+":"+lineList.get(--integer));
					}
				}
				
			}
			
		}
		
	}
}
