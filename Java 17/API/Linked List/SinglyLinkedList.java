





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
    void showSSL(){
        ListNode current = head;
        while (current != null){
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        if (current == null) {
            System.out.println("null");
        }
    }

    int findLenght(){
        if (head == null){
            return 0;
        }
        int count = 0;
        ListNode current = head;
        while (current != null){
            count++;
            current = current.next;
        }
        
        return count;
    }
    void insertFirst(int data){
        ListNode newNode = new ListNode(data);
        newNode.next = head;
        head = newNode;
    }
    void insertLast(int data){
        ListNode newNode = new ListNode(data);
        if (head == null){
            head = newNode;
            return;
        }
        ListNode currentNode = head;
        while (currentNode.next != null){
            currentNode = currentNode.next;
        }
        currentNode.next = newNode;
    }
    void insertAt(int data, int position){
        ListNode newNode = new ListNode(data);
        if (position == 1){
            newNode.next = head;
            head = newNode;
        } else {
            ListNode current = head;
            for (int i = 1; i < position - 1; i++){
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
        }
    }
    void deleteFirst(){
        if (head == null) return;
        head = head.next;
    }
    public void deleteLast(){
        if (head == null) return;
        if (head.next == null){
            head = null;
            return;
        }
        ListNode current = head;
        ListNode previous = head;
        while (current.next != null){
            previous = current;
            current = current.next;
        }
        previous.next = null;  
    }
    public void deleteAt(int position){
        if (position == 1){
            head = head.next;
            return;
        }
        ListNode current = head;
        ListNode previous = head;
        for (int i = 1; i < position; i++){
            previous = current;
            current = current.next;
        }
        previous.next = current.next;

    }
    public boolean exists(int searchkey){
        ListNode current = head;
        while (current != null){
            if (current.data == searchkey) return true;
            current = current.next;
        }
        return false;
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

        sll.showSSL();
        // System.out.println(sll.findLenght());
        
        //insert a new node at the beginning of a singly linked list
        System.out.println("adding a new node at the beginning");
        sll.insertFirst(10);
        sll.showSSL();
        System.out.println();
        //insert a new node at a given position
        System.out.println("adding a new node at a given position");
        sll.insertAt(80, 4);
        sll.showSSL();

        System.out.println("deleting the first node");
        //delete the first node
        sll.deleteFirst();
        sll.showSSL();

        System.out.println("deleting the last node");
        //delete the last node
        sll.deleteLast();
        sll.showSSL();

        //delete a node at a given position
        int position = 1;
        System.out.println("delting the node at position" + position);
        sll.deleteAt(position);
        sll.showSSL();

        //search for a value
        int searchkey = 3;
        if (sll.exists(searchkey)){
            System.out.print(searchkey + " exists in the singly linked list ");
            sll.showSSL();
        } else {
            System.out.print(searchkey + " does not exist in the singly linked list ");
            sll.showSSL();
        }
        

    }
}