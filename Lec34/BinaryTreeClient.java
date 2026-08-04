package Lec34;

public class BinaryTreeClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree bt = new BinaryTree();
		// 10 true 20 true 40 false false true 50 false false true 30 false true 60 true 70 false false false
		bt.Display();
		System.out.println(bt.max());
		bt.PerOrder();
		bt.InOrder();
		bt.PostOrder();
		bt.LevelOrder();
	}

}
