package ex02_02;

public class LinkedList {
	public Object obj;
	public LinkedList nextlist;
	
	public LinkedList(){
		obj = "this";
		nextlist = new LinkedList(obj);
	}
	
	public LinkedList(Object obj){
		this.obj = obj + " next";
	}
}
