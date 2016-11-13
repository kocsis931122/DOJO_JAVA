package datastructure;

public class Main {
	// Binary tree
	public static void main(String[] args) {
		BTree root = new BTree("root");
		root.addLeft(new BTree("left tree"));
		root.addRight(new BTree("right tree"));
		printBTree(root);
	}

	private static void printBTree(BTree bTree) {
		System.out.println(bTree.getNodeName());
		BTree rightItem = bTree.getRight();
		if (rightItem != null) {
			printBTree(rightItem);
		}
		BTree leftItem = bTree.getLeft();
		if (leftItem != null) {
			printBTree(leftItem);
		}

	}

	// public static void main(String[] args) {
	// ListItem firstListItem = new ListItem("first");
	// firstListItem.addNext(new ListItem("secont"));
	// }

	// public static void main(String[] args) {
	// TreeItem root = new TreeItem("root");
	// for (int i = 0; i < 10; i++) {
	// TreeItem item = new TreeItem(i + "");
	// root.addNode(item);
	// for (int j = 0; j < 5; j++) {
	// item.addNode(new TreeItem(i+ " - " + j + ""));
	// }
	// }
	// printTree(root);
	// }
	//
	// public static void printTree(TreeItem treeItem) {
	// System.out.println(treeItem.getNodeName());
	// for (TreeItem item : treeItem.getNodes()) {
	// printTree(item);
	// }
	// }
}
