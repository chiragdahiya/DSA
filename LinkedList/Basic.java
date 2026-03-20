package LinkedList;

public class Basic {
    Node head;

   class Node{
    String data;
    Node next;


    Node(String data)     //constructor
    {
        this.data = data;
        this.next = null;
    }
   }
//add- first 

public void addFirst(String data){
    Node newNode = new Node(data);
    if(head == null){
        head = newNode;
        return;
    }

    newNode.next = head;
    head = newNode;
 


}


//delete first


public void deleteFirst(){
    if( head == null){
        System.out.println("List is empty");
        return;
    }

    head = head.next;    //single line to del first head
}


//delete last

public void deleteLast(){
    if(head == null){
        System.out.println("list is empty");
        return;
    }
 if(head.next == null){
    head = null;
    return;
 }


    Node secondLast = head;
    Node lastNode = head.next;
    while(lastNode.next != null){
        lastNode = lastNode.next;
        secondLast = secondLast.next;
    }


    secondLast.next = null;
}

public void addLast(String data){
    Node newNode = new Node(data);
    if(head == null){
        head = newNode;
        return;
    }
    Node currnode = head;
    while(currnode.next != null){
        currnode = currnode.next;

}
currnode.next = newNode;
}

//PRINT

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




   public static void main(String[] args){
    Basic list = new Basic();
    list.addFirst("a");
    list.addFirst("is");
    list.printList();

    list.deleteFirst();
    list.printList();

    list.addFirst("this");
    list.printList();

    list.deleteLast();
    list.printList();

   }
    
}
