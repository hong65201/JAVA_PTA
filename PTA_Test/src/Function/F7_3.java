package Function;

import java.util.EmptyStackException;

public class F7_3 {
	public static void main(String[] args) {
		
	}
}
interface IntegerStack{
	public Integer push(Integer item); //���itemΪnull������ջֱ�ӷ���null�����ջ�����׳�FullStackException��ϵͳ���е��쳣�ࣩ��
	public Integer pop();              //��ջ�����ջ�գ��׳�EmptyStackException�����򷵻�
	public Integer peek();            //���ջ��Ԫ�ء����ջ�գ��׳�EmptyStackException��
}
class ArrayIntegerStack implements IntegerStack{
    private int capacity;//�ڲ������С
    private int top=0;//ָ��ջ��
    private Integer[] arrStack;
    /*��������*/
    /*��Ĵ𰸣���3�������Ĵ���*/
	@Override
	public Integer push(Integer item)  {
		if(item == null) {
			return null;
		}
		if(capacity == (arrStack.length-1) ) {
			try {
				throw new Exception();
			} catch (Exception e) {
				
				e.printStackTrace();
			}
		}
		
		arrStack[top++] = item;
		return item;
	}
	@Override
	public Integer pop() {
		if(capacity == 0) {
			throw new EmptyStackException();
		}else {
			
			Integer data = peek();
			top--;
			return data;
		}
	}
	@Override
	public Integer peek() {
		if(capacity == 0) {
			throw new EmptyStackException(); 
		}else {
			 return arrStack[top - 1];
		}
		
		
	}
	
}