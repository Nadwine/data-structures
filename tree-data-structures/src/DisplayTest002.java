import javax.swing.tree.DefaultMutableTreeNode;
/**
 * This class will use recursion to display all Employees earning over a certain amount and display the 
 * Employees who have subordinates and the number of Employees that directly respond to them.
 * @author Nadwine Louis
 *
 */

public class DisplayTest002 {
	public static void main(String[] args) {
		TreeModel tm = new TreeModel();
		DefaultMutableTreeNode rootnode = (DefaultMutableTreeNode) tm.getNode().getRoot();
		System.out.println("\n ===================== Printing Employees earning over £50000 using Recursion ========================== \n");
		tm.displayBySalary(rootnode, "", 50000);
		System.out.println("________________________________________________________________________________________________________");
		System.out.println("\n == Printing Employees with subordinates and the number of Employees that directly respond to them using Recursion == \n");
		tm.displaySubordinates(rootnode, "");
	}
}
