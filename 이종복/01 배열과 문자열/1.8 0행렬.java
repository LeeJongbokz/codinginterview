import java.util.*;
public class Main {	
	public void solution(int[][] arr){
	    
	     ArrayList<Integer> zeroRows = new ArrayList<>();
	     ArrayList<Integer> zeroCols = new ArrayList<>();
	
	     for(int i=0; i<arr.length; i++){
	         for(int j=0; j<arr[i].length; j++){
	            if(arr[i][j] == 0){
	                zeroRows.add(i);
	                zeroCols.add(j);
	            }
	         }
	     }
	     
	     for(int i=0; i<zeroRows.size(); i++){
	         int rowNum = zeroRows.get(i);
	 
	         for(int j=0; j<arr[i].length; j++){
	             arr[rowNum][j] = 0;
	         }
	     }
	     
	     for(int i=0; i<zeroCols.size(); i++){
	         int colNum = zeroCols.get(i);
	 
	         for(int j=0; j<arr.length; j++){
	             arr[j][colNum] = 0;
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
