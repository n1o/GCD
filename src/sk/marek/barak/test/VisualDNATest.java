package sk.marek.barak.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import sk.marek.barak.VisualDNA;

public class VisualDNATest {
	VisualDNA visualDna;
	
	@Before
	public void setup(){
		visualDna = new VisualDNA();
	}

	@Test
	public void test() {
		assertEquals(5, visualDna.GCD(10, 15));
		assertEquals(5, visualDna.GCD(5, visualDna.GCD(15, 10)));
		assertEquals(4, visualDna.GCD(100, 36));
	}

}
