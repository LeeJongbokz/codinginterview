public class Main {
    
    
    
    public void compact(String str){
        
        StringBuilder sb = new StringBuilder();
        int cnt = 1; 
        
        for(int i=1; i<str.length(); i++){
            if(str.charAt(i-1) == str.charAt(i)){
                cnt++;
            }else{
                sb.append(Character.toString(str.charAt(i-1)));
                sb.append(Integer.toString(cnt));
                cnt = 1; 
            }
        }
        
        sb.append(Character.toString(str.charAt(str.length()-1)));
        sb.append(Integer.toString(cnt));
        
        
        String answer = sb.toString();
        
        if(answer.length() > str.length()){
            System.out.println(str);
        }else{
            System.out.println(answer);
        }
        
        
    }
    
    
    public static void main(String args[]) {
      
      
      Main T = new Main();
      String str = "abcdefnnnaaa";
      
      T.compact(str);
      
    }
}
