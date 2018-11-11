package Demo_6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;
/*
 * 用hashMap<String,List<Integer>>存储
 * 其中hashMap的String存储单词字符串
 * List存储出现过的行数line
 * 
 * 在搜索的时候，将关键字切割为String数组，遍历每个单词，取出他的List
 * 然后求所有List的交集（retainAll方法）
 * 如果没有交集则输出"found 0 results"
 */

public class Demo6_4 {
	public static void main(String[] args) {
		//用List存放所输入的行数
		ArrayList<String> lineList = new ArrayList<>();
		TreeMap<String, ArrayList<Integer>> map = new TreeMap<>();
		//这里注意list不能实例化，因为hashMap中每一个Key都要有一个独立的List存储单词出现的line
		//并不能公用List
		ArrayList<Integer> list ;
		
		Scanner sc = new Scanner(System.in);
		int line = 1;
		//int line_Arr = 0;
		
		while(true) {
			String str = sc.nextLine();
			//把每行内容存在lingArr,以便后面输出
			lineList.add(str);
			
			//判断输入是否结束
			if(str.equals("!!!!!")) {
				break;
			}
			//获取单词String数组
			String[] word = str.split("\\s");
			for (String string : word) {
				//hashMap中不包含这个单词
				if(!map.containsKey(string)) {
					list = new ArrayList<>();
					list.add(line);
					map.put(string, list);
				}else {
					//hashMap包含这个单词
					//对list去重复
					if(!map.get(string).contains(line)) {
						
						map.get(string).add(line);
					}
				}
			}
			//这次输出处理完毕,line++
			line++;
		}
		//输出map
		for (Entry<String, ArrayList<Integer>> word : map.entrySet()) {
			System.out.println(word.getKey()+"="+word.getValue().toString());
			
		}
		while(true) {
			
			//获取要搜索的关键字
			String index = sc.nextLine();
			String[] indexArr = index.split("\\s");
			//如果只有一个关键词，就直接输出所在list和所在line
			if(indexArr.length == 1) {
				//找得到
				if(map.containsKey(indexArr[0])) {					
					ArrayList<Integer> resultList = map.get(indexArr[0]);
					System.out.println(resultList);
					for (Integer integer : resultList) {
						System.out.println("line "+integer+":"+lineList.get(--integer));
					}
					//找不到
				}else {
					System.out.println("found 0 results");
				}
				//处理关键词数量大于1的情况
				/*
				 *  先把第一个关键词List给newlist，然后循环n-1次跟newlist对比求交集
					得出的集合就是结果
					如果最后newlist为空，则找不到，打印 found 0 results
					否则打印集合，输出所在行数
				 */
			}else {
				
				//处理多个关键词无法找到的情况
				for(int i = 0;i < indexArr.length;i++) {
					if(map.get(indexArr[i]) == null) {
						System.out.println("found 0 results");
						System.exit(0);
					}
				}
				//用来对比的集合newList
				ArrayList<Integer> newList  = map.get(indexArr[0]);
				//剩下的循环跟newList作比较求交集
				for(int i = 1 ;i < indexArr.length;i++) {
					ArrayList<Integer> keyList = map.get(indexArr[i]);
					newList.retainAll(keyList);
				}
				//判断newList是否为空，空则查询失败
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
