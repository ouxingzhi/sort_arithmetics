/**
 * ʵ�ֲ�������
 * @author ouxz
 *
 */
public class StraightInsertionSort implements SortInterface {
	@Override
	public int[] sort(int[] array){
		if(array == null || array.length < 2) return array;
		//�����ѭ������������
		for(int i=1,l=array.length;i<l;i++){
			//��õ�ǰ��ֵ
			int cur = array[i];
			//��õ�ǰ��ǰһ����index
			int i2 = i-1;
			//�ӵ�ǰλ�õ�ǰһ��λ�ÿ�ʼ�����صݼ�������ݼ���λ�õ�ֵҪ���ڵ�ǰλ�õ�ֵ���򸲸ǡ�
			//���򷵻�
			for(; i2>=0 && array[i2]>cur;i2--){
				array[i2+1] = array[i2];
			}
			array[i2+1] = cur;
		}
		return array;
	}
}
