public class NodeLastk {

    public static ListNode getLastk(int k, ListNode listNode) {

        if (listNode == null)
            return null;
        if (k <= 0)
            return null;
        int m = 0;

        //判断k的值


        ListNode first = listNode;
        ListNode second = listNode;

        while (second != null && m < k) {
            second = second.next;
            m++;
        }

        while (second != null) {
            first = first.next;
            second = second.next;
        }
        return first;
    }
    // 1 2 3 4 5 6

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        ListNode node6 = new ListNode(6);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        ListNode listNode = getLastk(10, node1);
        System.out.println(listNode.value);
    }
}

class ListNode {
    int value;
    ListNode next;

    public ListNode(int value) {
        this.value = value;

    }

}
