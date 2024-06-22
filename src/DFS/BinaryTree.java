package DFS;

import binary_tree.BTNode;

public class BinaryTree {
	private BTNode root;
	
	public BinaryTree() {}
	public BinaryTree(BTNode r){root=r;}
	public BTNode getRoot() {
		return root;
	}
	public void setRoot(BTNode root) {
		this.root = root;
	}
	
	public BTNode createNode(int data)   
	{
		return new BTNode(data);
	}
	//*************Pre order************
	public void preOrder()//wrapper fun
	{
		preOrderT(root);
	}
	public void preOrderT(BTNode r)//recursion
	{
		if(r==null) return;
		System.out.print(" "+r.getData());
		preOrderT(r.getLeft());
		preOrderT(r.getRight());
		return;
	}
	//*************IN order************
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
	//*************post order************
	public void postOrder()//wrapper fun
	{
		postOrderT(root);
	}
	public void postOrderT(BTNode r)//recursion
	{
		if(r==null) return;
		postOrderT(r.getLeft());
		postOrderT(r.getRight());
		System.out.print(" "+r.getData());
		return;
	}
}
