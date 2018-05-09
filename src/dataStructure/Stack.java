package dataStructure;

import java.util.List;


public class Stack {
	private List list;
	
	public List getList() {
		return list;
	}

	public void setList(List list) {
		this.list = list;
	}
		
	public boolean isEmpty(List list) {
		if (list.get(0) == null)
			return true;
		else 
			return false; 			
	}
	
	public void popStack(List list) {
		
	}
	
	
	
}
