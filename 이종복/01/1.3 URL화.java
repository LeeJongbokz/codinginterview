import java.util.*;

public class Main{
    
    
    public void url(String str, int len){
        
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<len; i++){
            if(str.charAt(i) == ' '){
                sb.append("%20");
            }else{
                sb.append(str.charAt(i));
            }
        }
        
        
        String result = sb.toString();
        
        System.out.println(result);
        
    }
   
    public static void main(String[] args){
        
        Main T = new Main();
        String str = "Mr John Smith";
        int num = 13; 
        
        T.url(str, num);     
    }    
    
    
    
    
}
