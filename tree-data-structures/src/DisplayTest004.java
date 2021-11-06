import javax.swing.tree.DefaultMutableTreeNode;
/**
 * This class will be used to show the convenient way of adding and removing nodes to the existing tree model.
 * @author Nadwine Louis
 *
 */
public class DisplayTest004 extends TreeModel{
	public static void main(String[] args) {
		
		TreeModel tm = new TreeModel();
		tm.getNode();
		System.out.println("\n ============================== Printing Nodes Before Insertion ============================== \n");
		tm.recursiveDisplay(tm.node1, "");
		System.out.println("\n _________________________________________________________________________________________________ \n");
		
		DefaultMutableTreeNode node15 = new DefaultMutableTreeNode(new Employee("Paul", "Swann", "IT Manager", 54000));
		DefaultMutableTreeNode node16 = new DefaultMutableTreeNode(new Employee("James", "O’Brien", "IT Developer", 36000));
		DefaultMutableTreeNode node17 = new DefaultMutableTreeNode(new Employee("Mary", "Walkden", "IT Developer", 36000 ));
		DefaultMutableTreeNode node18 = new DefaultMutableTreeNode(new Employee("Philip", "Goodyear", "Finance Clerk", 16500));
		
		//Inserting New Nodes
		tm.insertNode(node15, tm.node3, 0);//( nodeToInsert, TargetParent, InsertIndex)
		tm.insertNode(node16, node15, 0);
		tm.insertNode(node17, node15, 0);
		tm.insertNode(node18,tm.node10,0);
		System.out.println("\n ================================ Printing After Insertion ======================================= \n");
		tm.recursiveDisplay(tm.node1, "");
		System.out.println("\n _________________________________________________________________________________________________ \n");
		
		//moving Nodes of 7 to 5
		tm.moveNode(tm.node11, tm.node5, 0);//( nodeToMove, newParentNode, InsertIndex)
		tm.moveNode(tm.node12, tm.node5, 0);
		//delete node 7
		tm.removeNode(tm.node7);
		System.out.println(" \n ================================= George Retires..Moving Staff ================================ \n");
		tm.recursiveDisplay(tm.node1, "");
		System.out.println("\n _________________________________________________________________________________________________ \n");
		
		
		
	}
}
