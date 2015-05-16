package ex01_15;

public interface ImprovedLookup extends Lookup {
	
	void add(String name, Object value);
	boolean remove(String name);
}
