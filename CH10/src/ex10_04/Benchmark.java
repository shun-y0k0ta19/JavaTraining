package ex10_04;

abstract class Benchmark {
	abstract void benchmark();
	
	public final long repeat(int count){
		long start = System.nanoTime();
		while(count > 0){
			benchmark();
			count--;
		}
		return (System.nanoTime() - start);
	}

}
