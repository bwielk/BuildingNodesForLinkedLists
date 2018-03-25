package nodes;

public class Node extends ListItem {

	public Node(Object o) {
		super(o);
	}

	@Override
	ListItem next() {
		return this.rightLink;
	}

	@Override
	ListItem previous() {
		return this.leftLink;
	}

	@Override
	ListItem setNext(ListItem item) {
		return this.rightLink = item;
	}

	@Override
	ListItem setPrevious(ListItem item) {
		return this.leftLink = item;
	}

	@Override
	int compareTo(ListItem item) {
		if(item != null){
			return ((String)super.getValue()).compareTo((String)item.getValue());
		}else{
			return -1;
		}
	}
}