
public class InsertionSort implements SortStrategy{
	public void Sort(int [] num)
	{
	     int j;                  
	     int key;                
	     int i;  

	     for (j = 1; j < num.length; j++)    
	    {
	           key = num[ j ];
	           for(i = j - 1; (i >= 0) && (num[ i ] < key); i--) 
	          {
	                 num[ i+1 ] = num[ i ];
	          }
	         num[ i+1 ] = key;   
	     }
	}
}
