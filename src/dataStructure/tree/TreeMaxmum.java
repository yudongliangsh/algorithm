package dataStructure.tree;

public class TreeMaxmum {
	public TreeNode myTreeMaxmum(TreeNode x){
		while (x.getRight() != null) {
			x = x.getRight();
		}
		return x;
	}
}
