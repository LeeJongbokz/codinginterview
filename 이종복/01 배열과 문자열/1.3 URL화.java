import java.util.*;
public class Main {	
	public String solution(String s){
	
	   s = s.replace(" ", "%20");
	   
	   return s;
	}

	public static void main(String[] args){
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		String str=kb.nextLine();
		System.out.println(T.solution(str));
	}
}
