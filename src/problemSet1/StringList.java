package problemSet1;

public class StringList<T> implements IList<T>{
	private T[] datastore;
	private int size;
	private int i;
	
	public StringList(int numElements){
		size = numElements;
		i = 0;
		datastore = (T[]) new Object[size];
	}
	public void add(T element){
		datastore[i] = element;
		++i;
	}
	public T get(int n)
	{
		return datastore[n];
	}
}