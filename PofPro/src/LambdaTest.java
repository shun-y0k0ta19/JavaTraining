import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.Callable;

public class LambdaTest {

	
	public static void main(String[] args) throws Exception {
		Callable<String> c = () -> "Hello from Callable";
		System.out.println(c.call());
		LambdaTest lt = new LambdaTest();
		lt.read("test.txt");
	}

	public void read(String name){
		FileReader fr;
		try {
			fr = new FileReader(name);
			fr.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
