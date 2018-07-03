package co.simplon.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CamelCaseTest {
		@Test
		public void noStringTested() {
			String str = null;
			assertEquals(null, CamelCase.camelCase(str));
		}
		
		@Test
		public void emptyStringTested() {
			String str = "";
			assertEquals("", CamelCase.camelCase(str));
		}
		
		@Test
		public void oneWordTested() {
			String str = "word";
			assertEquals("Word", CamelCase.camelCase(str));
		}
		
		@Test
		public void multiWordTest() {
			String str = "word tested";
			assertEquals("WordTested", CamelCase.camelCase(str));
		}
	
}
