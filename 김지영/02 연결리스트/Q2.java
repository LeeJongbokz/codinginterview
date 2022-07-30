import java.util.HashSet;

/**
 * 2.2 뒤에서 k번째 원소 구하기
 */
public class Q2 {
    public Node findKth (Node node, int k) {
        //  1 2 3 4 5
        //p1          v
        //p2      v
        // p1은 마지막 노드까지 찾아감.
        Node p1 = node;
        Node p2 = node;

        for (int i = 0; i < k; i++) {
            if(p1 == null) {
                return null;
            }
            p1 = p1.next;
        }

        while (p1 != null){
            p1 = p1.next;
            p2 = p2.next;
        }

        return p2;
    }

    public static void main(String[] args) {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        Node node6 = new Node(6);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;

        Q2 q = new Q2();
        // k=2, answer=5
        Node node = q.findKth(node1, 2);
        System.out.println(node.data);
    }
}