/**
 * 实现插入排序
 * @author ouxz
 *
 */
public class StraightInsertionSort implements SortInterface {
	@Override
	public int[] sort(int[] array){
		if(array == null || array.length < 2) return array;
		//最外层循环，处理所有
		for(int i=1,l=array.length;i<l;i++){
			//获得当前的值
			int cur = array[i];
			//获得当前的前一个的index
			int i2 = i-1;
			//从当前位置的前一个位置开始，往回递减，如果递减的位置的值要大于当前位置的值，则覆盖。
			//否则返回
			for(; i2>=0 && array[i2]>cur;i2--){
				array[i2+1] = array[i2];
			}
			array[i2+1] = cur;
		}
		return array;
	}
}
