package edu.iis.mto.bsearch;

import static org.junit.Assert.*;

import org.junit.Test;

public class SearchResulTest 
{
	
	SearchResult sr = new SearchResult();
	@Test
	public void  isFoundTestSeq1OK()
	{
		int[] seq = {1};
		int key = 1;
		sr = BinarySearch.search(key, seq);
		System.out.println("1 znajduje siê w sekwencji");
		assertEquals(true,  sr.isFound());
	}
	
	@Test
	public void  isFoundTestSeq1Feil()
	{
		int[] seq = {1};
		int key = 2;
		sr = BinarySearch.search(key, seq);
		System.out.println("2 nie znajduje siê w sekwencji");
		assertEquals(false,  sr.isFound());
	}
	
	@Test
	public void  FirstElement()
	{
		int[] seq = {1,2,3,4};
		int key = 1;
		sr = BinarySearch.search(key, seq);
		System.out.println("Jest pierwszym elementem");
		assertEquals(1, sr.getPosition());
	}
	
	@Test
	public void  LastElement()
	{
		int[] seq = {1,2,3,4};
		int key = 4;
		sr = BinarySearch.search(key, seq);
		System.out.println("Jest ostatnim elementem");
		assertEquals(seq.length, sr.getPosition());
	}
	
	@Test
	public void  CentralElement()
	{
		int[] seq = {1,2,3,4,5};
		int key = 3;
		sr = BinarySearch.search(key, seq);
		System.out.println("Jest œrodkowym elementem");
		assertEquals(3, sr.getPosition());
	}
	
	@Test
	public void  ElementNotFound()
	{
		int[] seq = {1,2,3,4,5};
		int key = 7;
		sr = BinarySearch.search(key, seq);
		System.out.println("Brak elementu w sekwencji");
		assertEquals(-1, sr.getPosition());
	}


}
