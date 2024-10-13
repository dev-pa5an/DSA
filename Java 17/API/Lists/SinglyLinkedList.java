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
    public void showSSL1(){
        if (this.containsLoop()){
            System.out.println("There is a loop in the singly linked list");
        } else {
            ListNode current = head;
            while (current != null){
                System.out.print(current.data + " --> ");
                current = current.next;
            }
            if (current == null) {
                System.out.println("null");
            }
        }
    }
    public void showSSL() {
        if (this.containsLoop()) {
            ListNode slow = head;
            ListNode fast = head;
    
            // Find the loop start
            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
                if (slow == fast) {
                    break; 
                }
            }
    
            // Print from head to loop start
            ListNode current = head;
            while (current != slow) {
                System.out.print(current.data + " --> ");
                current = current.next;
            }
    
            // Print the loop itself
            System.out.print("(" + current.data + " --> ");
            current = current.next;
            while (current != slow) {
                System.out.print(current.data + " --> ");
                current = current.next;
            }
            System.out.println(current.data + "...)"); // Indicate loop end
    
        } else { 
            // No loop - print normally
            ListNode current = head;
            while (current != null) {
                System.out.print(current.data + " --> ");
                current = current.next;
            }
            System.out.println("null");
        }
    }
    public int findLenght(){
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
    public void insertLast(int data){
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
    public void deleteFirst(){
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
    public void reverse(){

        ListNode current = head;
        ListNode previous = null;

        while (current != null){
            ListNode nextNode = current.next;
            current.next = previous;
            previous = current;
            current = nextNode;
        }
        head = previous;
    }
    public void removeDuplicates(){
        ListNode current = head;
        while (current != null && current.next != null){
            if (current.data == current.next.data){
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
    }
    //insert a node in a sorted singly linked list
    public void insertSorted(int value){
        ListNode current = head;
        while (current != null && current.next != null){
            if (value >= current.data && value <= current.next.data){
                ListNode temp = current.next;
                current.next = new ListNode(value);
                current.next.next = temp;
                return;
            }
            current = current.next;
        }
        if (current != null && current.next == null){
            current.next = new ListNode(value);
        }
    }
    public boolean containsLoop(){
        ListNode fastPtr = head;
        ListNode slowPtr = head;
        while (fastPtr != null && fastPtr.next != null){
            fastPtr = fastPtr.next.next;
            slowPtr = slowPtr.next;
            if (slowPtr == fastPtr) return true;
        }
        return false;
    }
    //find the start of a loop if exists
    public ListNode getStartNodeInLoop(){
        ListNode fastPtr = head;
        ListNode slowPtr = head;

        while (fastPtr != null && fastPtr.next != null){
            fastPtr = fastPtr.next.next;
            slowPtr = slowPtr.next;
            if (fastPtr == slowPtr){
                return getStartingNode(slowPtr);
            }
        }
        return null;
    }
    //using the Floyd's cycle detection algorithm
    private ListNode getStartingNode(ListNode slowPtr) {
        ListNode temp = head;
        while(temp != slowPtr){
            temp = temp.next;
            slowPtr = slowPtr.next;
        }
        return temp;
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

        System.out.println();
        System.out.println("deleting the first node");
        //delete the first node
        sll.deleteFirst();
        sll.showSSL();

        System.out.println();
        System.out.println("deleting the last node");
        //delete the last node
        sll.deleteLast();
        sll.showSSL();

        System.out.println();
        //delete a node at a given position
        int position = 1;
        System.out.println("delting the node at position " + position);
        sll.deleteAt(position);
        sll.showSSL();

        System.out.println();
        //search for a value
        int searchkey = 3;
        if (sll.exists(searchkey)){
            System.out.print(searchkey + " exists in the singly linked list ");
            sll.showSSL();
        } else {
            System.out.print(searchkey + " does not exist in the singly linked list ");
            sll.showSSL();
        }
        System.out.println();
        //reverse a SLL
        System.out.println("reversing the singly linked list");
        sll.reverse();
        sll.showSSL();
        System.out.println();

        //remove duplicates in a sorted linked list
        SinglyLinkedList sll2 = new SinglyLinkedList();
        sll2.head = new ListNode(1);
        ListNode n2 = new ListNode(5);
        ListNode n3 = new ListNode(10);
        ListNode n4 = new ListNode(13);
        ListNode n5 = new ListNode(23);

        sll2.head.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n2;
        
        sll2.showSSL();
        // sll2.removeDuplicates();
        // sll2.showSSL();

        //add a node in a sorted linked list
        // sll2.insertSorted(24);
        // sll2.insertSorted(20);
        // sll2.showSSL();

        //find the starting node of a loop in a singly linked list
        ListNode loopStartingNode = sll2.getStartNodeInLoop();
        System.out.println("starting node of the loop is " + loopStartingNode.data);
    }
}