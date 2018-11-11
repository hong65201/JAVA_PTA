package Demo_6;

import java.util.ArrayList;
import java.util.Scanner;

//10.7 Car����ÿ����һ��pushһ�κʹ�ӡ���Car������Ϊһ��������m������

public class Demo6_5 {
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m,n;
	
		while(true) {
			String option = sc.nextLine();
			if(!option.equals("quit")) {
				// m = ��ջ����  n = ��ջ����
				m = Integer.parseInt(sc.nextLine());
				n = Integer.parseInt(sc.nextLine());
				
			}else {
				break;				
			}
			if(option.equals("Integer")) {
				System.out.println("Integer Test");
				//����stack<Integer>
				ArrayListGeneralStack<Integer> stack = new ArrayListGeneralStack<Integer>();
				String str = sc.nextLine();
				String[] pushNums = str.split("\\s");
				//��ջm��
				for(int i = 0;i<  m;i++) {
					Integer pushnum = Integer.parseInt(pushNums[i]);
					stack.push(pushnum);
					System.out.println("push:"+pushnum);
				}
			
				//��ջn��
				for(int j = 0;j < n;j++) {
					Integer popnum = stack.pop();
					System.out.println("pop:"+popnum);
				}
				//��ӡջ��toString����
				System.out.println(stack.toString());
				//ջ��ʣ��Ԫ�س�ջ���ۼ����
				int sum = 0;
				for(int i = stack.size() - 1;i>=0;i--) {
					sum += (Integer)stack.pop();
				}
				System.out.println("sum="+sum);
				//��ӡ��ʶ��Ϣ
				System.out.println(stack.getClass().getInterfaces()[0]);
			}
			if(option.equals("Double")) {
				System.out.println("Double Test");
				//����stack<Double>
				ArrayListGeneralStack<Double> stack = new ArrayListGeneralStack<Double>();
				
				String str = sc.nextLine();
				String[] pushNums = str.split("\\s");
				//��ջm��
				for(int i = 0;i<  m;i++) {
					Double pushnum = Double.parseDouble(pushNums[i]);
					stack.push(pushnum);
					System.out.println("push:"+pushnum);
				}
			
				//��ջn��
				for(int j = 0;j < n;j++) {
					Double popnum = stack.pop();
					System.out.println("pop:"+popnum);
				}
				//��ӡջ��toString����
				System.out.println(stack.toString());
				//ջ��ʣ��Ԫ�س�ջ���ۼ����
				double sum = 0;
				for(int i = stack.size() - 1;i>=0;i--) {
					sum += (Double)stack.pop();
				}
				System.out.println("sum="+sum);
				//��ӡ��ʶ��Ϣ
				System.out.println(stack.getClass().getInterfaces()[0]);
			}
			//����Car���
		if(option.equals("Car")) {
			//����stack<Car>
			ArrayListGeneralStack<Car> stack = new ArrayListGeneralStack<Car>();
			System.out.println("Car Test");
			/*String s1 = "";
			//�����ַ�����һ�������m�κ�ͳһpush
			
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
				//��m���������id��name
				int id = Integer.parseInt(strArrCar[i*2]);
				Car c = new Car();
				c.setId(id);
				c.setName(strArrCar[1+i*2]);
				stack.push(c);
				System.out.println("push:"+c.toString());
			}*/
			//��stack������ʣ��Ԫ�س�ջ
			for(int j = 0;j < n;j++) {
					if(!stack.empty()) {
						
						Car c = stack.pop();
						System.out.println("pop:"+c.toString());
					}else {
						System.out.println("pop:null");
					}
				
			}
			System.out.println(stack.toString());
			//��ջ��Ԫ�س�ջ��������name���������
			for(int i = stack.size() - 1;i>=0;i--) {
				Car c = stack.pop();
				System.out.println(c.getName());
			}
			//��ӡ��ʶ
			System.out.println(stack.getClass().getInterfaces()[0]);
		}
		}
	}
}
interface GeneralStack<T>{
	public void push(T item);            //��itemΪnull������ջֱ�ӷ���null��
	public T pop();                 //��ջ����ΪջΪ�գ��򷵻�null��
	public T peek();                //���ջ��Ԫ�أ���Ϊ�գ��򷵻�null.
	public boolean empty();//��Ϊ�շ���true
	public int size();     //����ջ��Ԫ������

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
			//��������Ԫ��Ϊջ��
			obj = list.get(list.size() - 1);
			//ȡ����ɾ��
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
//Car����
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
