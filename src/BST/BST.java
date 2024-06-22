package BST;

import binary_tree.BTNode;

public class BST {
private BTNode root;
	
	public BST() {}
	public BST(BTNode r){root=r;}
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
		{
			root=new_node;
			return;
		}
		BTNode itr=root,par=root;
		while(itr!=null)
		{
			par=itr;
			if(itr.getData()>d)
				itr=itr.getLeft();
			else if(itr.getData()<d)
				itr=itr.getRight();
			else
				{
					System.out.println("duplicate");
					return;
				}
		}
		if(par.getData()>d)
			par.setLeft(new_node);
		else
			par.setRight(new_node);
		return;
		
	}
	
	public void search(int d)
	{
	
		if(root==null)
		{
			System.out.println("Empty");
			return;
		}
		BTNode itr=root;
		while(itr!=null)
		{
			if(itr.getData()==d)
			{
				System.out.println("found ");
				return;
			}
			if(itr.getData()>d)
				itr=itr.getLeft();
			else if(itr.getData()<d)
				itr=itr.getRight();
			
		}
		System.out.println("NOT found ");
		return;
		
	}
	public void inOrder()//wrapper fun
	{
		inOrderT(root);
	}
	public void inOrderT(BTNode r)//recursion
	{
		if(r==null) return;
		inOrderT(r.getLeft());
		System.out.print(" "+r.getData());
		inOrderT(r.getRight());
		return;
	}
	public int min()
	{
		
		if(root==null)
			return 0;
		BTNode itr=root;
		while(itr.getLeft()!=null)
			itr=itr.getLeft();
		return itr.getData();
	}
	public int max()
	{
		
		if(root==null)
			return 0;
		BTNode itr=root;
		while(itr.getRight()!=null)
			itr=itr.getRight();
		return itr.getData();
	}

}
