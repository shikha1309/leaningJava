import java.util.Collections;
public class LL {
    Node head;
    private int size;

  static   class Node {
        String data;
        Node next  ;




        // making constructor of node class
        Node( String data) {
            this.data=data;
            this.next=null;  // at starting it will be null
        }
    }

    // 2.  operation -- add first and last
    public void addFirst(String data){
        Node newNode = new Node(data);  // creatinng object of Node
        // if head is null
        if (head== null) {
            head= newNode ; // assigning head to new node
            return;
        }
        // if head is not null  //next of new node will point to head
        newNode.next = head;
        head= newNode;
    }
    //  3. add last
    // we have to find null of this list for add value

    public void addLast(String data) {
      Node newNode = new Node(data) ;
       if(head==null) {
           head = newNode;
           return;
       }
       Node currNode=head; // assigning current node to the head // we cant loose our head
       while(currNode.next != null){
           currNode = currNode .next;
       }
        // updating node
       currNode.next= newNode;

    }

    // print
    public void printList(){
      // corner case
      if (head == null) {
          System.out.print(" List is empty");
          return;
      }
        Node currNode=head; // assigning current node to the head // we cant loose our head
        while(currNode != null){
            System.out.print(currNode.data +" ->");
            currNode = currNode .next;
        }
   System.out.println("Null");


    }




     public static void main(String args[]) {
        LL list =new LL();
        list.addFirst("shikha");
        list.addFirst(" yadav");
        list.printList();
        list.addLast(" Engineer");
         list.printList();
         list.addFirst(" Intelligent");
         list.printList();

 }

}
