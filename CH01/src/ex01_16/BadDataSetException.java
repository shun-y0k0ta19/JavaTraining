package ex01_16;


@SuppressWarnings("serial")
public class BadDataSetException extends Exception {
	
	public String dataset_name;		//private
	public Exception ex;			//private
	
	public BadDataSetException(String name, Exception e){
		this.dataset_name = name;
		this.ex = e;
	}
}
