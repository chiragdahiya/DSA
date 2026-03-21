package LinkedList;

public class SearchLl {
          Node head;
    class Node{
  
        int data;
        Node next;

          Node(int data) 
    {
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


public boolean searchL(int key){
    Node curr = head;

    while(curr!=null){
        if(curr.data == key){
            return true;
        }
        curr = curr.next;
    }
    return false;

}

    
    public static void main(String[] args){
         SearchLl list = new SearchLl();


        list.addFirst(20);
        list.addFirst(30);
        list.addFirst(40);
        list.addFirst(6);

        int key = 30;

        if(list.searchL(key)){
            System.out.println("key found");
        }
        else{
            System.out.println("Key not found");
        }


    }
    
}
