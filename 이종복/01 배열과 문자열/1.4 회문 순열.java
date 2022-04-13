import java.util.*;
public class Main {	
	public boolean solution(String s){
	
	   int[] arr = new int[30];
	   int oddCnt = 0; 
	   
	   s = s.toLowerCase();
	   
	   for(int i=0; i<s.length(); i++){
	       int pos = s.charAt(i)-97;
	       if(0<=pos && pos<=25){
	          arr[pos] += 1;
	       }
	   }
	   
	   for(int i=0; i<=25; i++){
	       if(arr[i] % 2 == 1){
	           oddCnt += 1;
	       }
	   }
	   
	   if(oddCnt <= 1){
	       return true;
	   }else{
	       return false;
	   }
	   
	}

	public static void main(String[] args){
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		String str=kb.nextLine();
		System.out.println(T.solution(str));
	}
}
