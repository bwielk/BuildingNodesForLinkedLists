package nodes;

public class SearchTree implements Listable{
	
	private ListItem root = null;
	
	public SearchTree(ListItem item){
		this.root = item;
	}

	@Override
	public ListItem getRoot() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean addItem(ListItem item) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeItem(ListItem item) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void traverse(ListItem root) {
		if(root != null){
			traverse(root.previous());
			System.out.println("SearchTree " + root.getValue());
			traverse(root.next());
		}
		
	}
}
