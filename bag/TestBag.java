package bag;

public class TestBag {

	public static void main(String args[]){
		Bag<Integer> bag =  new Bag<Integer>();
		for(int i=0;i<10;i++){
			bag.add(i);
		}
		
		for(int a:bag){
			System.out.print(a+" ");
		}
			
	}
}
