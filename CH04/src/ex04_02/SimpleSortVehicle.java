package ex04_02;

public class SimpleSortVehicle extends SortHarness{
	
	protected void doSort(){
		for(int i = 0; i < getDataLength(); i++){
			for(int j = i + 1; j < getDataLength(); j++){
				if(compare(i,j)>0)
					swap(i,j);
			}
		}
	}
	
	public int compareObject(Object o1, Object o2){
		try
		{
			Vehicle vc1 = (Vehicle)o1;
			Vehicle vc2 = (Vehicle)o2;
			return (int)(vc1.getVehicleID() - vc2.getVehicleID());
		}
		catch(ClassCastException e){
			System.out.println(e.toString());
			return 0;
		}
	}
}