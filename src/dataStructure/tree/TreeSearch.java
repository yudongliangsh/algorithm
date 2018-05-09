package dataStructure.tree;

public class TreeSearch {
	public TreeNode myTreeSearch(TreeNode x,int key){
		if (x==null || key==x.getKey()) {
			return x;
		}
		if (key < x.getKey()) {
			return myTreeSearch(x.getLeft(),key);		
		}
		else{
			return myTreeSearch(x.getRight(),key);
		}
	}
}
