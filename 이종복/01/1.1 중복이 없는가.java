import java.util.*;

public class Main{
    
    
    public void duplicateString(String str){
        
        HashSet<Character> set = new HashSet<>();
        
        int len = str.length();
        
        for(int i=0; i<len; i++){
            char c = str.charAt(i);
            
            if(set.contains(c)){
                continue;
            }else{
                set.add(c);
            }
            
        }
        
        
        if(set.size() == len){
            System.out.println("중복 없음");
        }else{
            System.out.println("중복 있음");
        }
    }
    
    
    public void duplicateString2(String str){
        
        char[] charArray = str.toCharArray();
        Arrays.sort(charArray);
        String sortedString = new String(charArray);
        
        int len = sortedString.length();
        
        for(int i=1; i<len; i++){
            if(sortedString.charAt(i-1) == sortedString.charAt(i)){
                System.out.println("중복 있음");
                return; 
            }
        }
        
        System.out.println("중복 없음");
        
        
    }
    
    
    
    
    
    public static void main(String[] args){
        
        Main T = new Main();
        String str = "helos";
        
        
        T.duplicateString2(str);
        
        
    }    
    
    
    
    
}
