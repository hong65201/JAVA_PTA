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
		//获取文本
		while(true) {
			String str2 = sc.nextLine();
			if(!str2.equals("!!!!!")) {
				str += str2 + " ";
			}else {
				break;
			}
		}
		//用单个空格替换多个空格
		str = str.replaceAll("\\s+", " ");
		String[] strArr = str.split("\\s");
		//遍历strArr将每个元素添加到treeMap
		TreeMap<String, Integer> map = new TreeMap<>();
		for (String string : strArr) {
			map.put(string, map.containsKey(string)? map.get(string) + 1 :1);
		}

		//把TreeMap转换为List,使用Collections.sort排序
		List<Map.Entry<String, Integer>> entryList = new ArrayList<Entry<String, Integer>>(map.entrySet());
		
		Collections.sort(entryList, new Comparator<Map.Entry<String, Integer>>() {

			@Override
			public int compare(Entry<String, Integer> map1, Entry<String, Integer> map2) {
				//升序比较treeMap的key
				return map1.getKey().compareTo(map2.getKey()) ;
			}
		});
		//输出文章不同单词总数
		System.out.println(map.size());
		//如果单词数大于10则输出前10，否则全部输出
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