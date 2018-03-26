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
			return true;
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
					currentItem.previous().setNext(item);
					item.setPrevious(currentItem.previous());
					item.setNext(currentItem);
					currentItem.setPrevious(item);
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
		ListItem currentItem = this.root;
		while(currentItem != null){
			int comparison = currentItem.compareTo(item);
			if(comparison == 0){
				if(currentItem == this.root){
					this.root = currentItem.next();
				}else{
					currentItem.previous().setNext(currentItem.next());
					if(currentItem.next() != null){
						currentItem.next().setPrevious(currentItem.previous());
					}
				}
				return true;
			}else if(comparison < 0){
				currentItem = currentItem.next();
			}else{
				//Item that is greater than the one to be deleted
				return false;
			}
		}
		return false;
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
