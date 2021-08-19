class LinkedList
{
    class Node
    {
        int data;
        Node next;

        Node(int data)                  // constructor for initializing class variable data
        {
            this.data = data;
        }
    }
     Node head;                         // head pointer points to the first element
     
     public boolean isEmpty()           // to check that the linked list id empty
     {
         return this.head == null;
     }
    
     //-----------------------------------Display-------------------------------
     
     public void display()             
     {
         System.out.println("------------------------------------");
         Node temp = this.head;

         while(temp != null)
         {
             System.out.print(temp.data+" ");
             temp = temp.next;
         }
        System.out.println();
        System.out.println("------------------------------------"); 
     }
   
     // ---------------------------------Insertion-----------------------------
    
    public void addFirst(int data)         // to add, element at first index
    {
        Node n = new Node(data);
        n.next = this.head;
        this.head = n;
    }

    public void addLast(int data)     // to add, element at last index
    {
        if(this.head == null)
        {
            addFirst(data);
        }

        Node n = new Node(data);
        Node temp = this.head;

        while(temp.next != null)
        {
            temp = temp.next;
        }
        
        temp.next = n;
    }

    public void addAt(int data, int index)  // to add, element at given index position
    {
        if(index < 0 )                     // if index is less than zero then exit
            return;                      
    
        if(index == 0)                    // if index value is zero then the element goes to first index
        {    
            addFirst(data);
            return;
        }

        Node nn = new Node(data);        // if we have to insert element at a given index
        Node temp = this.head;
        for(int i=0; i<index-1; i++)
        {
            temp = temp.next;

        }

        Node forward = temp.next;      
        temp.next = nn;
        nn.next = forward;
    }
   
    // ---------------------------Deletion------------------------

    public int removeFirst()      // delete from first index
    {
        if(this.head == null)     // if head element is null
            return -1;
        
        int rv = this.head.data;  // storing data of head element 
        this.head = this.head.next;
        return rv;
    }

    public int  removeLast()
    {
        Node temp = this.head;

        while(temp.next.next != null)
        {
            temp = temp.next;
        }
        int rv = temp.next.data;
        temp.next = null;
         return rv;
    }

    public int removeAt(int index)
    {
        if(index < 0)
            return -1;
        if(index == 0)
            return removeFirst();
        
        Node temp = this.head;
        for(int i=0; i<index-1; i++)
        {
            temp = temp.next;
        }

        int rv = temp.next.data;
        temp.next = temp.next.next;

        return rv;
    }

    //----------------------------------Driver Method--------------------------

    public static void main(String args[])
    {
        LinkedList ll = new LinkedList();
        ll.addFirst(10);
        ll.addLast(20);
        ll.addLast(30);
        ll.addLast(40);
        ll.addLast(50);
        ll.addLast(60);
        ll.addFirst(0);
        ll.display();
        ll.addAt(15, 2);  
        ll.display();
        ll.removeLast();
        ll.removeAt(3);
        ll.display();
    }



}