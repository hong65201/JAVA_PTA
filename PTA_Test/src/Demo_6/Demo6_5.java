package Demo_6;

import java.util.ArrayList;
import java.util.Scanner;

//10.7 Car对象每输入一次push一次和打印输出Car出错，改为一次性输入m个对象

public class Demo6_5 {
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m,n;
	
		while(true) {
			String option = sc.nextLine();
			if(!option.equals("quit")) {
				// m = 入栈个数  n = 出栈个数
				m = Integer.parseInt(sc.nextLine());
				n = Integer.parseInt(sc.nextLine());
				
			}else {
				break;				
			}
			if(option.equals("Integer")) {
				System.out.println("Integer Test");
				//定义stack<Integer>
				ArrayListGeneralStack<Integer> stack = new ArrayListGeneralStack<Integer>();
				String str = sc.nextLine();
				String[] pushNums = str.split("\\s");
				//入栈m次
				for(int i = 0;i<  m;i++) {
					Integer pushnum = Integer.parseInt(pushNums[i]);
					stack.push(pushnum);
					System.out.println("push:"+pushnum);
				}
			
				//出栈n次
				for(int j = 0;j < n;j++) {
					Integer popnum = stack.pop();
					System.out.println("pop:"+popnum);
				}
				//打印栈的toString方法
				System.out.println(stack.toString());
				//栈中剩余元素出栈并累加输出
				int sum = 0;
				for(int i = stack.size() - 1;i>=0;i--) {
					sum += (Integer)stack.pop();
				}
				System.out.println("sum="+sum);
				//打印标识信息
				System.out.println(stack.getClass().getInterfaces()[0]);
			}
			if(option.equals("Double")) {
				System.out.println("Double Test");
				//定义stack<Double>
				ArrayListGeneralStack<Double> stack = new ArrayListGeneralStack<Double>();
				
				String str = sc.nextLine();
				String[] pushNums = str.split("\\s");
				//入栈m次
				for(int i = 0;i<  m;i++) {
					Double pushnum = Double.parseDouble(pushNums[i]);
					stack.push(pushnum);
					System.out.println("push:"+pushnum);
				}
			
				//出栈n次
				for(int j = 0;j < n;j++) {
					Double popnum = stack.pop();
					System.out.println("pop:"+popnum);
				}
				//打印栈的toString方法
				System.out.println(stack.toString());
				//栈中剩余元素出栈并累加输出
				double sum = 0;
				for(int i = stack.size() - 1;i>=0;i--) {
					sum += (Double)stack.pop();
				}
				System.out.println("sum="+sum);
				//打印标识信息
				System.out.println(stack.getClass().getInterfaces()[0]);
			}
			//输入Car情况
		if(option.equals("Car")) {
			//定义stack<Car>
			ArrayListGeneralStack<Car> stack = new ArrayListGeneralStack<Car>();
			System.out.println("Car Test");
			/*String s1 = "";
			//串联字符串，一次性输出m次后统一push
			
			for(int z = 0;z < m;z++) {
				String strCar = sc.nextLine();
				s1 += strCar+" ";
			}*/
			for(int i = 0;i < m;i++) {
				String strCar = sc.nextLine();
				String[] strArrCar = strCar.split("\\s");
				int id = Integer.parseInt(strArrCar[0]);
				Car c = new Car();
				c.setId(id);
				c.setName(strArrCar[1]);
				stack.push(c);
				System.out.println("push:"+c.toString());
				
			}
			//String[] strArrCar = s1.split("\\s");
			/*for(int i = 0 ;i < m;i++) {
				//对m个对象分配id与name
				int id = Integer.parseInt(strArrCar[i*2]);
				Car c = new Car();
				c.setId(id);
				c.setName(strArrCar[1+i*2]);
				stack.push(c);
				System.out.println("push:"+c.toString());
			}*/
			//把stack中所有剩余元素出栈
			for(int j = 0;j < n;j++) {
					if(!stack.empty()) {
						
						Car c = stack.pop();
						System.out.println("pop:"+c.toString());
					}else {
						System.out.println("pop:null");
					}
				
			}
			System.out.println(stack.toString());
			//将栈中元素出栈，并将其name依次输出。
			for(int i = stack.size() - 1;i>=0;i--) {
				Car c = stack.pop();
				System.out.println(c.getName());
			}
			//打印标识
			System.out.println(stack.getClass().getInterfaces()[0]);
		}
		}
	}
}
interface GeneralStack<T>{
	public void push(T item);            //如item为null，则不入栈直接返回null。
	public T pop();                 //出栈，如为栈为空，则返回null。
	public T peek();                //获得栈顶元素，如为空，则返回null.
	public boolean empty();//如为空返回true
	public int size();     //返回栈中元素数量

}
class ArrayListGeneralStack<T> implements GeneralStack<T>{
	ArrayList<T> list = new ArrayList<>();
	
	public String toString() {
		return list.toString();
	}

	@Override
	public void push(T item) {
		list.add(item);
	}

	@Override
	public T pop() {
		T obj = null;
		if(!list.isEmpty()) {
			//集合最后的元素为栈顶
			obj = list.get(list.size() - 1);
			//取出后删除
			list.remove(list.size() - 1);
			return obj;
		}else {
			
			return null;
		}
		
	}

	@Override
	public T peek() {
		
		return list.get(list.size() - 1);
	}

	@Override
	public boolean empty() {
		
		return list.isEmpty();
	}

	@Override
	public int size() {
		
		return list.size();
	}
	
}
//Car对象
class Car{
	private int id;
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Car [id=" + id + ", name=" + name + "]";
	}
	
}
