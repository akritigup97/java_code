class ListNode
{
    int val;
    ListNode next;
    ListNode head =null;
    public ListNode(int data)
    {
        this.val =data;
    }
    public int getdata()
    {
        return this.val;
    }
    public void setdata(int data)
    {
       this.val =data; 
    }
      public ListNode getnext()
    {
        return this.next;
    }
    public void setnext(ListNode next)
    {
       this.next =next; 
    }
     public void insertAtbeginning(int dest)
    {
        ListNode destination= new ListNode(dest);
        destination.setnext(this.head);
        this.head=destination;
    }
    
    
}