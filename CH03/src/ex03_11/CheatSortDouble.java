package ex03_11;

public class CheatSortDouble extends SortDouble{
	private boolean flg = false;
	
	protected void doSort(){
		if(flg){
			compare(0,0);
		    swap(0,0);
			return;
		}
		else{
			double[] tmp = {1};
			flg=true;
			simpleSort();
			super.sort(tmp);
		}
	}
	private void simpleSort(){
		for(int i = 0; i < getDataLength(); i++){
			for(int j = i + 1; j < getDataLength(); j++){
				if(compare(i,j)>0)
					swap(i,j);
			}
		}
	}
}