public class BSTree {
	
	private TreeNode root;
	

	public TreeNode insert(TreeNode root, int val) {
		TreeNode node = new TreeNode(val);
		if(root == null) {
			this.root = node;
			return node;
		}
		TreeNode parent = null;
		TreeNode current = root;
		
		while(current != null) {
			parent = current;
			if(val < current.value) {
				current = current.left;
			} else {
				current = current.right;
			}
		}
		if(val < parent.value) {
			parent.left = node;
		} else {
			parent.right = node;
		}
		return root;
	}
	
	
	public void inOrder(TreeNode root) {
		if(root != null) {
			inOrder(root.left);
			System.out.println(root.value);
			inOrder(root.right);
		}
	}
	
	public static void main(String[] args) {
		BSTree bst = new BSTree();
		
		bst.insert(bst.root, 50);
		bst.insert(bst.root, 32);
		bst.insert(bst.root, 20);
		bst.insert(bst.root, 40);
		bst.insert(bst.root, 70);
		bst.insert(bst.root, 75);
		bst.insert(bst.root, 60);
		bst.insert(bst.root, 80);
		bst.inOrder(bst.root);
	}
	
	
	
	
	class TreeNode {
		int value;
		TreeNode left;
		TreeNode right;
		
		public TreeNode(int value) {
			this.value = value;
		}
		
		@Override
		public String toString() {
			return "value: " + value;
		}
		
	}
}
