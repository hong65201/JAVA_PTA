package Base;

import java.util.Scanner;

public class Demo3_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();		
		int n = Integer.parseInt(s1);//n为要创建的对象数量
		Person[] pArr = new Person[n];
		for(int i =0;i<n;i++) {
			String s2 = sc.nextLine();
			String[] arr = s2.split("\\s");
			String name = arr[0].toString();
			int age = Integer.parseInt(arr[1]);
			boolean gender = Boolean.parseBoolean(arr[2]);
			pArr[i] = new Person(name, gender, age);						
		}
		for(int j =n-1;j>=0;j--) {
			Person p =pArr[j];
			
			System.out.println(p.toString());
			
		}
		Person pNoPara = new Person();
		System.out.println(pNoPara.toString());
		
	}
}
class Person{
	private String name;
	private boolean gender;
	private int age;
	private int id;
	static int count = 0;
	
	{
		id=count++;
		System.out.println("This is initialization block, id is "+id);
		
	}
	static {
		System.out.println("This is static initialization block");
	}
	public Person() {
		System.out.println("This is constructor");
		
		System.out.println(name+","+age+","+gender+","+id);
		
		
	}
	
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public Person(String name, boolean gender, int age) {
		super();
		this.name = name;
		this.gender = gender;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", gender=" + gender + ", id=" + id + "]";
	}
	
	
}
