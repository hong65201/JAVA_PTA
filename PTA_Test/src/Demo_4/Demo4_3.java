package Demo_4;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Demo4_3 {
	public static void main(String[] args) {
		Company c1 = new Company("MicroSoft");
		Company c2 = new Company("IBM");
		Person e1 = new Employee("Li", 35, true, 60000.124, c1);
		Person e2 = new Employee("Li", 35, true, 60000.124, c1);
		Person e3 = new Employee("Li", 35, true, 60000.124, c2);
		Person e4 = new Employee("Li", 35, true, 60000.123, c2);
		Person e5 = new Employee("Li", 35, true, 60000.126, c2);
		Person e6 = new Employee("Li", 35, true, 60000.126, null);
		System.out.println(e1.equals(e2));
		System.out.println(e1.equals(e3));
		System.out.println(e3.equals(e4));
		System.out.println(e3.equals(e5));
		System.out.println(e5.equals(e6));
		
		
		
		
		
	
	}
}
//Person抽象类
abstract class Person{
	String name;
	int age;
	boolean gender;
	public Person(String name, int age, boolean gender) {
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
		Person other = (Person) obj;
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
//Student类
class Student extends Person {
	String stuNo;
	String clazz;
	public Student(String name, int age, boolean gender, String stuNo, String clazz) {
		super(name, age, gender);
		this.stuNo = stuNo;
		this.clazz = clazz;
	}
	@Override
	public String toString() {
		return "Student:"+name+"-"+age+"-"+gender+"-"+stuNo+"-"+clazz;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((clazz == null) ? 0 : clazz.hashCode());
		result = prime * result + ((stuNo == null) ? 0 : stuNo.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (clazz == null) {
			if (other.clazz != null)
				return false;
		} else if (!clazz.equals(other.clazz))
			return false;
		if (stuNo == null) {
			if (other.stuNo != null)
				return false;
		} else if (!stuNo.equals(other.stuNo))
			return false;
		return true;
	}

}
//conpany类
class Company{
	String name;

	public Company(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
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
		Company other = (Company) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}
//Employee类
class Employee extends Person{
	Company company ;
	double salary;
	public Employee(String name, int age, boolean gender, double salary , Company company) {
		super(name, age, gender);
		this.company = company;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee:"+name+"-"+age+"-"+gender+"-"+company+"-"+salary;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((company == null) ? 0 : company.hashCode());
		long temp;
		temp = Double.doubleToLongBits(salary);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		DecimalFormat df = new DecimalFormat("#.##");
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (company == null) {
			if (other.company != null)
				return false;
		} else if (!company.equals(other.company))
			return false;
		//修改equals关于salary的判断，用DecimalFormat比较 保留小数点后一位的salary的值
		/*if (Double.doubleToLongBits(salary) != Double.doubleToLongBits(other.salary))
			return false;*/
		if(!df.format(salary).equals(df.format(other.salary))) {
			return false;
		}
		
		return true;
	}
	
	
}
