package nodes;

public abstract class ListItem {

	protected ListItem rightLink = null;
	protected ListItem leftLink = null;
	protected Object value;

	public ListItem(Object o){
		this.value = o;
	}

	abstract ListItem next();
	abstract ListItem previous();
	abstract ListItem setNext(ListItem item);
	abstract ListItem setPrevious(ListItem item);

	abstract int compareTo(ListItem item);

	public Object getValue(){
		return this.value;
	}

	public void setValue(Object newValue){
		this.value = newValue;
	}
}
