package unittests;

import primitives.Vector;
import org.junit.*;

import junit.framework.TestCase;

public class VectorTests extends TestCase {



	@Test
	public void testAdd() {
		Vector vec = new Vector(1, 2, 3);
		Vector vec2 = new Vector(5, 5, 5);
		Vector result = new Vector(6, 7, 8);
		assertEquals(result, vec.add(vec2));
	}

	@Test
	public void testSubtract() {
		Vector vec = new Vector(1, 2, 3);
		Vector vec2 = new Vector(5, 5, 5);
		Vector result = new Vector(4, 3, 2);
		assertEquals(result, vec.subtract(vec2));
	}

	
