package com.sonata.daythree;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DemoApplicationTests {
	DemoApplication d1 = new DemoApplication();
	@Test
	public void addtest() {
		assertEquals(500,d1.add(200, 300));
	}

}

