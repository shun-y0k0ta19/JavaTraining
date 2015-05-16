package ex09_03;

public class Pascal {

	private int depth;
	private int[][] rowList;
	
	public Pascal(int depth)
	{
		this.depth = depth;
		rowList = new int[depth][];
		for(int i = 0; i < depth; i++){
			rowList[i] = new int[i+1];
		}
		calcPascal();
	}
	
	public int getDepth(){
		return depth;
	}
	
	public void show()
	{
		for(int i = 0; i < depth ; i++){
			for(int j = 0; j < depth * 2; j++){
				if(i + j == 11)
				{
					for(int k = 0; k < i; k++){
						System.out.printf("%d ", rowList[i][k]);
						j += 2;
					}
					System.out.println();
					break;
				}
				System.out.printf(" ");
			}
		}
	}
	
	private void calcPascal()
	{
		for (int i = 0; i < depth; i++){
			rowList[i][0] = 1;
			for(int j = 1; j < rowList[i].length - 1; j++){
				rowList[i][j] = rowList[i-1][j-1] + rowList[i-1][j];
			}
		}
	}
}
