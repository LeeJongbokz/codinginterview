import java.util.*;

public class Main {
    
    public static void main(String[] args){
    
        Scanner sc = new Scanner(System.in);
    
        int M = sc.nextInt();
        int N = sc.nextInt();
    
        int[][] matrix = new int[M][N];
        ArrayList<Integer> zeroRows = new ArrayList<>();
        ArrayList<Integer> zeroCols = new ArrayList<>();
        
        for(int i=0; i<M; i++){
            for(int j=0; j<N; j++){
                int num = sc.nextInt();
                matrix[i][j] = num;
            }
        }
        
        for(int i=0; i<M; i++){
            for(int j=0; j<N; j++){
                if(matrix[i][j] == 0){
                    zeroRows.add(i);
                    zeroCols.add(j);
                }
            }
        }
        
        
        for(int i=0; i<zeroRows.size(); i++){
            int rowNum = zeroRows.get(i);
            
            for(int j=0; j<N; j++){
                matrix[rowNum][j] = 0;
            }
        }
        
        
        for(int i=0; i<zeroCols.size(); i++){
            int colNum = zeroCols.get(i);
            
            for(int j=0; j<M; j++){
                matrix[j][colNum] = 0;
            }
        }
        
        
        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }
        
        
        
    }
}
