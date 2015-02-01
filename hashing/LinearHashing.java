package hashing;

public class LinearHashing<Key, Value> {
	
	private int N;
	private int M=17;
	private Key keys[];
	private Value value[];
	
	public LinearHashing(){
		keys = (Key[])new Object[M];
		value = (Value[])new Object[M];
	}
	
	public LinearHashing(int cap){
		this.M=cap;
		keys = (Key[])new Object[M];
		value = (Value[])new Object[M];
	}
	
	private int hash(Key key){
		return (key.hashCode() & 0x7fffffff)% M;
	}
	
	public void put(Key key, Value value){
		if(N>=M/2) resize(2*M);
		int i;
		for(i = hash(key);keys[i]!=null;i=(i+1)%M){
			if(keys[i]==key) this.value[i] = value; return;
		}
		this.value[i]=value;
		keys[i]=key;
		N++;
	}
	
	public Value get(Key key){
		for ( int i=hash(key);keys[i]!=null;i=(i+1)%M){
			if(keys[i]==key) return value[i];
			
		}
		return null;
	}
	
	public void delete(Key key){
		
		int h = hash(key);
		while(!keys[h].equals(key))
			h=(h+1)%M;
		keys[h]=null;
		value[h]=null;
		h=(h+1)%M;
		while(keys[h]!=null){
		Key keyRedo = keys[h];
		Value valueRedo = value[h];
		keys[h]=null;
		value[h]=null;
		N--;
		put(keyRedo, valueRedo);
		h=(h+1)%M;
		}
		N--;
	}
	// Balancing the load factor again so as to keep it between 1/8 and 1/2 by doubling the value of M
	private void resize(int cap){
		LinearHashing<Key, Value> temp;
		temp = new LinearHashing<Key,Value>(cap);
		for( int i=0;i<M;i++){
			if(keys[i]!=null)
				temp.put(keys[i], value[i]);			
		}
		this.keys = temp.keys;
		this.value = temp.value;
		M =temp.M;
	}

	
}
