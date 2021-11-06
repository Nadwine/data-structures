
import javax.swing.tree.DefaultMutableTreeNode;

/**
 * This class will use recursion to list the Employees in the console window and will use tabulation 
 * to show the managers/subordinate relationships between nodes.
 * @author Nadwine Louis
 *
 */

public class DisplayTest001 {
	public static void main(String[] args) {
		TreeModel tm = new TreeModel();
		DefaultMutableTreeNode rootnode = (DefaultMutableTreeNode) tm.getNode().getRoot();
		System.out.println("\n ===================== Printing Employees using Recursion ========================== \n");
		tm.recursiveDisplay(rootnode, "");
		
	}
}
