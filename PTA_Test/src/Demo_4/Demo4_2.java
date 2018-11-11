package Demo_4;

import java.util.Arrays;
import java.util.Scanner;

public class Demo4_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//输入整型值n，然后建立n个不同的形状
		String nStr = sc.nextLine();
		int n = Integer.parseInt(nStr);
		Shape[] shape = new Shape[n];
		//循环判断输入
		for(int i = 0;i < n;i++) {
			String Option = sc.nextLine();
			//如果输入rect，则再输入长和宽。
			if(Option.equals("rect")) {
				String str1 = sc.nextLine();
				String[] WidthAndLength = str1.split("\\s");
				Rectangle r = new Rectangle(Integer.parseInt(WidthAndLength[0]), Integer.parseInt(WidthAndLength[1]));
				shape[i] = r;
			
				//如果输入cir，则再输入半径。;
			}else if(Option.equals("cir")){
				String str2 = sc.nextLine();
				String[] Cirle = str2.split("\\s");
				Circle c = new Circle(Integer.parseInt(Cirle[0]));
				shape[i] = c;
			}else {
				System.out.println("输入格式错误！");
			}
		}
		//输出所有的形状的周长之和，面积之和

		System.out.println(sumAllPerimeter(shape));
		System.out.println(sumAllArea(shape));
		
		
		//按照样例输出
		System.out.println(Arrays.toString(shape));
		
		//输出每个形状的类型与父类型.
		for(int i = 0;i < n;i++) {
			System.out.println(shape[i].getClass()+","+shape[i].getClass().getSuperclass());
		}
	}
	
	//获取Shape对象数组中所有的周长和面积
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
//抽象父类Shape
abstract class Shape{
	final double PI = 3.14;
	public abstract double getPerimeter();
	public abstract double getArea();
	//不建议在抽象父类里添加以下方法
/*	public abstract double sumAllPerimeter(Shape[] s);
	public abstract double sumAllArea(Shape[] s);
	*/
	
}
//长方形类
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
//圆形类
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