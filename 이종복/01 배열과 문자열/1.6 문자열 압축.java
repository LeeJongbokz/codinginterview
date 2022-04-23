import java.util.*;
public class Main {	
	public String solution(String str){
	
	    int cnt = 1;
	    String answer = Character.toString(str.charAt(0));
	    
	    for(int i=1; i<str.length(); i++){
	        if(str.charAt(i-1) == str.charAt(i)){
	            cnt += 1;
	        }else{
	            answer += Integer.toString(cnt);
	            answer += str.charAt(i);
	            cnt = 1;
	        }
	    }
	    
	    if(cnt != 1){
	        answer += Integer.toString(cnt);
	    }
	    
	    if(answer.length() > str.length()){
	        return str;
	    }else{
	        return answer; 
	    }
	   
	}

	public static void main(String[] args){
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		String str1=kb.next();
		System.out.println(T.solution(str1));
	}
}
