package ex12_01;

public class ObjectNotFoundException extends Exception{
	private int depth;
	public ObjectNotFoundException(int depth){
		super("Object not found.");
		this.depth = depth;
	}
	
	public void show(){
		System.out.println("Object not found. depth = " + depth);
	}
}
/*
 * nullが正当な値なのか異常値を示すのかをメソッドごとに明示しておく必要があり、nullが異常値の
 * 場合はnullチェックを行わなければ、見つからなかった時点での警告ができない。(nullを参照すると
 * NullPointerExceptionがスローされるが、nullの原因が検索の結果見つからなかったことだと断定
 * できない)
 */
