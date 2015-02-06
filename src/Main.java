import static java.lang.System.out;

import java.util.Arrays;


public class Main {
	public static void main(String[] args){
		
		
		SortInterface i = new SelectionSort();
		int[] arr = {1,3483,23,8,2};
 		out.println(Arrays.toString(i.sort(arr)));
	}
}
