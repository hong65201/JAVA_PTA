package Function;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class F4_3 {
	/*covnertStringToList函数代码*/
    public static List<String> convertStringToList(String line){
   	 ArrayList<String> list = new ArrayList<>();
   	 String[] strArr = line.split("\\s+");
   	 for (String string : strArr) {
   		 list.add(string);
		}
   	 return list;
    }
    /*remove函数代码*/
    public static void remove(List<String> list, String str) {
      	 list = new ArrayList<>(list);
      	 for (String string : list) {
			if(string.equals(str)) {
				list.remove(str);
			}
		}
       }
		
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()){
            List<String> list = convertStringToList(sc.nextLine());
            System.out.println(list);
            String word = sc.nextLine();
            remove(list,word);
            System.out.println(list);
        }
        sc.close();
    }
    
}
