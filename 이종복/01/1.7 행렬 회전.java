import java.util.*;

public class Main {
    
    
    
    public void matrixRotate(){
        
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        
        int[][] arr1 = new int[N][N];
        int[][] arr2 = new int[N][N];
        
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                int num = sc.nextInt();
                arr1[i][j] = num;
            }
        }
        
        
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                arr2[j][(N-1)-i] = arr1[i][j];
            }
        }
        
        
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                System.out.print(arr2[i][j]+ " ");
            }
            System.out.println();
        }
        
    }
    
    
    public void matrixRotateWithoutAdditionalMatrix(){
        
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        
        int[][] arr = new int[N][N];
        ArrayList<Integer> tmp = new ArrayList<>();
        int position = 0; 
        
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                int num = sc.nextInt();
                arr[i][j] = num;
            }
        }
        
        
        for(int j=0; j<N; j++){
            for(int i=N-1; i>=0; i--){
                tmp.add(arr[i][j]);
            }
        }
        
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                arr[i][j] = tmp.get(position++); 
            }
        }
        
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        
  
    }
    
    
    public static void main(String args[]) {
      
      
      Main T = new Main();
      T.matrixRotate(); 
      T.matrixRotateWithoutAdditionalMatrix(); 
      
      
      
    }
}
