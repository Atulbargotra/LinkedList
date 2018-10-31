class Node//Creating a node
{
    int data;
    Node next;
}
class LinkedList
{
    Node head;
    public void insert(int data)
    {
     Node node = new Node();
     node.data=data;
     node.next=null;
     if(head==null)
     {
       head=node;  
     }
     else
     {
         Node e = head;
         while(e.next!=null)
         {
           e=e.next;  
         }
         e.next=node;
     }
    }
    public void show()
    {
        Node node = head;
        while(node.next!=null)
        {
            System.out.println(node.data);
            node=node.next;
        }
        System.out.println(node.data);
        
    }
    public void insertAtStart(int data)
    {
        Node node = new Node();
        node.data=data;
        node.next=head;
        head=node;
    }
    public void insertAt(int index, int data)
    {
        Node node = new Node();
        node.data=data;
        node.next=null;
        if(index==0)
        {
            insertAtStart(data);
        }
        else
        {
         Node n = head;
         for(int i=0;i<index-1;i++)
         {
             n=n.next;
         }
         node.next=n.next;
         n.next=node;
        }
    }
    public void deleteAt(int index)
    {
        Node n = head;
        for(int i=0;i<index-1;i++)
        {
            n=n.next;
        }
        Node k = n.next;
        n.next=k.next;
        System.out.println("Deleted "+k.data+" new elements are");
        k=null;
        
    }
    
}
class Test//Driver class
{
	public static void main(String[] args) 
	{ 
           LinkedList l = new LinkedList();
           l.insert(5);
           l.insert(10);
           l.insert(50);
           l.insertAtStart(25);
           l.insertAt(0,88);
           l.deleteAt(2);
           l.show();
	} 
} 
