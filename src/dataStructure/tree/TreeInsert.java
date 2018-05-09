package dataStructure.tree;

public class TreeInsert {
	@SuppressWarnings("unused")
	public void myTreeInsert(Tree tree,TreeNode z){
		TreeNode x = new TreeNode();
		TreeNode y = new TreeNode();
		x = tree.getRoot();
		while (x != null) {
			y = x;
			if (z.getKey() < x.getKey()) {
				x =  x.getLeft();
			}else {
				x = x.getRight();
			}
		}
		z.setParent(y);
		if (y == null) {
			tree.setRoot(z);
		}
		else if (z.getKey() < y.getKey()) {
			y.setLeft(z);
		}
		else {
			y.setRight(z);
		}
	}
}
