package Demo_5;

import java.util.Scanner;

public class Demo5_4 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		//输入n，创建大小为n的double型数组
		int n = Integer.parseInt(sc.nextLine());
		double[] nums = new double[n];
		//依次输入n个double型数值放入数组
		String Option = sc.nextLine();
		String[] strArr = Option.split("\\s");
		for(int i = 0;i < n;i++) {			
			nums[i] = Double.parseDouble(strArr[i]);
		}
		//调用findMinMax方法得到结果，并输出
		ArrayUtils au = new ArrayUtils();
		System.out.println(au.findMinMax(nums));
		//最后使用System.out.println(ArrayUtils.PairResult.class)打印标识信息
		System.out.println(ArrayUtils.PairResult.class);
	}
}
class ArrayUtils{
	static PairResult findMinMax(double[] values) {
		double max = values[0];
		double min = values[0];
		//获取最大值,最小值
		for(int i = 1;i < values.length;i++) {
			if(max < values[i]) {
				max = values[i];
			}
			if(min > values[i]) {
				min = values[i];
			}
		}
		PairResult pr = new PairResult();
		pr.setMax(max);
		pr.setMin(min);
		return pr;
		
	}
	static class PairResult{
		private double min;
		private double max;
		@Override
		public String toString() {
			return "PairResult [min=" + min + ", max=" + max + "]";
		}
		public double getMin() {
			return min;
		}
		public void setMin(double min) {
			this.min = min;
		}
		public double getMax() {
			return max;
		}
		public void setMax(double max) {
			this.max = max;
		}
		
	}
}
