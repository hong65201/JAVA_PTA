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
		//截取字符串中的英文单词
		while(true) {
			String date = read.readLine();
			
			if(!date.equals("!!!!!")) {
				sb.append(date);
				sb.append("\t\n");
				
			}
			else break;
		}
		read.close();
		//StringBuilder转换为String
		String str = sb.toString();
		//分割为字符串数组
		String[] strArr = str.split("\\s+");
		//添加到list
		ArrayList<String> list = new ArrayList<>();
		for (String string : strArr) {
			if(!list.contains(string)) {
				list.add(string);
			}
		}
		//对list排序,默认以字母顺序排序
		Collections.sort(list);
		//输出不同单词数量
		System.out.println(list.size());
		//如果单词数量>10则输出前十元素，否则输出全部List
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
