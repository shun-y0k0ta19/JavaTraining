package ex2_2;

import java.util.Random;

import qsort.Cmp;

public class IntegerQuickSort {
	private static Random rgen =new Random(0);
	
	public static void sort(Integer[] v, int left, int right){
		int i, last;
		
		if(left >= right){
			return;
		}
		swap(v, left, rand(left, right));
		last = left;
		for(i = left+1; i <= right; i++){
			if(cmp(v[i], v[left]) < 0){
				swap(v, ++last, i);
			}
		}
		swap(v, left, last);
		sort(v, left, last-1);
		sort(v, last+1, right);
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

	private static int cmp(Integer num1, Integer num2){
		if(num1 < num2){
			return -1;
		}
		else if(num1 == num2){
			return 0;
		}
		else{
			return 1;
		}

	}
}
