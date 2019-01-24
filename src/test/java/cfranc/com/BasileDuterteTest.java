package cfranc.com;

import static org.junit.Assert.*;

import java.util.*;

import org.junit.Test;

public class BasileDuterteTest {
	@Test
    public void test(){
		Markov m = new Markov();        
		m.readFile("histoire.txt");        
		Couple p = new Couple("La", "legende");        
		assertEquals(1, m.couples.size());    
	}
	
	@Test
	public void testGenerate(){
		Markov m = new Markov();        
		m.readFile("histoire.txt");        
		Couple p = new Couple("La", "legende");        
		assertEquals("La legende raconte ", m.generateText(p,3));    
	}

	@Test
	public void testCouples(){
		Markov m = new Markov();        
		m.readFile("histoire.txt");        
		Couple p = new Couple("La", "legende"); 
		List<String> l = new ArrayList<String>();
		l.add("raconte");
		assertEquals(l, m.couples.get(p)); 
	}
	
	@Test
	public void testRepeat(){
		Markov m = new Markov();        
		m.readFile("histoireSuivante.txt");        
		Couple p = new Couple("La", "legende");        
		assertEquals(3, m.couples.size());   
	}
	
}
