import java.util.Enumeration;

import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.MutableTreeNode;
import javax.swing.tree.TreeNode;
/**
 * This class will be used to build the tree nodes using the DefaultTreeModel and provide 
 * the methods to display, move, remove and sort the nodes.
 * @author Nadwine Louis
 *
 */

public class TreeModel {
	
	
	private DefaultTreeModel treeModel;
	protected DefaultMutableTreeNode node1,node2,node3,node4,node5,node6,node7,node8,node9,node10,node11,node12,node13,node14;

	/**
	 * Build the tree nodes.
	 * @return
	 */
	public DefaultTreeModel getNode() {
		node1  = new DefaultMutableTreeNode(new Employee("Mohammed","Ali", "Senior Partner",120000 ));
		node2  = new DefaultMutableTreeNode(new Employee("Sara", "Johnson", "Managing Partner",89000 ));
		node3  = new DefaultMutableTreeNode(new Employee("Sandra", "Dee", "Partner",78500 ));
		node4  = new DefaultMutableTreeNode(new Employee("Fred", "Dibner", "Finance Manager", 67900));
		node5  = new DefaultMutableTreeNode(new Employee("Cleo", "Patra", "Junior Partner", 45000 ));
		node6  = new DefaultMutableTreeNode(new Employee("Irfan","Patel", "Junior Partner", 45000  ));
		node7  = new DefaultMutableTreeNode(new Employee("George", "Bush", "Office Manager", 37000 ));
		node8  = new DefaultMutableTreeNode(new Employee("Harry", "Potter", "Solicitor", 52500));
		node9  = new DefaultMutableTreeNode(new Employee("Ronald", "Reagan", "Senior Clerk",22000  ));
		node10 = new DefaultMutableTreeNode(new Employee("Simon","Templar", "Finance Officer", 18000 ));
		node11 = new DefaultMutableTreeNode(new Employee("Jacob ","Heart", "Clerk", 16000 ));
		node12 = new DefaultMutableTreeNode(new Employee("Barry", "Dwyer", "Clerk", 16000 ));
		node13 = new DefaultMutableTreeNode(new Employee("Mary", "Fritz", "Clerk", 16000 ));
		node14 = new DefaultMutableTreeNode(new Employee("Gordon", "Brown", "Finance Clerk", 16500));
		
		//setting node1 as root
		treeModel = new DefaultTreeModel(node1);
		
		//creating node1 sub directories
		treeModel.insertNodeInto(node2, node1, 0);
		treeModel.insertNodeInto(node3, node1, 0);
		treeModel.insertNodeInto(node4, node1, 0);
		
		//creating node2 sub directories
		treeModel.insertNodeInto(node5, node2, 0);
		treeModel.insertNodeInto(node6, node2, 0);
		treeModel.insertNodeInto(node7, node2, 0);
		
		////creating node3 sub directories
		treeModel.insertNodeInto(node8, node3, 0);
		treeModel.insertNodeInto(node9, node3, 0);
		
		//creating node4 sub directories
		treeModel.insertNodeInto(node10, node4, 0);
		
		//creating node7 sub directories
		treeModel.insertNodeInto(node11, node7, 0);
		treeModel.insertNodeInto(node12, node7, 0);
		
		//creating node9 sub directories
		treeModel.insertNodeInto(node13, node9, 0);
		
		//creating node10 sub directories
		treeModel.insertNodeInto(node14, node10, 0);
		
		
		return treeModel;
		
	}
	
	/**
	 * Displays the tree model through recursion.
	 * @param node
	 * @param tabulation
	 */
	public void recursiveDisplay(DefaultMutableTreeNode node, String tabulation){
		if(node == null) node = node1;
		System.out.println(tabulation + node);	// calls toString to print node
		for(int i = 0 ; i < node.getChildCount(); i++) //iterates by using child index or each node.
			recursiveDisplay((DefaultMutableTreeNode)node.getChildAt(i), tabulation + "		");
	}
	
	/**
	 * Display the subordinates.
	 */
	int rootPassed1 =0; //Safety variable to not print first node multiple times
	public void displaySubordinates(DefaultMutableTreeNode node, String tabulation){
		if(node == null) node = node1;
		if (rootPassed1 < 1) System.out.println(node + " [Direct Employees:" + node.getChildCount()+"]") ;
		rootPassed1++;
		for(int i = 0 ; i < node.getChildCount(); i++) {
			DefaultMutableTreeNode currentNode = (DefaultMutableTreeNode) node.getChildAt(i);
			Employee empl = (Employee) currentNode.getUserObject();
			if(currentNode.getChildCount() >= 1) System.out.println("		" + tabulation + empl + "  [Direct Employees:" + currentNode.getChildCount()+"]");
			displaySubordinates((DefaultMutableTreeNode)node.getChildAt(i), tabulation + "		");
	}
}
	/**
	 * Display nodes by salary.
	 */
	int rootPassed2 = 0; //Safety variable to not print first node multiple times
	public void displayBySalary(DefaultMutableTreeNode node, String tabulation, int salary){
		if(node == null) node = node1;
		Employee root = (Employee) node.getUserObject();
		// this loop starts with child node. This statement checks root node salary first
		if (rootPassed2 < 1 && sortBySalary(root,salary) == true) System.out.println(node) ;
		rootPassed2++;
		//loop using recursion by getting child index(i) for each node
		for(int i = 0 ; i < node.getChildCount(); i++) {
			DefaultMutableTreeNode currentNode = (DefaultMutableTreeNode) node.getChildAt(i);
			//convert current node in loop to raw employee object to access getSalary method
			Employee empl = (Employee) currentNode.getUserObject();
			// prints details if salary check returns true
			if(sortBySalary(empl, salary) == true) System.out.println("		" + tabulation + empl);
			displayBySalary((DefaultMutableTreeNode)node.getChildAt(i), tabulation + "		", salary);
	}
}
	/**
	 * Insert the nodes.
	 * @param newNode
	 * @param parent
	 * @param index
	 */
	public void insertNode(DefaultMutableTreeNode newNode, DefaultMutableTreeNode parent, int index) {
		Enumeration en = node1.depthFirstEnumeration();// temporary list for traversing through Tree
		while (en.hasMoreElements()) {
			
		  // Stores nextElement() to variable for each iteration
		  DefaultMutableTreeNode node = (DefaultMutableTreeNode) en.nextElement();
		  if(node.equals(parent)) { //stops when node variable is same as the parent parameter
			  //adds new node to target parent in the tree model
			  treeModel.insertNodeInto(newNode, node, index);
		  }
		}
	}
	
	/**
	 * Move the nodes.
	 */
	public void moveNode(DefaultMutableTreeNode nodeToMove, DefaultMutableTreeNode newParent, int index) {
		Enumeration en = node1.depthFirstEnumeration();
		while (en.hasMoreElements()) {
			
			// Stores nextElement() to variable for each iteration
		  DefaultMutableTreeNode node = (DefaultMutableTreeNode) en.nextElement();
		  if(node.equals(newParent)) {
			  treeModel.removeNodeFromParent(nodeToMove);
			  treeModel.insertNodeInto(nodeToMove, node, index);
		  }
		}
	}
	
	/**
	 * Remove a node.
	 * @param nodeToRemove
	 */
	public void removeNode(DefaultMutableTreeNode nodeToRemove) {
		Enumeration en = node1.depthFirstEnumeration();
		while (en.hasMoreElements()) {
			
			// Stores nextElement() to variable for each iteration
		  DefaultMutableTreeNode node = (DefaultMutableTreeNode) en.nextElement();
		  if(node.equals(nodeToRemove)) {
			  treeModel.removeNodeFromParent(nodeToRemove);;
		  }
		}
		
	}
	
	/**
	 * Sort the nodes based on salary.
	 * @param employee
	 * @param targetSalary
	 * @return
	 */
	//Method used by displayBySalary method ( returns true of salary is greater than targetSalary)
	private Boolean sortBySalary(Employee employee, int targetSalary) {
		if (employee.getSalary() > targetSalary) {
			return true;
		}
		else {
			return false;
		}
		
	}
}
