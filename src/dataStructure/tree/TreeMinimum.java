package dataStructure.tree;

public class TreeMinimum {
	public static TreeNode myTreeMiniNum(TreeNode x){
		while (x.getLeft()!=null) {
			x = x.getLeft();
		}
		return x;
	}
}
