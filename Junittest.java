package Testing;

public class Junittest 
{
	 private <E> void swap(E[] a, int i, int j)
	 {
	        if (i != j) 
	        {
	            E temp = a[i];
	            a[i] = a[j];
	            a[j] = temp;
	        }
	    }

	    public <E extends Comparable<E>> void selectionSort(E[] a) 
	    {
	        for (int i = 0; i < a.length - 1; i++) 
	        {
	            int smallest = i;
	            for (int j = i + 1; j < a.length; j++)
	            {
	                if (a[j].compareTo(a[smallest]) <= 0)
	                {
	                    smallest = j;
	                }
	            }

	            swap(a, i, smallest);
	        }
	    
	     // return Arrays.toString(arr);
	    }

}
