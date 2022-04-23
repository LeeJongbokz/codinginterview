import java.util.*;
public class Main {	
	public void solution(int[][] arr){
	    
	    int N = arr.length;
	    int[][] arr2 = new int[N][N];
	    
	    for(int i=0; i<arr.length; i++){
	        for(int j=0; j<arr[i].length; j++){
	            arr2[i][j] = arr[j][(N-1)-i];
	        }
	    }
	     
	    for(int i=0; i<arr.length; i++){
	        for(int j=0; j<arr[i].length; j++){
	            arr[i][j] = arr2[i][j];
	        }
	    }  
	    
	    for(int i=0; i<arr.length; i++){
	        for(int j=0; j<arr[i].length; j++){
	            System.out.print(arr[i][j]+ " ");
	        }
	        System.out.println();
	    }      
	            
	}

	public static void main(String[] args){
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int m = kb.nextInt();
		int n = kb.nextInt();
		
		int[][] aMat = new int[m][n];
		
		for(int i=0; i<m; i++){
		    for(int j=0; j<n; j++){
		        aMat[i][j] = kb.nextInt();
		    }
		}
		
		T.solution(aMat);
	}
}
