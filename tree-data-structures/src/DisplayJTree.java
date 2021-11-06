import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.tree.DefaultTreeModel;

/**
 * This class will be used to add a tree model to the JTree and display it.
 * @author Nadwine Louis
 *
 */

public class DisplayJTree extends JFrame {

	private JTree tree;
	private DefaultTreeModel treeModel;
	private JScrollPane scrollPane;
/**
 * Display JTree.
 * @param model
 */
	public DisplayJTree(TreeModel model) {
		super("Tree Test Example");
		setSize(400, 300);
		tree = new JTree(model.getNode());
		// Wrap using a scroll pane
		scrollPane = new JScrollPane(tree);
		// Display it.
		getContentPane().add(scrollPane, BorderLayout.CENTER);
		this.setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

}
