public class Main 
{

    public static void main(String[] args) 
    {
        int [] a = {1,2,4,7,16,19};
        int [] b = {1,2,5,6,6,22};
        Node<Integer> p1 = buildList(a);
        Node<Integer> p2 = buildList(b);
        ex_1(p1,p2);
    }
    
    public static Node<Integer> buildList(int[] a) 
	{
		Node<Integer> head = new Node<Integer>(-1);
		Node<Integer> p = head;
		Node<Integer> x;
		for (int i=0; i<a.length;i++) 
		{
			x = new Node<Integer>(a[i]);
			p.setNext(x);
			p = p.getNext();
		}
		return head.getNext();
	}
    
    public static Node <Integer> ex_1(Node <Integer> p1, Node <Integer> p2)
    {
        Node<Integer> head = new Node<Integer>(-1);
        Node<Integer> newList = head;
        while (p1!=null && p2!=null)
        {
            if (p1.getValue()>p2.getValue())
            {
                newList.setNext(new Node <Integer>(p2.getValue()));
                System.out.println(p2.getValue());
                p2 = p2.getNext();
                newList = newList.getNext();
            }
            if (p1.getValue()<p2.getValue())
            {
                newList.setNext(new Node <Integer>(p1.getValue()));
                System.out.println(p1.getValue());
                p1 = p1.getNext();
                newList = newList.getNext();
            }
            else
            {
                newList.setNext(new Node <Integer>(p1.getValue()));
                p1 = p1.getNext();
                p2 = p2.getNext();
                newList = newList.getNext();
            }
        }
        while (p1!=null) 
        {
            newList.setNext(new Node<Integer>(p1.getValue()));
            newList = newList.getNext();
            p1 = p1.getNext();
        }

        while (p2!=null) 
        {
            newList.setNext(new Node<Integer>(p2.getValue()));
            newList = newList.getNext();
            p2 = p2.getNext();
        }
        System.out.println(head);
        return head.getNext();
    }
    
    public static Node<Integer> L2ex2(Node <Integer> p){
      Node<Integer> h = new Node<Integer>(-1);
       h.setNext(p);
      	Node<Integer> x = new Node<Integer>(-1);
		Node<Integer> k = x;
		 while(h.getNext()!=null){
		    x.setNext(L2ex2help(h).getNext());
		    h=ex6(h,L2ex2help(h).getNext().getValue());
		    x=x.getNext();
		 }
		 
		return h.getNext();
	}
}
