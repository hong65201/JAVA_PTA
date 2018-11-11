package Base;

import java.util.Arrays;
import java.util.Scanner;

public class Demo2_4 {
	public static void main(String[] args) {
		int n;
		Scanner reader = new Scanner(System.in);
		while(reader.hasNextInt()){
			n = reader.nextInt();
			String s[][] = new String[n][];
			for(int i=1;i<=n;i++){
				for(int j=1;j<=i;j++){
					if(j == 1){
						s[i-1] = new String[i];
						if(i!=1)
							s[i-1][j-1] =i+"*1"+"="+i;
						else
							s[0][0] = i+"*1"+"="+i;
						System.out.printf(i+"*"+1+"="+(i));
					}
					else if(j == i){
						s[i-1][j-1] =i+"*"+j+"="+(i*j); 
						if(i*(j-1) <10)
							System.out.print("  "+i+"*"+j+"="+(i*j));
						else
							System.out.print(" "+i+"*"+j+"="+(i*j));
					}
					else{
						s[i-1][j-1] =i+"*"+j+"="+(i*j);
						if(i*(j-1) <10)
							System.out.print("  "+i+"*"+j+"="+(i*j));
						else
							System.out.print(" "+i+"*"+j+"="+(i*j));
					}
				}
				System.out.println();
			}
			System.out.println(Arrays.deepToString(s));
		}
		
	}

}
