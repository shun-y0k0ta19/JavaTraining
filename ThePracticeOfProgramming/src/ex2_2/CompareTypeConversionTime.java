package ex2_2;

import java.util.Arrays;
import java.util.Date;
import java.util.Random;

import static org.junit.Assert.*;

import org.junit.Test;

public class CompareTypeConversionTime {
	private final int cnt = 2000000;
	private Random random = new Random();
	private Date data = new Date();
	
	CompareTypeConversionTime(){
		random.setSeed(data.getTime());
	}

	private void createRandomData(Integer[] data){
		for(int i = 0; i < data.length; i++){
			data[i] = Math.abs(random.nextInt());
		}
	}

	public void measureRunTime() {
		Integer[] data1 = new Integer[cnt];
		createRandomData(data1);
		Integer[] data2 = Arrays.copyOf(data1, data1.length);
		
		long startQsort = System.currentTimeMillis();
		QuickSort.sort(data1, 0, data1.length-1, new Icmp());
		long endQsort = System.currentTimeMillis();
		
		long startIQsort = System.currentTimeMillis();
		IntegerQuickSort.sort(data2, 0, data2.length-1);
		long endIQsort = System.currentTimeMillis();
		
		System.out.println("QuickSort RunTime " + (endQsort - startQsort));
		System.out.println("IntegerQuickSort RunTime " + (endIQsort - startIQsort));
	}

	public static void main(String[] args){
		CompareTypeConversionTime ctct = new CompareTypeConversionTime();
		ctct.measureRunTime();
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
