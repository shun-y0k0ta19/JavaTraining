package ex17_01;

public class CheckAvailableMemory {
	private CheckAvailableMemory[] cams;
	
	public static void main(String args[]){
		CheckAvailableMemory cam = new CheckAvailableMemory();
		cam.createManyInstance();
		System.out.println("free memory before gc:" + Runtime.getRuntime().freeMemory());
		cam = new CheckAvailableMemory();
		System.gc();
		System.out.println("free memory after gc: " + Runtime.getRuntime().freeMemory());		
	}
	
	public void createManyInstance(){
		final int insNum = 10000000;
		cams = new CheckAvailableMemory[insNum];
		for(int i = 0; i < insNum; i++){
			cams[i] = new CheckAvailableMemory();
		}
	}
}
