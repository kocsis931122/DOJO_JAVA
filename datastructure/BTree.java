package datastructure;

public class BTree {
	private String nodeName;
	private BTree left;
	private BTree right;

	public BTree(String nodeName) {
		this.nodeName = nodeName;
	}

	public BTree getLeft() {
		return left;
	}

	public void addLeft(BTree left) {
		this.left = left;
	}

	public BTree getRight() {
		return right;
	}

	public void addRight(BTree right) {
		this.right = right;
	}

	public String getNodeName() {
		return nodeName;
	}
}
