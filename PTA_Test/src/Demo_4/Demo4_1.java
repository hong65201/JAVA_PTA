package Demo_4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Demo4_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//输入n1，使用无参构造函数创建n1个对象，放入数组persons1。
		String sn1 = sc.nextLine();
		int n1 = Integer.parseInt(sn1);
		ArrayList<PersonOverride> list = new ArrayList<>();
		for(int i=0;i<n1;i++) {
			PersonOverride po = new PersonOverride();
			list.add(po);	
		}
		// 输入n2，然后指定name age gender。
		//每创建一个对象都使用equals方法比较该对象是否已经在数组中存在，
		//如果不存在，才将该对象放入数组persons2。
		String sn2 = sc.nextLine();
		int n2 = Integer.parseInt(sn2);
		ArrayList<PersonOverride> list2 = new ArrayList<>();
		for(int i =0;i < n2 ;i++) {
			String in = sc.nextLine();
			String[] inArr = in.split("\\s");
			int age = Integer.parseInt(inArr[1]);
			boolean gender = Boolean.parseBoolean(inArr[2]);
			PersonOverride p = new PersonOverride(inArr[0], age, gender);
			//判断是否一样
			if(!list2.contains(p)) {
				list2.add(p);
			}
			
		}
		for (PersonOverride po1 : list) {
			System.out.println(po1);
		}
		for(PersonOverride po2 : list2) {
			System.out.println(po2);
		}
		System.out.println(list2.size());
		System.out.println(Arrays.toString(PersonOverride.class.getConstructors()));
	}

}
class PersonOverride{
	private String name;
	private int age;
	private boolean gender;
	public PersonOverride() {
		this("default",1,true);
	}
	public PersonOverride(String name, int age, boolean gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	

	@Override
	public String toString() {
		return name+"-"+age+"-"+gender;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + (gender ? 1231 : 1237);
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PersonOverride other = (PersonOverride) obj;
		if (age != other.age)
			return false;
		if (gender != other.gender)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
	
}
