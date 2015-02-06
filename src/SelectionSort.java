/**
 * ѡ������
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
		//ѭ����������
		for(int i=0,l=array.length;i<l;i++){
			//��¼��ǰ��key
			int k = i;
			//�ӵ�ǰ��ʼ�ҵ�����ж��ǲ���С��k�����С����key����k
			for(int next=i+1;next<l;next++){
				if(array[next] < array[k]) k = next;
			}
			//����ҵ��򽻻�λ��
			if(k != i) swap(array,k,i);
		}
		
		return array;
	}
}
