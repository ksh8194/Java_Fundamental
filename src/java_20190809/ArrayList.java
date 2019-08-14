package java_20190809;

public class ArrayList {
	private int defaultSize = 10;
	private Object[] obj;
	private int size;
	
	public ArrayList() {
		obj = new Object[defaultSize];
	}
	public ArrayList(int size) {
		defaultSize = size;
		obj = new Object[size];
	}
	
	public void add(Object o) {
		if(defaultSize == size) {
			obj[size++] = o;	
		}else {
			
		}
		
	}

	public Object get(int i) {
		return obj[i];
	}
	
	public void remove(int i) {
		
	}
}
