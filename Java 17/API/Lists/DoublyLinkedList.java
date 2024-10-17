public class DoublyLinkedList{
    private ListNode head;
    private ListNode tail;
    private final int length;

    private static class ListNode{
        private final int data;
        private ListNode previous;
        private ListNode next;

        public ListNode(int data){
            this.data = data;
            this.previous = null;
            this.next = null;
        }
    }
    public DoublyLinkedList(){
        this.head = null;
        this.tail = null;
        this.length = 0;
    }
    public boolean isEmpty(){
        return this.length == 0;
    }
    public void displayForward(){
        ListNode temp = head;
        while (temp != null){
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public void displayBackward(){
        ListNode temp = tail;
        while (temp != null){
            System.out.print(temp.data + " --> ");
            temp = temp.previous;
        }
        if(temp == null) System.out.println("null");
    }
    public void insertFirst(int data){
        ListNode newNode = new ListNode(data);
        if (this.head == null){
            tail = newNode;
        } else{
            newNode.next = head;
            head.previous = newNode;     
        }
        head = newNode;
    }
    public void insertLast(int data){
        ListNode newNode = new ListNode(data);
        if (this.head == null){
            head = newNode;
        } else {
            tail.next = newNode;
            newNode.previous = tail;
        }
        tail = newNode;
    }
    public void deleteFirst(){
        try {
            ListNode temp = head.next;
            head.next.previous = null;
            head = temp;
        } catch (Exception e) {
            throw e;
        }
    }
    public void deleteLast(){
        ListNode temp = tail;
        tail.previous.next = null;
        tail = temp;
    }
    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        
        ListNode n1 = new ListNode(2);
        ListNode n2 = new ListNode(3);
        ListNode n3 = new ListNode(4);
        ListNode n4 = new ListNode(5);

        //forward
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        //backward
        n4.previous = n3;
        n3.previous = n2;
        n2.previous = n1;
        //assigning head & tail
        dll.head = n1;
        dll.tail = n4;

        dll.displayForward();
        dll.displayBackward();

        //insert a node in the beginning
        dll.insertFirst(1);
        dll.displayForward();
        dll.displayBackward();

        //delete the first node
        dll.deleteFirst();
        dll.displayForward();
        dll.insertFirst(2);
        dll.displayForward();

        //delete the last node
        dll.deleteLast();
        dll.displayForward();
    }
}