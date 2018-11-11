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
		//截取字符串中的英文单词
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
		//将标点符号替换成空字符串
		String str2 = str.replaceAll("[!.,:*?]", "");
		//多个空格替换成一个空格
		String newStr = str2.replaceAll("\\s+", " ");
		//System.out.println(newStr);
		String[] strArr = newStr.split("(\\s)+");
		//全部转换为小写字符串
		for(int i = 0;i<strArr.length;i++) {
			strArr[i] = strArr[i].toLowerCase();
		}

		TreeMap<String, Integer> map = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);
		for (String string : strArr) {
			//判断map中是否包含这个单词，包含则value+1不包含则新建
			map.put(string, map.containsKey(string)? map.get(string) + 1 :1);
			
		}

		//把TreeMap转换为List,使用Collections.sort排序
		List<Map.Entry<String, Integer>> entryList = new ArrayList<Entry<String, Integer>>(map.entrySet());
		
		Collections.sort(entryList, new Comparator<Map.Entry<String, Integer>>() {

			@Override
			public int compare(Entry<String, Integer> map1, Entry<String, Integer> map2) {
				//降序比较treeMap的Value
				int n = map2.getValue() - map1.getValue();
				//升序比较treeMap的key
				return n == 0? map1.getKey().compareTo(map2.getKey()) : n;
			}
		});
		//输出文章单词总数
		System.out.println(map.size());
		//输出出现次数前10的单词
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
