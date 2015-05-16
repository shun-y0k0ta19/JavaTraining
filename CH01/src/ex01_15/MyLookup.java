package ex01_15;

import java.util.ArrayList;

public class MyLookup implements ImprovedLookup {
	
	private ArrayList<String> names = new ArrayList<String>();
	private ArrayList<Object> values = new ArrayList<Object>();;

	public MyLookup(){
	}
	
	public MyLookup(String name, Object value){
		names.add(name);
		values.add(value);
	}
	
	@Override
	public Object find(String name) {
		for(int i = 0; i < names.size(); i++){
			if(names.get(i).equals(name)){
				return values.get(i);
			}
		}
		return null;
	}

	@Override
	public void add(String name, Object value) {
		names.add(name);
		values.add(value);
	}

	@Override
	public boolean remove(String name) {
		if(find(name) == null){
			System.out.println(name + " does not exist.");
			return false;
		}
		else{
			values.remove(names.indexOf(name));
			names.remove(name);
			return true;
		}
	}

}
