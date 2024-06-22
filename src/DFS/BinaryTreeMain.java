package DFS;

public class BinaryTreeMain {
	public static void main(String[] args) {
		BinaryTree b=new BinaryTree();
		b.setRoot(b.createNode(50));
		b.getRoot().setLeft(b.createNode(40));
		b.getRoot().getLeft().setLeft(b.createNode(30));
		b.getRoot().getLeft().setRight(b.createNode(45));
		b.getRoot().setRight(b.createNode(60));
		b.getRoot().getRight().setLeft(b.createNode(55));
		b.getRoot().getRight().setRight(b.createNode(66));
		System.out.println(" root="+b.getRoot().getData());
		System.out.println("\tPreOrdede:");
		b.preOrder();
		System.out.println("\n\tINOrdede:");
		b.inOrder();
		System.out.println("\n\tPostOrdede:");
		b.postOrder();
		
		
	}

}
