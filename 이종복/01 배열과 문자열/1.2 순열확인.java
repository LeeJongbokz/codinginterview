import java.util.*;
public class Main {	
	public boolean solution(String s1, String s2){
	
	   char[] s1ToChar = s1.toCharArray();
	   Arrays.sort(s1ToChar);
	   String sortedS1 = new String(s1ToChar);
	   
	   char[] s2ToChar = s2.toCharArray();
	   Arrays.sort(s2ToChar);
	   String sortedS2 = new String(s2ToChar);
	   
	   if(sortedS1.equals(sortedS2)){
	       return true;
	   }else{
	       return false;
	   }
	   
	}

	public static void main(String[] args){
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		String str1=kb.next();
		String str2=kb.next();
		System.out.println(T.solution(str1, str2));
	}
}
