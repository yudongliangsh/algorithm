package dataStructure.tree;

public class IterativeTreeSearch {
	public TreeNode myIterativeTreeSearch(TreeNode x,int key){
		while (x!=null && key!=x.getKey()) {
			if (key < x.getKey()) {
				x = x.getLeft();
			}
			else {
				x = x.getRight();
			}
		}
		return x;
	}
}
