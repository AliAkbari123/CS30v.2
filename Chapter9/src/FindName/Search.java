package FindName;



public class Search {


	
	public static int linear(String[] array, String NamToFind) {
		int index = 0;
		int size = array.length;
		
		while ((array[index] != NamToFind) && (index < size - 1)) {
			index += 1;
		}
		
		if (array[index] == NamToFind) 
		{
			return(index);
		} 
		else 
		{
			return(-1);
		}
	}
}