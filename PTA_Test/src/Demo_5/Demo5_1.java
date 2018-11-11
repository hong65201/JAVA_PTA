package Demo_5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Demo5_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nStr = sc.nextLine();
		//输入n
		int n = Integer.parseInt(nStr);
		//输入n行name age，并创建n个对象放入集合
		ArrayList<PersonSortable2> list = new ArrayList<>();
		for(int i = 0 ;i < n;i++) {
			String Option = sc.nextLine();
			//strArr[0] = name 
			//strArr[1] = age
			String[] strArr = Option.split("\\s");
			int age = Integer.parseInt(strArr[1]);
			PersonSortable2 newps2 = new PersonSortable2(strArr[0], age);
			list.add(newps2);
			
		}
		//对集合按照name进行升序排序后输出。
		Collections.sort(list,  new Comparator<PersonSortable2>() {

			@Override
			public int compare(PersonSortable2 p1, PersonSortable2 p2) {
				
				
				return p1.getName().compareTo(p2.getName());
			}
		});
		//标识语句
		System.out.println("NameComparator:sort");
		//遍历输出集合元素
		for (PersonSortable2 personSortable2 : list) {
			System.out.println(personSortable2);
		}
		//对集合按照age进行升序排序后输出。
		Collections.sort(list, new Comparator<PersonSortable2>() {

			@Override
			public int compare(PersonSortable2 o1, PersonSortable2 o2) {
				
				return o1.getAge()-o2.getAge();
			}
		});
		//标识语句
		System.out.println("AgeComparator:sort");
		//遍历输出集合元素
				for (PersonSortable2 personSortable2 : list) {
					System.out.println(personSortable2);
				}
		
				System.out.println(Arrays.toString(NameComparator.class.getInterfaces()));
				System.out.println(Arrays.toString(AgeComparator.class.getInterfaces()));
	}
}
//PersonSortable2类
class PersonSortable2{
	
	private String name;
	private int age;
	public PersonSortable2(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return name+"-"+age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
class NameComparator implements Comparator<PersonSortable2>{

	@Override
	public int compare(PersonSortable2 p1, PersonSortable2 p2) {
		int n = p1.getName().compareTo(p2.getName());
		return n;
	}
	
}
class AgeComparator implements Comparator<PersonSortable2>{

	@Override
	public int compare(PersonSortable2 p1, PersonSortable2 p2) {
		return p1.getAge()-p2.getAge();
		
	}
	
	
}
