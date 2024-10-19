import java.util.EmptyStackException;

public class Stacks {
    //instance variables
    private ListNode top;
    private int length;

    private class ListNode{
        private ListNode next;
        private int data;

        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }
    public Stacks(){
        this.top = null;
        this.length = 0;
    }
    public void showStack(){
        ListNode temp = top;
        while (temp != null){
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public boolean isEmpty(){
        return length == 0;
    }
    public void push(int data){
        ListNode temp = new ListNode(data);
        temp.next = top;
        top = temp;
        this.length++;
    }
    public int pop(){
        if (this.isEmpty()){
            throw new EmptyStackException();
        }
        int result = top.data;
        top = top.next; //then the top node will be garbage collected
        this.length--;
        return result;  
    }
    public int peek(){
        if (this.isEmpty()){
            throw new EmptyStackException();
        }
        return top.data;
    }
    public static void main(String[] args) {
        Stacks stack1 = new Stacks();
        stack1.push(3);
        stack1.push(2);
        stack1.push(1);

        stack1.showStack();
        System.out.println();
        int topValue = stack1.pop();
        System.out.println("top node is popped : " + topValue);
        stack1.showStack();
    }
}
