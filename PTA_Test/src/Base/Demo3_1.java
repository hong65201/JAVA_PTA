/*package Base;

import java.util.Scanner;

public class Demo3_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int n = Integer.parseInt(s);
		Person[] pArr = new Person[n];
		
		for(int i =0;i < n;i++) {
			String str = sc.nextLine();
			//对输入数据分割成字符串数组
			String[] arr = str.split("\\s");
			//类型转换
			int age = Integer.parseInt(arr[1]);
			boolean b =Boolean.parseBoolean(arr[2]);
			pArr[i] = new Person(arr[0], age,b);
			
		}
		for(int j=n-1;j>=0;j--) {	
				Person p =pArr[j];
				System.out.println(p.toString());												
		}
		Person pNoPara = new Person();
		System.out.println(pNoPara.toString());
	}

}
class Person{
	private String name;
	private int age;
	private boolean gender;
	private int id;
	
	public Person() {
		System.out.println("This is constructor");
		System.out.println(name+","+age+","+gender+","+id);
	}
	public Person(String name, int age, boolean gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", gender=" + gender + ", id=" + id + "]";
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
	public boolean isGender() {
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	
}
*/