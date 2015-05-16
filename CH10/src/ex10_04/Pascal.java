package ex10_04;

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
		int i = 0;
		while(i < depth){
			int j = 0;
			while(j < depth * 2){
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
				j++;
			}
			i++;
		}
	}
	
	private void calcPascal()
	{
		int i = 0;
		while (i < depth){
			rowList[i][0] = 1;
			int j = 1;
			while(j < rowList[i].length - 1){
				rowList[i][j] = rowList[i-1][j-1] + rowList[i-1][j];
				j++;
			}
			i++;
		}
	}
}
