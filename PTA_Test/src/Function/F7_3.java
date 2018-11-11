package Function;

import java.util.EmptyStackException;

public class F7_3 {
	public static void main(String[] args) {
		
	}
}
interface IntegerStack{
	public Integer push(Integer item); //如果item为null，则不入栈直接返回null。如果栈满，抛出FullStackException（系统已有的异常类）。
	public Integer pop();              //出栈。如果栈空，抛出EmptyStackException，否则返回
	public Integer peek();            //获得栈顶元素。如果栈空，抛出EmptyStackException。
}
class ArrayIntegerStack implements IntegerStack{
    private int capacity;//内部数组大小
    private int top=0;//指向栈顶
    private Integer[] arrStack;
    /*其他代码*/
    /*你的答案，即3个方法的代码*/
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