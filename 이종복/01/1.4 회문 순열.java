import java.util.*;

public class Main{
    
    
    
    public void isPalindrome(String str){
        
        int[] arr = new int[30];
        int oddCnt = 0; 
        
        str = str.toLowerCase();
        int len = str.length();
    
        for(int i=0; i<len; i++){
            char c = str.charAt(i);
            int num = (int)c-97;
            
            
            if(0<=num && num <=25){
                arr[num] += 1;
            }
        }
        
        
        for(int i=0; i<26; i++){
            if(arr[i] % 2 == 1){
                oddCnt += 1;
            }
        }
        
        
        if(oddCnt >= 2){
            System.out.println("False");
        }else{
            System.out.println("True");
        }
           
    }
    
   
    public static void main(String[] args){
        
        Main T = new Main();
        String str = "Tadt coa";
        
        T.isPalindrome(str);
        
        
    }    
    
    
    
    
}
