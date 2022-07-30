/**
 * 2.4 분할
 * 원소 x는 '오른쪽 그룹' 어딘가에만 존재하면 된다.
 * 입력 : 3 5 8 5 10 2 1, x = 5
 * 출력 : 1 2 3 5 8 5 10
 */
public class Q4 {
    public Node partition (Node node, int x) {
        Node head = node;
        Node tail = node;

        // x보다 크면 tail에 추가
        while (node != null){
            Node next = node.next;
            if(node.data>=x){
                tail.next = node;
                tail = node;
            } else {
                node.next = head;
                head = node;
            }
            node = next;
        }

        tail.next = null;
        return head;
    }

    public static void main(String[] args) {
        Node node1 = new Node(3);
        Node node2 = new Node(5);
        Node node3 = new Node(8);
        Node node4 = new Node(5);
        Node node5 = new Node(10);
        Node node6 = new Node(2);
        Node node7 = new Node(1);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node7;

        Q4 q = new Q4();
        Node node = q.partition(node1, 5);
        while (node != null){
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
}