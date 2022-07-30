/**
 * 2.5 리스트의 합
 * 입력 : 7 1 6 + 5 9 2 1
 * 617+1295=1912
 * 출력 : 2 1 9 1
 */
public class Q5 {
    public Node listSum (Node node1, Node node2) {
        int result = 0;
        int carry = 0;
        Node resultNode = null;
        Node resultNodePtr = null;
        while(node1 != null || node2 != null || carry != 0){
            if(node1 != null){
                result += node1.data;
                node1 = node1.next;
            }

            if(node2 != null){
                result += node2.data;
                node2 = node2.next;
            }

            // 12
            result += carry;
            // 1 다음 합에 반영
            carry = result /10;
            // 2 저장
            Node newNode = new Node(result % 10);// resultNode = 2

            if(resultNode == null){
                resultNode = newNode;
                resultNodePtr = resultNode;
            } else {
                resultNodePtr.next = newNode;
                resultNodePtr = newNode;
            }
            result = 0;
        }
        return resultNode;
    }

    public static void main(String[] args) {
        Node node1_1 = new Node(7);
        Node node1_2 = new Node(1);
        Node node1_3 = new Node(6);

        node1_1.next = node1_2;
        node1_2.next = node1_3;

        Node node2_1 = new Node(5);
        Node node2_2 = new Node(9);
        Node node2_3 = new Node(2);
        Node node2_4 = new Node(1);

        node2_1.next = node2_2;
        node2_2.next = node2_3;
        node2_3.next = node2_4;

        Q5 q = new Q5();
        Node node = q.listSum(node1_1, node2_1);
        while (node != null){
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
}