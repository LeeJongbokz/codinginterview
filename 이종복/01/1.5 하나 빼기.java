public class Main {
    
    
    
    public void compare(String s1, String s2){
        
        int len1 = s1.length();
        int len2 = s2.length();
        
        if(len1 == len2){
            
            int diff = 0; 
            
            for(int i=0; i<len1; i++){
                if(s1.charAt(i) == s2.charAt(i)){
                    continue;
                }else{
                    diff++;
                }
            }
            
            if(diff <= 1){
                System.out.println("true");
            }else{
                System.out.println("false");
            }
            
        }else{
            
            String str1;
            String str2;
            
            if(len1 > len2){
                str1 = s2;
                str2 = s1;
            }else{
                str1 = s1;
                str2 = s2;
            }
            
            
            
            int diff = 0; 
            int pos = 0; 
            String c = "";
                
            for(int i=0; i<len1; i++){
                    
                if(str1.charAt(i) == str2.charAt(i)){
                        continue;
                }else{
                        c = Character.toString(str2.charAt(i));
                        pos = i; 
                        diff++;    
                        break;
                }
                    
            }
            
            
            if(diff == 1 && c != ""){
                String newString = str1.substring(0, pos) + c + str1.substring(pos);
                
                   
                if(str2.equals(newString)){
                     System.out.println("true"); 
                }else{
                     System.out.println("false");  
                }
            }else{
                System.out.println("true");
            }
                
            
        }
        
        
        
    }
    
    
    public static void main(String args[]) {
      
      
      Main T = new Main();
      String s1 = "pale";
      String s2 = "ales";
      
      T.compare(s1, s2);
      
      
      
      
    }
}
