package Demo_5;

import java.util.Arrays;
import java.util.Scanner;

public class Demo5_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//输入n，建立可包含n个元素的ArrayIntegerStack对象
		int n = Integer.parseInt(sc.nextLine());
		ArrayIntegerStack ais = new ArrayIntegerStack();
		ais.CreatStack(n);
		//输入m个值，均入栈。每次入栈均打印入栈返回结果
		int m = Integer.parseInt(sc.nextLine());
		String str1 = sc.nextLine();
		String[] Option = str1.split("\\s");
		
		for(int i = 0;i < m;i++) {
			Integer item = Integer.parseInt(Option[i]) ;
			ais.push(item);
			//System.out.println(item);
		}
		//输出栈顶元素，输出是否为空，输出size
		System.out.println(ais.peek()+","+ais.empty()+","+ais.size());
		//使用Arrays.toString()输出内部数组中的值
		ais.arraysToString();
		//输入x，然后出栈x次，每次出栈均打印
		int x = Integer.parseInt(sc.nextLine());
		for(int i = 0;i < x;i++) {
			System.out.println(ais.pop());			
		}
		//输出栈顶元素，输出是否为空，输出size
		System.out.println(ais.peek()+","+ais.empty()+","+ais.size());
		//使用Arrays.toString()输出内部数组中的值
		ais.arraysToString();
		
	}
}
interface IntegerStack{
	public Integer push(Integer item);
	//如果item为null，则不入栈直接返回null。如果栈满，也返回null。如果插入成功，返回item。
	public Integer pop();   //出栈，如果为空，则返回null。出栈时只移动栈顶指针，相应位置不置为null
	public Integer peek();  //获得栈顶元素，如果为空，则返回null.
	public boolean empty(); //如果为空返回true
	public int size();      //返回栈中元素个数
}
class ArrayIntegerStack implements IntegerStack{
	private int size;
	private Integer[] stack;
	
	public void CreatStack(int n ) {
		//栈容量为n
		stack = new Integer[n];
	}
	public void arraysToString() {
		System.out.println(Arrays.toString(stack));
	}
		
	@Override
	public Integer push(Integer item) {
		int StackLength = stack.length;
		//检查入栈item是否为Null和栈是否已满
		if(item == null || (size >= StackLength)) {
			System.out.println("null");
			return null;
		}else 
			{		
			
			stack[size] = item;
			System.out.println(item);
			size++;
			return item;
		}

	}

	@Override
	public Integer pop() {
		Integer PopItem = peek();
		if(empty()) {
			return null;
			
		}else {
			size--;
			return PopItem;
			
		}
			
	}

	@Override
	public Integer peek() {		
		if(empty()) {
			return null;
		}else {
			//返回栈顶元素
			return (Integer)stack[size - 1];
		}

	}

	@Override
	public boolean empty() {
		
		return size == 0;
	}
	public boolean full() {
		return size == stack.length;
	}

	@Override
	public int size() {
		
		return size;
	}
	
}