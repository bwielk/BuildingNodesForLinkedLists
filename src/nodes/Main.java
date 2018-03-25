package nodes;

public class Main {
	
	public static void main(String[] args){
		String data = "Julia Naomi Karlie Vlada Sasha Vittoria Hanelore";
		nodes.LinkedList list = new nodes.LinkedList(null);
		list.traverse(list.getRoot());
		
		String[] words = data.split(" ");
		for(String word : words){
			list.addItem(new Node(word));
		}
		
		list.traverse(list.getRoot());
	}
}








