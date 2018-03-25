package nodes;

public class LinkedList implements Listable {

	private ListItem root = null;

	public LinkedList(ListItem item){
		this.root = item;
	}

	@Override
	public ListItem getRoot() {
		return root;
	}

	@Override
	public boolean addItem(ListItem item) {
		if(this.root == null){
			this.root = item;
		}
		ListItem currentItem = this.root;
		while(currentItem != null){
			int comparison = (currentItem.compareTo(item));
			if(comparison < 0){
				if(currentItem.next() != null){
					currentItem = currentItem.next();
				}else{
					currentItem.setNext(item);
					item.setPrevious(currentItem);
					return true;
				}
			}else if(comparison > 0){
				if(currentItem.previous() != null){
					currentItem.setNext(item);
					item.setPrevious(currentItem.previous());
					item.setNext(currentItem.setPrevious(item));
				}else{
					item.setNext(this.root);
					this.root.setPrevious(item);
					this.root = item;
				}
				return true;
			}else{
				return false;
			}
		}
		return false;
	}

	@Override
	public boolean removeItem(ListItem item) {
		if(item != null){
			ListItem currentItem = this.r
		}
	}

	@Override
	public void traverse(ListItem root) {
		if(root == null){
			System.out.println("The list is empty");
		}else{
			while(root != null){
				System.out.println(root.getValue());
				root = root.next();
			}
		}
	}
}
