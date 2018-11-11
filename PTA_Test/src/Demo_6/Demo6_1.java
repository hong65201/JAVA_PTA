package Demo_6;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Demo6_1 {
	public static void main(String[] args) {
		//建立ArrayIntegerStack对象
		ArrayListIntegerStack als = new ArrayListIntegerStack();
		//输入m个值，均入栈。每次入栈均打印入栈返回结果。
		Scanner sc = new Scanner(System.in);
		int m = Integer.parseInt(sc.nextLine());
		String nums =  sc.nextLine();
		String[] pushNums = nums.split("\\s");
		
		for(int i = 0;i < m;i++) {
			als.push(Integer.parseInt(pushNums[i]));
		}
		//输出： 栈顶元素，输出是否为空，然后输出size.
		System.out.println(als.peek()+","+als.empty()+","+als.size());
		//输出栈中所有元素（调用其toString()方法）
		System.out.println(als);
		//输入x，然后出栈x次，每次均打印出栈的对象
		int n = Integer.parseInt(sc.nextLine());
		for(int i = 0;i < n;i++) {
			als.pop();
		}
		//输出： 栈顶元素，输出是否为空，然后输出size.
		System.out.println(als.peek()+","+als.empty()+","+als.size());
	    //输出栈中所有元素（调用其toString()方法）
		System.out.println(als);
	}
}
interface IntegerStack{
public Integer push(Integer item); //如item为null，则不入栈直接返回null。否则直接入栈，然后返回item。
public Integer pop();              //出栈，如栈为空，则返回null。
public Integer peek();             //获得栈顶元素，如栈顶为空，则返回null。注意：不要出栈
public boolean empty();           //如过栈为空返回true
public int size();                //返回栈中元素数量
}
class ArrayListIntegerStack implements IntegerStack{	
		//新建ArrayList或者LinkedList，作为栈的内部存储
		ArrayList<Integer> stackList = new ArrayList<>();
		
	
	@Override
	public Integer push(Integer item) {
		if(item == null) {

			return null;
		}else {
			stackList.add(item);
			System.out.println(item);
			return item;
		}
	}

	@Override
	public Integer pop() {
		if(stackList.isEmpty()) {
			System.out.println("null");
			return null;
		}else {	
			Integer i = stackList.get(stackList.size()-1);
			stackList.remove(stackList.size()-1);
			
			System.out.println(i);
			return i;
		}
		
	}

	@Override
	//获得栈顶元素，如栈顶为空，则返回null。注意：不要出栈
	public Integer peek() {
		if(empty()) {
			return null;
		}else {
			
			return stackList.get(stackList.size()-1);
			
		}
		
	}

	@Override
	public boolean empty() {
		
		return stackList.isEmpty();
	}

	@Override
	public int size() {
		
		return stackList.size();
	}

	@Override
	public String toString() {
		return stackList + "";
	}

	

	
}