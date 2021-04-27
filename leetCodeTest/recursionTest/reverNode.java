package recursiontest;

/**
 * 〈一句话功能简述〉
 * 〈功能详细描述〉
 * @see
 * @since
 */
public class reverNode {
    public static void main(String[] args) {
        Node node = new Node(1);
        node.next = new Node(2);
        node.next.next = new Node(3);
        node.next.next.next = new Node(4);
        System.out.println(node.next.val);
        reverNode reverNode = new reverNode();
        Node newHead = reverNode.reverse(node);
        System.out.println(newHead.next.val);
    }
    public Node reverse(Node head){
        if (head == null || head.next == null){
            return head;
        }
        Node temp = head.next;
        Node newHead = reverse(head.next);
        temp.next = head;
        head.next = null;
        return newHead;
    }
}
