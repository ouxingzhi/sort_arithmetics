/**
 * 选择排序
 * @author ouxz
 *
 */
public class SelectionSort implements SortInterface{
	
	private void swap(int[] array,int a,int b){
		int x = array[a];
		array[a] = array[b];
		array[b] = x;
	}
	
	public int[] sort(int[] array){
		//循环整个数组
		for(int i=0,l=array.length;i<l;i++){
			//记录当前的key
			int k = i;
			//从当前开始找到最后，判断是不是小于k，如果小于则将key赋给k
			for(int next=i+1;next<l;next++){
				if(array[next] < array[k]) k = next;
			}
			//如果找到则交换位置
			if(k != i) swap(array,k,i);
		}
		
		return array;
	}
}
