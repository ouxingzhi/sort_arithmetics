import static java.lang.System.out;

import java.util.Arrays;


public class BottomUpSort implements SortInterface{
	public int[] merge(int[] array,int low,int middle,int high){
		int l = (high - low)+1;
		int[] subs = new int[l];
		int p1s = low;
		int p2s = middle;
		int i = 0;
		while(p1s <= middle && p2s <= high){
			if(array[p1s] < array[p2s]){
				subs[i] = array[p1s];
				p1s++;
			}else{
				subs[i] = array[p2s];
				p2s++;
			}
			i++;
		}
		if(p1s <= middle){
			while(p1s < middle){
				subs[i] = array[p1s];
				p1s++;
				i++;
			}
		}else if(p2s <= high){
			while(p2s < high){
				subs[i] = array[p2s];
				p1s++;
				i++;
			}
		}
		for(;low<=high;low++){
			array[low] = subs[low];
		}
		return array;
	}
	
	public int[] sort(int[] array){
		int[] arr = {1,6,2,8};
		out.println(Arrays.toString((merge(arr,0,1,3))));
		return array;
	}
}
