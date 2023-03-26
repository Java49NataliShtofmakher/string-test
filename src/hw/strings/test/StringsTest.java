package hw.strings.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StringsTest {

	@Test
	void testCharAt() {
		assertEquals('h', "hello".charAt(0));
		assertEquals('e', "qwerty".charAt(2));
	}

	@Test
	void testCompareTo() {
		assertTrue("qwerty".compareTo("hello") > 0);
		assertTrue("world".compareTo("world") == 0);
	}

	@Test
	void testCompareToIgnoreCase() {
		assertTrue("Apple".compareToIgnoreCase("pineapple") < 0);
		assertTrue("pineapple".compareToIgnoreCase("Apple") > 0);
		assertTrue("Apple".compareToIgnoreCase("apple") == 0);
	}

	@Test
	void testConcat() {
		assertEquals("helloworld", "hello".concat("world"));
	}

	@Test
	void testStartsWith() {
		assertTrue("hello".startsWith("he"));
		assertFalse("hello".startsWith("hi"));
	}

	@Test
	void testEndsWith() {
		assertTrue("hello".endsWith("lo"));
		assertFalse("hello".endsWith("la"));
	}

	@Test
	void testContains() {
		assertTrue("hello".contains("el"));
		assertFalse("hello".contains("le"));
	}

	@Test
	void testIndexOf() {
		assertEquals(2, "hello".indexOf("l"));
		assertEquals(-1, "hello".indexOf("a"));
	}

	@Test
	void testLastIndexOf() {
		assertEquals(3, "hello".lastIndexOf('l'));
		assertEquals(-1, "hello".lastIndexOf('a'));
	}
}
