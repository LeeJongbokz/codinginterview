import java.util.*;
public class Main {	
	public boolean solution(String s1, String s2){
	
	    int len1 = s1.length();
	    int len2 = s2.length();
	    
	    if(len1 == len2){
	        
	        int diffCnt = 0; 
	        
	        for(int i=0; i<s1.length(); i++){
	            if(s1.charAt(i) != s2.charAt(i)){
	                diffCnt += 1;
	            }
	        }
	       
	        if(diffCnt >= 2){
	            return false;
	        }else{
	            return true;
	        }
	        
	    }else{
	        
	        int diffPos = 0; 
	        int minLen = Math.min(len1, len2);
	        
	            
	        for(int i=0; i<minLen; i++){
	           if(s1.charAt(i) != s2.charAt(i)){
	                    diffPos = i;
	                    break;
	                }
	        }
	        
	        if(minLen == len1){
	            s2 = s2.substring(0, diffPos) + s2.substring(diffPos+1);
	        }else if(minLen == len2){
	            s1 = s1.substring(0, diffPos) + s1.substring(diffPos+1);
	        }
	        
	        if(s1.equals(s2)){
	                return true;
	        }else{
	                return false;
	        }
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
