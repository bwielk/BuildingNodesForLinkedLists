package nodes;

public interface Listable {
	ListItem getRoute();
	boolean addItem(ListItem item);
	boolean removeItem(ListItem item);
	void traverse(ListItem root);
}
