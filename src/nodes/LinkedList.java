package nodes;

public class LinkedList implements Listable {
	
	private ListItem root = null;
	
	public LinkedList(ListItem item){
		this.root = item;
	}

	@Override
	public ListItem getRoute() {
		// TODO Auto-generated method stub
		return null;
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
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void traverse(ListItem root) {
		// TODO Auto-generated method stub
		
	}
	
	
}
