package com.hasanka;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ReverseStringDemoTest {
	
	ReverseStringDemo rsd;

	@Before
	public void setUp() throws Exception {
		rsd = new ReverseStringDemo();
	}

	@After
	public void tearDown() throws Exception {
	   rsd = null;
	}

	@Test
	public void testReverse() {
		assertEquals("dcba", rsd.reverse("abcd") );
		assertEquals("dc", rsd.reverse("cd"));
		assertEquals("", rsd.reverse(""));
		assertNull(rsd.reverse(null));
		
	}

}
