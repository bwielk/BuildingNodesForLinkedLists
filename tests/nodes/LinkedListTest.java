package nodes;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class LinkedListTest {

	private nodes.LinkedList list;
	private ListItem item1;
	private ListItem item2;
	private ListItem item3;
	
	@Before
	public void before(){
		list = new LinkedList(null);
		item1 = new Node("Anais");
		item2 = new Node("Naomi");
		item3 = new Node("Julia");
	}
	
	@Test
	public void listDoesntHaveAnyNodesInside(){
		assertNull(list.getRoot());
	}


}
