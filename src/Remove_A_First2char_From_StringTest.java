import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



class Remove_A_First2char_From_StringTest {

	
	/*
	@Test
	void test() {
		fail("Not yet implemented");
	}
	
	*/
	
	/*
	 * Remove ‘A’ if it is present in first 2 characters of the string
	 * if ‘A’ is present after 2 characters, it should not be removed
	 * “ABCD” => “BCD”
	 * “AACD” => “CD” 
	 * “BACD” => “BCD”
	 * “BBAA” => “BBAA”       
     * “AABAA” => “BAA”
	 */
	

	Remove_A_First2char_From_String r;
	
	@BeforeEach
	void setup()
	{
		r= new Remove_A_First2char_From_String();
		
	}
	
	@Test
	void singleAPresentInFirst2char()
	{
		assertEquals("BCD", r.removeAFirstTwo("ABCD"));
		assertEquals("BCD", r.removeAFirstTwo("BACD"));
	}
	
	@Test
	void twoAPresentInFirst2char()
	{
		assertEquals("CD", r.removeAFirstTwo("AACD"));
		
		assertEquals("BAA", r.removeAFirstTwo("AABAA"));
	}
	
	@Test
	void noAPresentInFirst2char()
	{
		assertEquals("BBAA", r.removeAFirstTwo("BBAA"));
	}

}
