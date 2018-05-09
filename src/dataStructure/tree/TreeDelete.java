package dataStructure.tree;


public class TreeDelete {
	
	public void transplant(Tree t,TreeNode u,TreeNode v){
		if (u.getParent()==null) {
			t.setRoot(v);
		}
		else if (u == u.getParent().getLeft()) {
			u.setLeft(v);
			u.setParent(u);			
		}
		else {
			u.setRight(v);
			u.setParent(u);		
		}
		if (v != null) {
			v.setParent(u.getParent());
		}		
	}
	
	public void myTreeDelete(Tree t,TreeNode z){
		TreeNode y = new TreeNode();		
		if (z.getLeft() == null) {
			transplant(t,z,z.getRight());
		}
		else if (z.getRight() == null) {
			transplant(t,z,z.getLeft());
		}
		else {
			y = TreeMinimum.myTreeMiniNum(z.getRight());
			if (y.getParent() != z) {
				transplant(t,y,y.getRight());
				y.setRight(z.getRight());
				y.setRight(y);
				y.setParent(y);
				transplant(t,z,y);
				y.setLeft(z.getLeft());
				y.setLeft(y);
				y.setParent(y);
			}
		}
	}
}
