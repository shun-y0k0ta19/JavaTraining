package ex03_05;

public class MethodBenchmark extends Benchmark {

	private int loopcount;
	
	public void setLoopcount(int loopcount){
		this.loopcount = loopcount;
	}
	
	public int getLoopcount(){
		return this.loopcount;
	}
	
	@Override
	void benchmark(){
		for(int i = 0; i < this.loopcount; i++ );
	}
	

	public static void main(String[] args) {
		int count = Integer.parseInt(args[0]);
		MethodBenchmark loop = new MethodBenchmark();
		loop.setLoopcount(Integer.parseInt(args[1]));
		long time = loop.repeat(count);
		System.out.println(loop.getLoopcount() + "loops " + count + 
				"methods in " +time + "nanoseconds");
	}

}
