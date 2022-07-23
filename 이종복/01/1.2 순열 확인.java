import java.util.*;

public class Main{
    
    
    public void isPermutation(String str1, String str2){
        
        int len1 = str1.length();
        int len2 = str2.length();
        
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        String sortedString1 = new String(charArray1);
        String sortedString2 = new String(charArray2);
        
        if(len1 == len2){
            
            for(int i=0; i<len1; i++){
                if(sortedString1.charAt(i) == sortedString2.charAt(i)){
                    continue;
                }else{
                    System.out.println("False");
                    return; 
                }
            }
            
            System.out.println("True"); 
            
            
        }else{
            System.out.println("False");
        }
         
    }
    
    
    public static void main(String[] args){
        
        Main T = new Main();
        String str1 = "helos";
        String str2 = "helso";
            
        T.isPermutation(str1, str2);
    }    
    
    
    
    
}
