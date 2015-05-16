package ex04_04;

public class Iterator {
	private int lastId;
	private boolean notEmpty = true;
	private Object[] set;
	
	public void getObjSet(Object[] set){
		this.set = set;
		lastId = set.length;
		checkNotEmpty();
	}
	
	public boolean hasNext(){
		return notEmpty;
	}
	
	public Object next(){
		lastId--;
		checkNotEmpty();
		return set[lastId];
	}	
	
	private void checkNotEmpty(){
		if(lastId > 0){
			notEmpty = true;
		}
		else{
			notEmpty = false;
		}
	}
}
