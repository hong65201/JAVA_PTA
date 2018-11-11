package Demo_4;

import java.util.Arrays;
import java.util.Scanner;

public class Demo4_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//��������ֵn��Ȼ����n����ͬ����״
		String nStr = sc.nextLine();
		int n = Integer.parseInt(nStr);
		Shape[] shape = new Shape[n];
		//ѭ���ж�����
		for(int i = 0;i < n;i++) {
			String Option = sc.nextLine();
			//�������rect���������볤�Ϳ�
			if(Option.equals("rect")) {
				String str1 = sc.nextLine();
				String[] WidthAndLength = str1.split("\\s");
				Rectangle r = new Rectangle(Integer.parseInt(WidthAndLength[0]), Integer.parseInt(WidthAndLength[1]));
				shape[i] = r;
			
				//�������cir����������뾶��;
			}else if(Option.equals("cir")){
				String str2 = sc.nextLine();
				String[] Cirle = str2.split("\\s");
				Circle c = new Circle(Integer.parseInt(Cirle[0]));
				shape[i] = c;
			}else {
				System.out.println("�����ʽ����");
			}
		}
		//������е���״���ܳ�֮�ͣ����֮��

		System.out.println(sumAllPerimeter(shape));
		System.out.println(sumAllArea(shape));
		
		
		//�����������
		System.out.println(Arrays.toString(shape));
		
		//���ÿ����״�������븸����.
		for(int i = 0;i < n;i++) {
			System.out.println(shape[i].getClass()+","+shape[i].getClass().getSuperclass());
		}
	}
	
	//��ȡShape�������������е��ܳ������
	public static double sumAllArea(Shape[] s){
		double AllSumA = 0;
		for (Shape shape : s) {
			AllSumA += shape.getArea();
		}
		return AllSumA;		
	}
	
	
	
	public static double sumAllPerimeter(Shape[] s){
		double AllSumP = 0;
		for (Shape shape : s) {
			AllSumP += shape.getPerimeter();
		}
		return AllSumP;		
	}
}
//������Shape
abstract class Shape{
	final double PI = 3.14;
	public abstract double getPerimeter();
	public abstract double getArea();
	//�������ڳ�������������·���
/*	public abstract double sumAllPerimeter(Shape[] s);
	public abstract double sumAllArea(Shape[] s);
	*/
	
}
//��������
class Rectangle extends Shape {
	private int width;
	private int length;
	
	

	public Rectangle(int width, int length) {
		super();
		this.width = width;
		this.length = length;
	}
	

	


	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", length=" + length + "]";
	}





	@Override
	public double getPerimeter() {
		int perimeter = (width+length)*2;
		return perimeter;
	}

	@Override
	public double getArea() {
		int Area = width*length;
		return Area;
	}


	

	
	
}
//Բ����
class Circle extends Shape{
	private int radius;

	public Circle(int radius) {
		super();
		this.radius = radius;
	}

	

	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}



	@Override
	public double getPerimeter() {
		double d = 2*PI*radius;
		return d;
	}

	@Override
	public double getArea() {
		double d = PI*Math.pow(radius, 2);
		return d;
	}

	
	
	
}