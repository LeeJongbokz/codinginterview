import java.util.*;
public class Main {	
	public boolean solution(String str1, String str2){
	    
	    char[] str1ToChar = str1.toCharArray();
	    Arrays.sort(str1ToChar);
	    String sortedStr1 = new String(str1ToChar);
	    
	    char[] str2ToChar = str2.toCharArray();
	    Arrays.sort(str2ToChar);
	    String sortedStr2 = new String(str2ToChar);
	    
	    if(sortedStr1.equals(sortedStr2)){
	        return true;
	    }else{
	        return false;
	    }
	}

	public static void main(String[] args){
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		String str1 = kb.next();
		String str2 = kb.next();
		
		System.out.println(T.solution(str1, str2));
	}
}
