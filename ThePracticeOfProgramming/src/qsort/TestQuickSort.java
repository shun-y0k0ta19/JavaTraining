package qsort;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Random;

import org.junit.Test;

public class TestQuickSort {
	private final int cnt = 10000;
	private Random random = new Random();
	
	private void createRandomData(Integer[] data){
		for(int i = 0; i < data.length; i++){
			data[i] = Math.abs(random.nextInt());
		}
	}
	
	private void checkSort(Integer[] data){
		for(int i = 0; i < data.length-1; i++){
			assertFalse(data[i] > data[i+1]);
		}
	}
	
	private void reverse(Integer[] data){
		int i = 0;
		int j = data.length-1;
		int tmp;
		while(i < j){
			tmp = data[i];
			data[i] = data[j];
			data[j] = data[i];
			i++;
			j--;
		}
	}
	
	@Test
	public void testForRandomData() {
		Integer[] data = new Integer[cnt];
		createRandomData(data);
		QuickSort.sort(data, 0, data.length-1, new Icmp());
		checkSort(data);
	}
	
	@Test
	public void testForSortedData(){
		Integer[] data = new Integer[cnt];
		createRandomData(data);
		Arrays.sort(data);
		QuickSort.sort(data, 0, data.length-1, new Icmp());
		checkSort(data);
	}
	
	@Test
	public void testForReverseSortedData(){
		Integer[] data = new Integer[cnt];
		createRandomData(data);
		Arrays.sort(data);
		reverse(data);
		QuickSort.sort(data, 0, data.length-1, new Icmp());
		checkSort(data);
	}
	
	@Test
	public void testForSameElementData(){
		Integer[] data = new Integer[cnt];
		for(int i = 0; i < data.length; i++){
			data[i] = 1;
		}
		QuickSort.sort(data, 0, data.length-1, new Icmp());
		checkSort(data);
	}
	
	@Test
	public void testForOneElementData(){
		Integer[] data = new Integer[1];
		data[0] = 1;
		QuickSort.sort(data, 0, data.length-1, new Icmp());
		checkSort(data);
	}

	class Icmp implements Cmp{
		public int cmp(Object obj1, Object obj2){
			int i1 = ((Integer) obj1).intValue();
			int i2 = ((Integer) obj2).intValue();
			if(i1 < i2){
				return -1;
			}
			else if(i1 == i2){
				return 0;
			}
			else{
				return 1;
			}
		}
	}
	
}
