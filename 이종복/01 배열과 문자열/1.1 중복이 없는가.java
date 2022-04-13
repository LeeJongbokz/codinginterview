import java.util.*;
public class Main {	
	public boolean solution(String s){
	
	   char[] stringToChar = s.toCharArray();
	   Arrays.sort(stringToChar);
	   String sortedStr = new String(stringToChar);
	   
	   for(int i=0; i<sortedStr.length()-1; i++){
	       if(sortedStr.charAt(i) == sortedStr.charAt(i+1)){
	           return true;
	       }
	   }
	     
	   return false;
	}

	public static void main(String[] args){
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		String str=kb.next();
		System.out.println(T.solution(str));
	}
}
