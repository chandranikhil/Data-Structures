package queues;

public interface Queue {

	public void enQ(Object data);
	public Object dQ();
	public boolean isEmpty();
	
}
