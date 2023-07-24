 class LL2 {
    // make LL
    Node head;
    private int size;

    LL2(){
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

    // reversing the  LL
    public void reverseIterate() {
        //corner case first null and only one element in LL
        if(head== null || head.next== null) {
         return;
        }
        Node preNode = head;
        Node currNode = head.next;

        while (currNode!= null) {
            Node nextNode = currNode.next;
            currNode.next= preNode;

            // update
            preNode =currNode;
            currNode= nextNode;
        }
        head.next=null;
        head=preNode;

     }
     public Node reverseRecursive(Node head) {
        if(head==null || head.next==null) {
            return head;
        }

        Node newHead  =   reverseRecursive(head.next);
        head.next.next =head ;
        head.next=null;
        return newHead;

     }


    public static void main(String[] args) {
        LL2 list = new LL2();
        list.addFirst("shikha");
        list.addFirst("is ");
        list.addFirst("tall");
        list.addLast("finally");
        list.printList();

//        list.reverseIterate();
//        list.printList();
       list.head =list.reverseRecursive(list.head) ;
        list.printList();



    }
}
