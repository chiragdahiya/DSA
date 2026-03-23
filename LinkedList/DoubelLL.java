public class DoubelLL {
    Node head;
    Node tail;

    class Node{
        int data;
        Node next;
        Node prev;

     Node(int val){
       data = val;
       next = prev= null;
    }
    };

    public class DoublyList{
        Node head;
        Node tail;
    }

    public DoubelLL(){
        head= null;
        tail = null;
    }


    public void push_front(int val){
        Node newNode = new Node(val);
        if(head ==null){
            head = newNode;
            tail = newNode;
        }else{
            newNode.next= head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void printList(){
    if(head == null){
        System.out.println("List is empty");
        return;
    }
    Node currNode = head;
    while(currNode != null){
        System.out.print(currNode.data + "->");
        currNode = currNode.next;
        }

        System.out.println("null");
}

public void pop_front(){
      if(head == null){
        System.out.println("its empty");
        return;
      }

      Node temp = head;
      head = head.next;

      if(head!=null){
        head.prev = null;
      }else{
        tail = null;
      }
      temp.next = null;
     
}

public void pop_back(){
    if(head == null){
        System.out.println("empty");
    }

    Node temp = tail;
    tail = tail.prev;

    if(tail!=null){
        tail.next= null;
    }
    temp.prev = null;
}

    public static void main(String[] args){

        DoubelLL dll = new DoubelLL();
                    dll.push_front(1);
                    dll.push_front(2);
                    dll.push_front(3);
                    dll.pop_front();
                    dll.pop_back();
                    dll.printList();
                    
    }


   
}
