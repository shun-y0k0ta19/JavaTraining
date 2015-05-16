package ex10_04;

abstract class CopyOfBenchmark {
	abstract void benchmark();
	
	public final long repeat(int count){
		long start = System.nanoTime();
		/**
		 * 書き直してはいけない
		 * countが０だったときに、１と同じ値が出力されてしまう。
		 * ０を渡さないことが保証されているならば書き直せる
		 */
		do
		{
			benchmark();
			count--;	
		}
		while(count > 0);
		return (System.nanoTime() - start);
	}

}
