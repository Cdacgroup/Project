package linkList;

public class CircularLL {
	private IntNode last;
	
	public CircularLL() {}

	public void insertFirst(int data)
	{
		IntNode new_node=new IntNode(data);
		if(last==null)
		{
			last=new_node;
			last.setNext(new_node);
			return;
		}
		new_node.setNext(last.getNext());
		last.setNext(new_node);
		return;
	}
	public void insertLast(int data)
	{
		IntNode new_node=new IntNode(data);
		if(last==null)
		{
			last=new_node;
			last.setNext(new_node);
			return;
		}
		new_node.setNext(last.getNext());
		last.setNext(new_node);
		last=new_node;
		return;
	}
	public int deleteFirst()
	{
		int d=-999;
		IntNode del;
		if(last==null)
			return d;
		del=last.getNext(); 
		d=del.getData();
		if(last!=last.getNext())
		  last.setNext(del.getNext()); 
		  del.setNext(null); 
		  del=null;
		 
		return d;	
	}
	public int deleteLast()
	{
		int d=-999;
		
		if(last==null)
			return d;
		IntNode itr=last.getNext();
		while(itr.getNext()!=last)
		itr=itr.getNext();
		itr.setNext(last.getNext());
		d=last.getData();
		last.setNext(null);
		last=null;
		last=itr;
		return d;
	}
	public String toString()
	{
		String str="List : ";
		IntNode itr=last.getNext();
		
		do{
			if(itr==null)
				return "Empty list" ;
			str=str+"-> "+itr.getData()+" ";
			itr=itr.getNext();
			
		}while(itr!=last.getNext());
		return str; 
	}
}
