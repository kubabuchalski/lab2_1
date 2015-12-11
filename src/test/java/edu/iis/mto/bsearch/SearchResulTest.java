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
		System.out.println("1 znajduje si� w sekwencji");
		assertEquals(true,  sr.isFound());
	}
	
	@Test
	public void  isFoundTestSeq1Feil()
	{
		int[] seq = {1};
		int key = 2;
		sr = BinarySearch.search(key, seq);
		System.out.println("2 nie znajduje si� w sekwencji");
		assertEquals(false,  sr.isFound());
	}


}
