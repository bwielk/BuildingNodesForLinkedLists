package nodes;

public class Main {
	
	public static void main(String[] args){
		String data = "Julia Naomi Karlie Vlada Sasha Vittoria Hanelore";
		nodes.LinkedList list = new nodes.LinkedList(null);
		list.traverse(list.getRoot());
		
		System.out.println("////////////////////Attempt no 1");
		String[] words = data.split(" ");
		for(String word : words){
			list.addItem(new Node(word));
		}
		
		System.out.println("////////////////////Attempt no 2");
		list.traverse(list.getRoot());
		list.removeItem(new Node("Sasha"));
		list.traverse(list.getRoot());
		
		System.out.println("////////////////////Attempt no 3");
		list.addItem(new Node("Omahyra"));
		list.addItem(new Node("Eugenia"));
		list.addItem(new Node("Daria"));
		list.removeItem(new Node("Naomi"));
		list.traverse(list.getRoot());
		
		System.out.println("////////////////////Attempt no 4");
		SearchTree tree = new SearchTree(null);
	}
}

