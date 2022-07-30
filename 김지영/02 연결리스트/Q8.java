/**
 * 2.8 루프 발견 1 > 2 > 3 > 4 > 3
 * <p>
 * 출력 : 3
 */
public class Q8 {

    public Node loopDetection(Node node) {
        // 루프가 있는지 확인
        Node fastPtr = node; // 2칸씩 이동
        Node slowPtr = node; // 1칸씩 이동

        while (fastPtr != null && fastPtr.next != null) {
            fastPtr = fastPtr.next.next;
            slowPtr = slowPtr.next;

            if (fastPtr == slowPtr) {
                break;
            }
        }

        if (fastPtr == null || fastPtr.next == null) {
            // 루프 아닌 노드 일 경우
            return null;
        }

        slowPtr = node;
        while (slowPtr != fastPtr) {
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next;
        }

        return slowPtr;
    }

    public static void main(String[] args) {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node3;

        Q8 q = new Q8();
        Node node = q.loopDetection(node1);
        System.out.println(node.data);
    }
}