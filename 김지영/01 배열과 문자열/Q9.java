package array_and_string;

/**
 * 1.9 문자열 회전
 * // 0이 있는 곳의 행, 열을 0으로 바꾸기
 *
 */
public class Q9 {

    public boolean solution(String str1, String str2) {
        if(str1.length() != str2.length()){
            return false;
        }

        StringBuilder str3 = new StringBuilder();
        str3.append(str1); // waterbottle
        str3.append(str1); // wa[terbottlewa]terbottle

        return (str3.indexOf(str2) != -1);
    }

    public static void main(String[] args) {
        Q9 T = new Q9();
        System.out.println(T.solution("waterbottle", "terbottlewa"));
    }

}