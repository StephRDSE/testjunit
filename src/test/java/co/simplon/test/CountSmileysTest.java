package co.simplon.test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class CountSmileysTest {
	@Test
	public void shouldReturnZeroIfNull() {
		assertEquals(0, CountSmileys.countSmileys(null));
	}
	@Test
	public void shouldReturnZeroIfEmpty() {
		List<String> arr = new ArrayList<String>();
		assertEquals(0, CountSmileys.countSmileys(arr));
	}
	@Test
	public void shouldReturnOne() {
		List<String> arr = new ArrayList<String>();
		arr.add(";)");
		assertEquals(1, CountSmileys.countSmileys(arr));
	}
	@Test
	public void shouldReturnBadOne() {
		List<String> arr = new ArrayList<String>();
		arr.add(";[");
		assertEquals(0, CountSmileys.countSmileys(arr));
	}
	

}
