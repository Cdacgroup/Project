package BFS;

import java.util.LinkedList;
import java.util.Queue;

import binary_tree.BTNode;

public class BSF_levelWise {
	private BTNode root;

	public BSF_levelWise() {}
	public BTNode getRoot() {
		return root;
	}

	public void setRoot(BTNode root) {
		this.root = root;
	}
	public void insert(int d)
	{
		BTNode new_node=new BTNode(d);
		if(root==null)
		{	root=new_node;
			return;
		}
		BTNode itr=root;
		Queue<BTNode> q=new LinkedList<BTNode>();
		q.add(itr);
		while(!q.isEmpty())
		{
			itr=q.remove();
			if(itr.getLeft()==null)
			{	
				itr.setLeft(new_node);
				return;
			}
			else
				q.add(itr.getLeft());
			if(itr.getRight()==null)
			{	
				itr.setRight(new_node);
				return;
			}
			else
				q.add(itr.getRight());
		}
		
	}
	
	public void traverse()
	{
		if(root==null)
			{
				System.out.println("List IS Empty");
				return;
			}
		BTNode itr=root;
		Queue<BTNode> q=new LinkedList<BTNode>();
		q.add(itr);
		System.out.print("List :");
		while(!q.isEmpty())
		{
			itr=q.remove();
			System.out.print(" "+itr.getData());
			if(itr.getLeft()!=null)
				q.add(itr.getLeft());
		
			if(itr.getRight()!=null)
				q.add(itr.getRight());
		}
		
	}
	public void leafNode()
	{
		if(root==null)
			{
				System.out.println("List IS Empty");
				return;
			}
		int suml=0,sum=0;
		BTNode itr=root;
		Queue<BTNode> q=new LinkedList<BTNode>();
		q.add(itr);
		while(!q.isEmpty())
		{
			itr=q.remove();
			if(itr.getLeft()==null && itr.getRight()==null)
				{
					System.out.print(" "+itr.getData());
					suml=suml+itr.getData();
				}
			if(itr.getLeft()!=null || itr.getRight()!=null)
			{
				//System.out.print(" "+itr.getData());
				sum=sum+itr.getData();
			}
			if(itr.getLeft()!=null)
				q.add(itr.getLeft());
		
			if(itr.getRight()!=null)
				q.add(itr.getRight());
		}
		System.out.println("\nSum of leaf node="+suml);
		System.out.println("\nSum of non-leaf node="+sum);
		
	}
	public void minMax()
	{
		if(root==null)
			{
				System.out.println("List IS Empty");
				return;
			}
		int min=0,max=0;
		BTNode itr=root;
		min=max=itr.getData();
		Queue<BTNode> q=new LinkedList<BTNode>();
		q.add(itr);
		while(!q.isEmpty())
		{
			itr=q.remove();
			
			if(itr.getData()<min)
				min=itr.getData();
			else if(itr.getData()>max)
				max=itr.getData();
			if(itr.getLeft()!=null)
				q.add(itr.getLeft());
		
			if(itr.getRight()!=null)
				q.add(itr.getRight());
		}
		System.out.println("\nMin ="+min);
		System.out.println("MAx="+max);
		
	}
	public void swap(BTNode r)
	{
		if(root==null)
			return;
		BTNode temp;
		temp=r.getLeft();;
		r.setLeft(r.getRight());
		r.setRight(temp);
		return;
		
	}
	public void miror_image()
	{
		BTNode itr=root;
		Queue <BTNode> q=new LinkedList<BTNode>();
		q.add(itr);
		while(!q.isEmpty())
		{
			itr=q.remove();
			swap(itr);
			if(itr.getLeft()!=null)
				q.add(itr.getLeft());
		
			if(itr.getRight()!=null)
				q.add(itr.getRight());
			
		}
	}
	public int levelCount()
	{
		int cnt=-1;
		if(root==null)
			return cnt;
		BTNode itr=root;
		BTNode dummy=new BTNode(-99);
		Queue <BTNode> q=new LinkedList<BTNode>();
		q.add(itr);
		q.add(dummy);
		while(!q.isEmpty())
		{
			itr=q.remove();
			if(itr.getData()==-99)
			{
				cnt++;
				q.add(dummy);
				itr=q.remove();
			}
			if(itr.getLeft()!=null)
				q.add(itr.getLeft());
		
			if(itr.getRight()!=null)
				q.add(itr.getRight());	
		}
		System.out.println(cnt);
		return cnt;
	}
	

}
