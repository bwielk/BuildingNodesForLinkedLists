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
	
	@Test
	public void listWithoutNodesCreatesRootOnceAcceptANewItem(){
		assertNull(list.getRoot());
		assertEquals(true, list.addItem(item1));
		assertEquals("Anais", list.getRoot().getValue());
		assertEquals(null, list.getRoot().next());
	}
	
	@Test
	public void listWithoutNodesCreatesRootAndReferencesToPreviousAndNextItemsAfterAddItemPart1(){
		assertEquals(true, list.addItem(item1));
		assertEquals(true, list.addItem(item2));
		assertEquals("Anais", list.getRoot().getValue());
		assertNull(null, list.getRoot().previous());
		assertEquals("Naomi", list.getRoot().next().getValue());
		ListItem naomi = list.getRoot().next();
		assertNull(null, naomi.next());
	}
	
	@Test
	public void listWithoutNodesCreatesRootAndReferencesToPreviousAndNextItemsAfterAddPart2(){
		assertNull(null, list.getRoot());
		assertEquals(true, list.addItem(item2));
		assertEquals("Naomi", list.getRoot().getValue());
		assertEquals(true, list.addItem(item3));
		assertEquals(true, list.addItem(item1));
		assertEquals("Julia", list.getRoot().next().getValue());
		assertEquals(null, list.getRoot().previous());
		assertNotEquals("Anais", list.getRoot().next().next().getValue());
	}
	
	@Test
	public void listOfNodesGetsAlphabaeticallySortedOnceItemsAreAdded(){
		assertNull(null, list.getRoot());
		assertEquals(true, list.addItem(item2));
		assertNull(list.getRoot().previous());
		assertNull(list.getRoot().next());
		assertEquals(true, list.addItem(item3));
		assertEquals("Julia", list.getRoot().getValue());
		assertEquals("Naomi", list.getRoot().next().getValue());
		assertEquals("Julia", list.getRoot().next().previous().getValue());
	}
}
