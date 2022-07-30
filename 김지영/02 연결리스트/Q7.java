import java.util.Stack;

/**
 * 2.7 교집합
 1 -> 2 -> 3 -> 4 -> 7
 5 -> 6 -> 7 -> 8 -> 9 -> 10
 1 2 3 4
        7 8 9 10
     5 6

 ptr1 1 2 3 4 7 8  9 10 6 7
 ptr2 5 6 7 8 9 10 2 3  4 7

 출력 7
 */
public class Q7 {
    public Node intersection (Node node1, Node node2) {
        Node ptr1 = node1;
        Node ptr2 = node2;
        String ptr11 = "";
        String ptr22 = "";
        while (ptr1 != ptr2){
            if(ptr1 == null){
                ptr1 = node2;
            }

            if(ptr2 == null){
                ptr2 = node1;
            }

            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
        }

        return ptr1;
    }

    public static void main(String[] args) {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        Node node6 = new Node(6);
        Node node7 = new Node(7);
        Node node8 = new Node(8);
        Node node9 = new Node(9);
        Node node10 = new Node(10);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node7;

        node5.next = node6;
        node6.next = node7;
        node7.next = node8;
        node8.next = node9;
        node9.next = node10;


        Q7 q = new Q7();
        System.out.println(q.intersection(node1, node5).data);
    }
}