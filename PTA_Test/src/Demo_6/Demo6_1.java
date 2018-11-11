package Demo_6;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Demo6_1 {
	public static void main(String[] args) {
		//����ArrayIntegerStack����
		ArrayListIntegerStack als = new ArrayListIntegerStack();
		//����m��ֵ������ջ��ÿ����ջ����ӡ��ջ���ؽ����
		Scanner sc = new Scanner(System.in);
		int m = Integer.parseInt(sc.nextLine());
		String nums =  sc.nextLine();
		String[] pushNums = nums.split("\\s");
		
		for(int i = 0;i < m;i++) {
			als.push(Integer.parseInt(pushNums[i]));
		}
		//����� ջ��Ԫ�أ�����Ƿ�Ϊ�գ�Ȼ�����size.
		System.out.println(als.peek()+","+als.empty()+","+als.size());
		//���ջ������Ԫ�أ�������toString()������
		System.out.println(als);
		//����x��Ȼ���ջx�Σ�ÿ�ξ���ӡ��ջ�Ķ���
		int n = Integer.parseInt(sc.nextLine());
		for(int i = 0;i < n;i++) {
			als.pop();
		}
		//����� ջ��Ԫ�أ�����Ƿ�Ϊ�գ�Ȼ�����size.
		System.out.println(als.peek()+","+als.empty()+","+als.size());
	    //���ջ������Ԫ�أ�������toString()������
		System.out.println(als);
	}
}
interface IntegerStack{
public Integer push(Integer item); //��itemΪnull������ջֱ�ӷ���null������ֱ����ջ��Ȼ�󷵻�item��
public Integer pop();              //��ջ����ջΪ�գ��򷵻�null��
public Integer peek();             //���ջ��Ԫ�أ���ջ��Ϊ�գ��򷵻�null��ע�⣺��Ҫ��ջ
public boolean empty();           //���ջΪ�շ���true
public int size();                //����ջ��Ԫ������
}
class ArrayListIntegerStack implements IntegerStack{	
		//�½�ArrayList����LinkedList����Ϊջ���ڲ��洢
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
	//���ջ��Ԫ�أ���ջ��Ϊ�գ��򷵻�null��ע�⣺��Ҫ��ջ
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