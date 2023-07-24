import java.util.*;
class LL {

    /* Implementation from scratch

    Node head;
    private int size;

    LL(){
        this.size=0;
    }

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
        // creating object of Node
        Node newNode = new Node(data);
        // if head is null
        if (head== null) {
            // assigning head to new node
            head= newNode ;
            return;
        }
        size++;
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
        size++;
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
  public void  deleteFirst() {
      // This will be  corner case
      if (head== null) {
          System.out.println("The list is empty");
          return;
      }
      // if head is not null
      // now head = previous head ka next
      size--;
      head = head.next;
  }
  public void deleteLast() {
      // This will be  corner case
      if (head== null) {
          System.out.println("The list is empty");
          return;
      }
      size--;
      // another corner case means only one node = if head .next = null then last node also null
      // null.next ==error
      if (head.next ==null) {
          head =null;


      }
      // for last deleting need to traverse
      // make a node of secondlast naam ka
      Node secondLast = head;   // like i
      Node lastNode = head.next;  // i+1

      // start traversing
      while (lastNode.next !=null) {
          lastNode =lastNode.next;
          secondLast = secondLast.next;
      }
      // found second last node will be null
      secondLast.next= null;

  }
  int getSize() {
        return size;

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

         list.deleteFirst();
         list.printList();


         list.printList();
      System.out.println(list.getSize());
  }

     */
    public static void main(String[] args) {
        LinkedList<String> list  = new LinkedList<String>();
        list.addFirst("shikha");
        list.addFirst("yadav");
        System.out.println(list );

        list.addLast("intelligent");
        System.out.println(list );
        System.out.println(list.size());

        // for printing the list
        for (int i=0 ; i<list.size(); i++) {
            System.out.print  (list.get(i) + " ->");
        }
        System.out.println("null");


        list.removeFirst();
        System.out.println(list);

        list.remove(0);
        System.out.println(list);

    }
}
