package datastructure;

public class ListItem {
	private String nodeName;
	private ListItem next;

	public ListItem(String nodeName) {
		this.nodeName = nodeName;
		this.next = null;
	}

	public String getNodeName() {
		return nodeName;
	}

	public void addNext(ListItem next) {
		this.next = next;
	}

	public ListItem getNext() {
		return next;
	}

}
