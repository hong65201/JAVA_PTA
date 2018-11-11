package Demo_5;

import java.util.Arrays;
import java.util.Scanner;

public class Demo5_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//����n�������ɰ���n��Ԫ�ص�ArrayIntegerStack����
		int n = Integer.parseInt(sc.nextLine());
		ArrayIntegerStack ais = new ArrayIntegerStack();
		ais.CreatStack(n);
		//����m��ֵ������ջ��ÿ����ջ����ӡ��ջ���ؽ��
		int m = Integer.parseInt(sc.nextLine());
		String str1 = sc.nextLine();
		String[] Option = str1.split("\\s");
		
		for(int i = 0;i < m;i++) {
			Integer item = Integer.parseInt(Option[i]) ;
			ais.push(item);
			//System.out.println(item);
		}
		//���ջ��Ԫ�أ�����Ƿ�Ϊ�գ����size
		System.out.println(ais.peek()+","+ais.empty()+","+ais.size());
		//ʹ��Arrays.toString()����ڲ������е�ֵ
		ais.arraysToString();
		//����x��Ȼ���ջx�Σ�ÿ�γ�ջ����ӡ
		int x = Integer.parseInt(sc.nextLine());
		for(int i = 0;i < x;i++) {
			System.out.println(ais.pop());			
		}
		//���ջ��Ԫ�أ�����Ƿ�Ϊ�գ����size
		System.out.println(ais.peek()+","+ais.empty()+","+ais.size());
		//ʹ��Arrays.toString()����ڲ������е�ֵ
		ais.arraysToString();
		
	}
}
interface IntegerStack{
	public Integer push(Integer item);
	//���itemΪnull������ջֱ�ӷ���null�����ջ����Ҳ����null���������ɹ�������item��
	public Integer pop();   //��ջ�����Ϊ�գ��򷵻�null����ջʱֻ�ƶ�ջ��ָ�룬��Ӧλ�ò���Ϊnull
	public Integer peek();  //���ջ��Ԫ�أ����Ϊ�գ��򷵻�null.
	public boolean empty(); //���Ϊ�շ���true
	public int size();      //����ջ��Ԫ�ظ���
}
class ArrayIntegerStack implements IntegerStack{
	private int size;
	private Integer[] stack;
	
	public void CreatStack(int n ) {
		//ջ����Ϊn
		stack = new Integer[n];
	}
	public void arraysToString() {
		System.out.println(Arrays.toString(stack));
	}
		
	@Override
	public Integer push(Integer item) {
		int StackLength = stack.length;
		//�����ջitem�Ƿ�ΪNull��ջ�Ƿ�����
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
			//����ջ��Ԫ��
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