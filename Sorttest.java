package Testing;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class Sorttest
{

	@Test
	void test()
	{				
		
	        Integer arr[] = new Integer[]{3, 4, 1, 5};
			Junittest obj = new Junittest();
            obj.selectionSort(arr);
            Integer[] expectedResult = new Integer[] {1, 3, 4, 5};
            String Ex =Arrays.toString(expectedResult);
            String result = Arrays.toString(arr);
            assertEquals(Ex, result);
            
          //  assertEquals(Ex, result);
          //  for (int i = 0; i < expectedResult.length; i++)
              //  assertEquals("mismatch at " + i, Ex, result);
       
	}
	

}
