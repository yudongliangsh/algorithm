package dataStructure.tree;

public class InorderTreeWalk {
	public void myInorderTreeWalk(TreeNode x){
		if (x!=null) {// && !"".equals(x)
			myInorderTreeWalk(x.getLeft());
			System.out.println(x.getKey());
			myInorderTreeWalk(x.getRight());
		}
	}
}
