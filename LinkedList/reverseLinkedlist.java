package LinkedList;
import java.util.Stack;
public class reverseLinkedlist {
  Node head;
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void reverse(){
         Stack<Node> stack = new Stack<>();
           Node temp = head;
           while(temp!=null){
            stack.push(temp);
            temp=temp.next;
           }
           head = stack.pop();
              temp = head;
             

              while(!stack.isEmpty()){
              Node curr = stack.pop();
                temp.next = curr;
                temp = curr;





        
    }
    temp.next = null;
    }

    public void printList(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }
public static void main(String[] args) {
    reverseLinkedlist list = new reverseLinkedlist();
    list.addFirst(10);
    list.addFirst(22);
    list.addFirst(31);
    list.addFirst(40);
    System.out.println("List:");
    list.printList();
    list.reverse();
    System.out.println("Reversed List:");
    list.printList();
}
}
