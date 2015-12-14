package edu.iis.mto.bsearch;

import static org.junit.Assert.*;

import org.junit.Test;

public class SearchResulTest 
{
	
	SearchResult sr = new SearchResult();
	@Test
	public void shouldThrowIllegalArgumentException() throws Exception  
	{
		int[] seq = {};
		int key = 2;
		 
	    // when
	    try 
	    {
	    	BinarySearch.search(key, seq);
	        // then
	    	System.out.println("Ta metoda powinna rzucic wyjatkiem IllegalArgumentException, ale tego nie zrobila.");
	        fail("Ta metoda powinna rzucic wyjatkiem IllegalArgumentException, ale tego nie zrobila.");
	    } 
	    catch(IllegalArgumentException e) 
	    {
	    	assertEquals(e.getMessage(), "IllegalArgumentException");
	    	System.out.println("Metoda rzucila wyjatkiem: " + e.getMessage());
	    }
	}
	
	@Test
	public void  isFoundTestSeq1OK()
	{
		int[] seq = {1};
		int key = 1;
		sr = BinarySearch.search(key, seq);
		System.out.println("1 znajduje siê w sekwencji");
		assertEquals(true,  sr.isFound());
		assertEquals(1, sr.getPosition());
	}
	
	@Test
	public void  isFoundTestSeq1Feil()
	{
		int[] seq = {1};
		int key = 2;
		sr = BinarySearch.search(key, seq);
		System.out.println("2 nie znajduje siê w sekwencji");
		assertEquals(false,  sr.isFound());
		assertEquals(-1, sr.getPosition());
	}
	
	@Test
	public void  FirstElement()
	{
		int[] seq = {1,2,3,4};
		int key = 1;
		sr = BinarySearch.search(key, seq);
		System.out.println("Jest pierwszym elementem");
		assertEquals(true,  sr.isFound());
		assertEquals(1, sr.getPosition());
	}
	
	@Test
	public void  LastElement()
	{
		int[] seq = {1,2,3,4};
		int key = 4;
		sr = BinarySearch.search(key, seq);
		System.out.println("Jest ostatnim elementem");
		assertEquals(true,  sr.isFound());
		assertEquals(seq.length, sr.getPosition());
	}
	
	@Test
	public void  CentralElement()
	{
		int[] seq = {1,2,3,4};
		int key = 2;
		sr = BinarySearch.search(key, seq);
		System.out.println("Jest œrodkowym elementem");
		assertEquals(true,  sr.isFound());
		assertEquals(2, sr.getPosition());
	}
	
	@Test
	public void  ElementNotFound()
	{
		int[] seq = {1,2,3,4,5};
		int key = 7;
		sr = BinarySearch.search(key, seq);
		System.out.println("Brak elementu w sekwencji");
		assertEquals(false,  sr.isFound());
		assertEquals(-1, sr.getPosition());
	}


}
