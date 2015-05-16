package qsort;

import java.util.Random;

public class QuickSort {
	
	private static Random rgen = new Random();
	
	public static void sort(Object[] v, int left, int right, Cmp cmp){
		int i, last;
		
		if(left >= right){
			return;
		}
		swap(v, left, rand(left, right));
		last = left;
		for(i = left+1; i <= right; i++){
			if(cmp.cmp(v[i], v[left]) < 0){
				swap(v, ++last, i);
			}
		}
		swap(v, left, last);
		sort(v, left, last-1, cmp);
		sort(v, last+1, right, cmp);
	}
	
	private static void swap(Object[] v,int i, int j){
		Object tmp;
		tmp = v[i];
		v[i] = v[j];
		v[j] = tmp;
	}
	
	private static int rand(int left, int right){
		return left + Math.abs(rgen.nextInt()) % (right-left+1);
	}
}
