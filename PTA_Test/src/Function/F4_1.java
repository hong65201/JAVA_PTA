package Function;

public class F4_1 {
	public static void main(String[] args) {
		
	}
}
class Person{
	private String name;
	private int age;
	private boolean ganger;
	public Person(String name, int age, boolean ganger) {
		super();
		this.name = name;
		this.age = age;
		this.ganger = ganger;
	}
	@Override
	public String toString() {
		return name+"-"+age+"-"+ganger;
	}
	
	
}
class Company extends Person{
	public Company(String name, int age, boolean ganger) {
		super(name, age, ganger);
		
	}

	private String s;

	public String getS() {
		return s;
	}

	public void setS(String s) {
		this.s = s;
	}

	@Override
	public String toString() {
		return "Company [s=" + s + "]";
	}

	
	
}
class Employee extends Person{
	public Employee(String name, int age, boolean ganger) {
		super(name, age, ganger);
		
	}
	private Company company;
	private double salary;
	@Override
	public String toString() {
		return super.toString()+"-"+company.toString()+"-"+salary;
				
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((company == null) ? 0 : company.hashCode());
		long temp;
		temp = Double.doubleToLongBits(salary);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	
	
	
	
}