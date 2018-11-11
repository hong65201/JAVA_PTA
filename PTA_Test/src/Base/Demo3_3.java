package Base;

import java.util.Arrays;
import java.util.Scanner;

public class Demo3_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//
		Rectangle[] rect = new Rectangle[2];
		int PerimeterSum = 0;
		int AreaSum = 0;
		
		//处理长方形类
		for(int i =0;i<2;i++) {
			String s = sc.nextLine();
			String[] arr = s.split("\\s");//arr[0]=长 ar[1]=宽
			int width = Integer.parseInt(arr[0]);
			int length = Integer.parseInt(arr[1]);
			Rectangle r = new Rectangle(width,length); 
			rect[i] = r;
			//正方形周长总和
			PerimeterSum += r.getPerimeter();
			AreaSum += r.getArea();
		}
		
		
		Circle[] c = new Circle[2]; 
		//处理圆形类
		
		for(int i =0;i<2;i++) {
			String s = sc.nextLine();
			int radius = Integer.parseInt(s);
			Circle ci = new Circle(radius);
			c[i] = ci;
			PerimeterSum += ci.getPerimeter();
			AreaSum += ci.getArea();
			
		}
		//输出总周长
		System.out.println(PerimeterSum);
		System.out.println(AreaSum);
		
		
		System.out.println(Arrays.deepToString(rect));
		System.out.println(Arrays.deepToString(c));
		
		
		
						
	}
}

//长方形类
class Rectangle{
	private int width;
	private int length;
	public Rectangle(int width, int length) {
		super();
		this.width = width;
		this.length = length;			
	}
	
	public int getPerimeter() {
		int perimeter = (width+length)*2;
		return perimeter;		
	}
	public int getArea() {
		int Area = width*length;
		return Area;
	}

	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", length=" + length + "]";
	}
	
	
	
}
//圆形类
class Circle{
	private int radius;

	public Circle(int radius) {
		super();
		this.radius = radius;
	}
	
	public int getPerimeter() {
		double d = 2*Math.PI*radius;
		return (int)d;
	}
	public int getArea() {
		double d = Math.PI*Math.pow(radius, 2);
		return (int)d;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}
	
	
}
