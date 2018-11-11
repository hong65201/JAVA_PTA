package Base;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
/*
 * 思路：
 * 1.创建Scanner对象
 * 2.重复n次把身份证存进字符串数组IdNums
 * 3.重复n次把身份证的以 （6,10）+"-"+（10,12）+"-"+（12,14） 形式存到list集合中
 * 4.对list集合排序
 * 5.重复n次把身份(6,16)截取，存在到list2集合中
 * 6.对list2集合排序
 * 7.把list2转化为字符串数组temp
 * 8.无限循环判断输入的字符串是什么，分别执行操作
 * 9.sort1:遍历输出集合list
 * 10.sort2:双重循环查找字符串数组IDNums[i]是否包含temo[j]，如果包含则输出IDNums[i]
 */
public class Demo2_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int n = Integer.parseInt(s);
		String[] ID_18 = new String[n]; //存储18位身份证
		//把身份证存进字符串数组
		for(int i =0;i<n;i++) {
			String str2 = sc.nextLine();
			ID_18[i] = str2;
		}
		String[] ID_YMD = new String[n];//存储身份证的年-月-日
		ArrayList<String> sort1List = new ArrayList<>();//存储8位生日
		for(int i =0;i < n;i++) {
			ID_YMD[i] = ID_18[i].substring(6, 10)+"-"+ID_18[i].substring(10,12)+"-"+ID_18[i].substring(12, 14);
			sort1List.add(ID_YMD[i]); //存入集合以便排序
		}
		Collections.sort(sort1List);//以年-月-日排序
		
		String[] ID_YMD2 = new String[n];
		ArrayList<String> sort2List = new ArrayList<>();
		for(int i = 0;i <n ;i++) {
			ID_YMD2[i] = ID_18[i].substring(6, 14);
			sort2List.add(ID_YMD2[i]);
		}
		Collections.sort(sort2List);
		//把list2转化为字符串数组temp
		String[] temp = new String[sort2List.size()];
		sort2List.toArray(temp);


		
		//输入选项
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
