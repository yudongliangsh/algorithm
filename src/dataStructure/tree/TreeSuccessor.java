package dataStructure.tree;

public class TreeSuccessor {
	public TreeNode myTreeSuccessor(TreeNode x){
		TreeNode y = new TreeNode();
		if (x.getRight() != null) {
			y = x.getParent();
		}
		while (y!=null && x==y.getRight()) {
			x = y;
			y = y.getParent();
		}
		return y;
	}
}
