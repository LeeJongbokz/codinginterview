/**
 * 2.4 분할
 *
 */
public class Q3 {
    public Node deleteNode (Node node, int data) {
        Node curNode = node;

        if(curNode.data==data){
            node = curNode.next;
            return node;
        }

        Node prevNode= node;
        while(prevNode.next!=null){
            prevNode = curNode;
            curNode = curNode.next;

            if(curNode.data == data){
                prevNode.next = curNode.next;
                return node;
            }

            if(curNode.next == null && curNode.data==data){
                prevNode.next = null;
                return node;
            }
        }

        return node;
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

        Q3 q = new Q3();
        Node node = q.deleteNode(node1, 6);
        while (node != null){
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
}