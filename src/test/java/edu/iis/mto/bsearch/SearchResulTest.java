package edu.iis.mto.bsearch;

import static org.junit.Assert.*;

import org.junit.Test;

public class SearchResulTest 
{
	
	SearchResult sr = new SearchResult();
	@Test
	public void sekwencja_null() 
	{
		int[] seq = null;
		int key = 1;
//		try 
		{	
			
			Exception e = new IllegalArgumentException();
			assertEquals(e, BinarySearch.search(key, seq));
			System.out.println("Wyjatek1 od searcha" + e.toString());
		} 
//		catch (Exception e) 
		{
//			System.out.println("Wyjatek od searcha " + e.toString());
			
		}
	}
	
	@Test
	public void  isFoundTestSeq1OK()
	{
		int[] seq = {1};
		int key = 1;
		sr = BinarySearch.search(key, seq);
		System.out.println("1 znajduje si� w sekwencji");
		assertEquals(true,  sr.isFound());
		assertEquals(1, sr.getPosition());
	}
	
	@Test
	public void  isFoundTestSeq1Feil()
	{
		int[] seq = {1};
		int key = 2;
		sr = BinarySearch.search(key, seq);
		System.out.println("2 nie znajduje si� w sekwencji");
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
		System.out.println("Jest �rodkowym elementem");
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
