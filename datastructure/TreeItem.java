package datastructure;

import java.util.ArrayList;
import java.util.List;

public class TreeItem {
	private String nodeName;
	private List<TreeItem> nodes;

	public TreeItem(String nodeName) {
		this.nodeName = nodeName;
		nodes = new ArrayList<TreeItem>();
	}

	public void addNode(String nodeName) {
		TreeItem node = new TreeItem(nodeName);
		nodes.add(node);
	}

	public void addNode(TreeItem treeItem) {
		if (treeItem == null) {
			throw new NullPointerException();
		}
		nodes.add(treeItem);
	}

	public List<TreeItem> getNodes() {
		return nodes;
	}

	public String getNodeName() {
		return nodeName;
	}

}
