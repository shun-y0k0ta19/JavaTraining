package ex11_01;

public class LinkedList<String>{
	private String str = null;
	private LinkedList<String> nextlist = null;
	private int depth = 1;
			
	public LinkedList(String str){
		this.str = str;
	}
	
	public Object getStringt(){
		return str;
	}
	
	public LinkedList<String> getNextList(){
		return nextlist;
	}
	
	public void setString(String str){
		this.str = str;
	}
	
	private void setDepth(int depth){
		this.depth = depth;
	}
	
	public void setNextList(LinkedList<String> nextlist){
		this.nextlist = nextlist;
		this.nextlist.setDepth(++depth);
	}
	
}
