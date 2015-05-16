package ex01_16;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class MyUtilities {
	
	static final int MAX_DATASIZE = 5;

		public double[] getDataSet(String setName)
				throws BadDataSetException
		{
			String file = setName + ".dset";
			FileInputStream in = null;
			try{
				in = new FileInputStream(file);
				return readDataSet(in);
			}
			catch(IOException e){
				System.out.println("throw e");
				throw new BadDataSetException(setName, e);
			}
			finally{
				try{
					if(in != null){
						in.close();
					}
				}
				catch(IOException e){
					;
				}
			}
		}
		
		public double[] readDataSet(FileInputStream in)
				throws IOException
		{
			double[] data = new double[MAX_DATASIZE];
			DataInputStream dataIn = new DataInputStream(in);
			try{
				for(int i = 0; dataIn.available() > 0; i++){
					data[i] = dataIn.readDouble();
				}
				return data;
			}
			catch(IOException e){
				throw e;
			}
			finally{
				try{
					if(dataIn != null){
						dataIn.close();
					}
				}
				catch (IOException e){
					e.printStackTrace();
				}
			}
		}
		
		
}
