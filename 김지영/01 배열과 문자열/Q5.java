package array_and_string;

import java.util.Scanner;

/**
 * 1.5 하나 빼기
 * pale, ple -> true
 * pales, ple -> true
 * pale, bale -> true
 * pale, bae -> false
 *
 */
public class Q5 {

    public boolean solution(String str1, String str2){
        if(str1.length() == str2.length()){
            // 글자 한개가 변경된 경우
            return replace(str1, str2);
        } else if(Math.abs(str1.length() - str2.length()) ==1 ){
            if (str1.length() < str2.length()){
                return insert(str1, str2);
            } else {
                return insert(str2, str1);
            }
        } else {
            return false;
        }
    }

    public boolean replace(String str1, String str2){
        boolean replaced = false;
        for (int i = 0; i < str1.length(); i++) {
            if(str1.charAt(i) != str2.charAt(i)){
                if(replaced){
                    return false;
                }
                replaced = true;
            }
        }
        return true;
    }

    public boolean insert(String minStr, String maxStr){
        int minPtr = 0, maxPtr = 0;

        while(minPtr < minStr.length() && maxPtr < maxStr.length()){
            if(minStr.charAt(minPtr) != maxStr.charAt(maxPtr)){
                if(minPtr != maxPtr){
                    return false;
                }
                maxPtr++;
            } else {
                minPtr++;
                maxPtr++;
            }
        }

        return true;
    }


    public static void main(String[] args) {
        Q5 T = new Q5();
        Scanner sc = new Scanner(System.in);
//        String str1 = sc.next();
//        String str2 = sc.next();
        String str1 = "pale";
        String str2 = "ple";
        System.out.println(T.solution("pale", "bae"));
    }

}