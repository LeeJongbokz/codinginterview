import java.util.Stack;

/**
 * 2.4 회문
 * 1 2 3 0 3 2 1 > true
 */
public class Q6 {
    //   1 2 3 0 3 2 1
    // f             V  : 2칸씩 이동, f가 null이면 스택에 있는 거 하나 씩 꺼내기
    // s       V        : 1칸씩 이동,
    public Boolean isPalindrome (Node node) {
        if(node == null){
            return false;
        }

        Node slowPtr = node;
        Node fastPtr = node;
        Stack<Integer> stack = new Stack<>();
        while (fastPtr != null && fastPtr.next != null){
            stack.push(slowPtr.data);
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
        }

        if(fastPtr!=null){
            // 홀수일경우
            slowPtr = slowPtr.next;
        }
//        else //짝수일경우 // 미들값이 없으니까

        while (slowPtr!=null){
            if(stack.pop() != slowPtr.data){
                return false;
            }
            slowPtr = slowPtr.next;
        }
        return true;
    }

    public static void main(String[] args) {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(0);
        Node node5 = new Node(3);
        Node node6 = new Node(2);
        Node node7 = new Node(1);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node7;

        Q6 q = new Q6();
        System.out.println(q.isPalindrome(node1));
    }
}