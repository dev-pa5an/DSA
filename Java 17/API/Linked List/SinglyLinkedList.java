public class SinglyLinkedList{

    private ListNode head;

    private static class ListNode{
        private final int data;
        private ListNode next;

        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
    } 
    public void showSSL(SinglyLinkedList ssl){
        ListNode current = ssl.head;
        while (current != null){
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        if (current == null) {
            System.out.println("null");
        }
    }

    public int findLenght(SinglyLinkedList ssl){
        int count = 0;
        ListNode current = ssl.head;
        while (current != null){
            count++;
            current = current.next;
        }
        
        return count;
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

        sll.showSSL(sll);
        System.out.println(sll.findLenght(sll));

    }
}