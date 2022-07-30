import java.util.HashSet;
import java.util.Scanner;

/**
 * 2.1 중복 없애기
 */
public class Q1 {
    public void removeDup (Node node) {
        HashSet<Integer> hs = new HashSet<>();
        Node prev = null;
        while(node!=null){
            if(!hs.contains(node.data)){
                hs.add(node.data);
                prev = node;
            } else {
                prev.next = node.next;
            }

            node = node.next;
        }
    }

    public static void main(String[] args) {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(2);
        Node node4 = new Node(3);
        Node node5 = new Node(3);
        Node node6 = new Node(3);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;

        Q1 q1 = new Q1();
        q1.removeDup(node1);

        while (node1 != null){
            System.out.print(node1.data + " ");
            node1 = node1.next;
        }
    }
}