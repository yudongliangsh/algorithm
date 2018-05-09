package dataStructure;

import java.util.Stack;

public class BinaryTree {
	 private Node root = null;      
	 BinaryTree(int value) {  
        root = new Node(value);  
        root.leftChild  = null;  
        root.rightChild = null;  
	 }
	 /*
	  * public Node findKey(int value) {}   //����  
        public String insert(int value) {}  //����  
        public void inOrderTraverse() {}    //��������ݹ����  
        public void inOrderByStack() {}     //��������ǵݹ����      
        public void preOrderTraverse() {}  //ǰ�����  
        public void preOrderByStack() {}   //ǰ������ǵݹ����  
        public void postOrderTraverse() {} //�������  
        public void postOrderByStack() {}  //��������ǵݹ����  
        public int getMinValue() {} //�õ���С(��)ֵ  
        public boolean delete(int value) {} //ɾ��  
	  */
	 
	 public Node findKey(int value) {  
	    Node current = root;  
	    while (true) {  
	        if (value == current.value) {  
	            return current;  
	        } else if (value < current.value) {  
	            current = current.leftChild;  
	        } else if (value > current.value) {  
	            current = current.rightChild;  
	        }  	          
	        if (current == null) {  
	            return null;  
	        }
	    }  
	}
	 
	 public String insert(int value) {  
		 String error = null;  		   
		 Node node = new Node(value);  
		 if (root == null) {  
		     root = node;  
		     root.leftChild  = null;  
		     root.rightChild = null;  
		 } else {  
		     Node current = root;  
		     Node parent = null;  
		     while (true) {  
		         if (value < current.value) {  
		             parent = current;  
		             current = current.leftChild;  
		             if (current == null) {  
		                 parent.leftChild = node;  
		                 break;  
		             }  
		         } else if (value > current.value) {  
		             parent = current;  
		             current = current.rightChild;  
		             if (current == null) {  
		                 parent.rightChild = node;  
		                 break;  
		             }  
		         } else {  
		             error = "having same value in binary tree";  
		         }     
		     } // end of while  
		 }  
		 return error;  
	}
	 
	 /** 
	  * //�������(�ݹ�)�� 
	  *    1�����������������ڵ�������� 
	  *    2����������ڵ� 
	  *    3�����������������ڵ�������� 
	  */  
	 public void inOrderTraverse() {  
	     System.out.print("�������:");  
	     inOrderTraverse(root);  
	     System.out.println();  
	 }  
	   
	 private void inOrderTraverse(Node node) {  
	     if (node == null)   
	         return ;  
	       
	     inOrderTraverse(node.leftChild);  
	     node.display();  
	     inOrderTraverse(node.rightChild);  
	 }
	 
	 /** 
	     * ����ǵݹ������ 
	     *     1����������ڵ�current�����ýڵ㲻Ϊ���򽫸ýڵ�ѹջ�������������ڵ���Ϊcurrent���ظ��˲�����ֱ��currentΪ�ա� 
	     *     2����������Ϊ�գ�ջ���ڵ��ջ�����ʽڵ�󽫸ýڵ����������Ϊcurrent 
	     *     3) �ظ�1��2��������ֱ��currentΪ����ջ�ڽڵ�Ϊ�ա� 
	     */  
	    public void inOrderByStack() {  
	        System.out.print("����ǵݹ����:");  
	        Stack<Node> stack = new Stack<Node>();  
	        Node current = root;  
	        while (current != null || !stack.isEmpty()) {  
	            while (current != null) {  
	                stack.push(current);  
	                current = current.leftChild;  
	            }  	              
	            if (!stack.isEmpty()) {  
	                current = stack.pop();  
	                current.display();  
	                current = current.rightChild;  
	            }  
	        }  
	        System.out.println();  
	    }
	    
	    /** 
	     * //ǰ�����(�ݹ�)�� 
	     *    1����������ڵ� 
	     *    2�����������������ڵ�������� 
	     *    3�����������������ڵ�������� 
	     */  
	    public void preOrderTraverse() {  
	        System.out.print("ǰ�����:");  
	        preOrderTraverse(root);  
	        System.out.println();  
	    }  
	      
	    private void preOrderTraverse(Node node) {  
	        if (node == null)   
	            return ;  
	          
	        node.display();  
	        preOrderTraverse(node.leftChild);  
	        preOrderTraverse(node.rightChild);  
	    }
	    
	    /** 
	     * ǰ��ǵݹ������ 
	     *     1����������ڵ�current�����ýڵ㲻Ϊ������ʸýڵ���ٽ��ڵ�ѹջ�������������ڵ���Ϊcurrent���ظ��˲�����ֱ��currentΪ�ա� 
	     *     2����������Ϊ�գ�ջ���ڵ��ջ�����ýڵ����������Ϊcurrent 
	     *     3) �ظ�1��2��������ֱ��currentΪ����ջ�ڽڵ�Ϊ�ա� 
	     */  
	    public void preOrderByStack() {  
	        System.out.print("ǰ��ǵݹ����:");  
	        Stack<Node> stack = new Stack<Node>();  
	        Node current = root;  
	        while (current != null || !stack.isEmpty()) {  
	            while (current != null) {  
	                stack.push(current);  
	                current.display();  
	                current = current.leftChild;  
	            }  
	              
	            if (!stack.isEmpty()) {  
	                current = stack.pop();  
	                current = current.rightChild;  
	            }  
	        }  
	        System.out.println();  
	    } 
	    
	    /** 
	     * //�������(�ݹ�)�� 
	     *    1�����������������ڵ�������� 
	     *    2�����������������ڵ�������� 
	     *    3����������ڵ� 
	     */  
	    public void postOrderTraverse() {  
	        System.out.print("�������:");  
	        postOrderTraverse(root);  
	        System.out.println();  
	    }  
	      
	    private void postOrderTraverse(Node node) {  
	        if (node == null)   
	            return ;  
	          
	        postOrderTraverse(node.leftChild);  
	        postOrderTraverse(node.rightChild);  
	        node.display();  
	    }
	    
	    /** 
	     * ����ǵݹ������ 
	     *     1����������ڵ�current�����ýڵ㲻Ϊ������ʸýڵ���ٽ��ڵ�ѹջ�������������ڵ���Ϊcurrent���ظ��˲�����ֱ��currentΪ�ա� 
	     *     2����������Ϊ�գ�ȡջ���ڵ�������������������Ϊ�ջ��������շ��ʹ�������ʸýڵ㣬����preNode��Ϊ�ýڵ� 
	     *     3) �ظ�1��2��������ֱ��currentΪ����ջ�ڽڵ�Ϊ�ա� 
	     */  
	    public void postOrderByStack() {  
	        System.out.print("����ǵݹ����:");  
	        Stack<Node> stack = new Stack<Node>();  
	        Node current = root;  
	        Node preNode = null;  
	        while (current != null || !stack.isEmpty()) {  
	            while (current != null) {  
	                stack.push(current);  
	                current = current.leftChild;  
	            }  
	              
	            if (!stack.isEmpty()) {  
	                current = stack.peek().rightChild;  
	                if (current == null || current == preNode) {  
	                    current = stack.pop();  
	                    current.display();  
	                    preNode = current;  
	                    current = null;  
	                }  
	            }  
	        }  
	        System.out.println();  
	    }
	    
	    public int getMinValue() {  
	    	Node current = root;  
	    	while (true) {  
	    	    if (current.leftChild == null)  
	    	        return current.value;  	    	      
	    	    current = current.leftChild;  
	    	}
	    }
	 
}
