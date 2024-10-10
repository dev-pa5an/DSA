public class SinglyLinkedList{

    private ListNode head;

    private static class ListNode{
        private int data;
        private ListNode next;

        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
    } 

    public static void main(String[] args) {

        SinglyLinkedList sll = new SinglyLinkedList();

        sll.head = new ListNode(10);
        ListNode second = new ListNode(5); // second -> |5| |  -> null
        ListNode third = new ListNode(8);  // third  -> |8| |  -> null
        ListNode fourth = new ListNode(16);

        sll.head.next = second; // 10 --> 5
        second.next = third;    // 10 --> 5 --> 8
        third.next = fourth;    // 10 --> 5 --> 8 --> 16 --> null

    }
}