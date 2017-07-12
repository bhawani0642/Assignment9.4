/*
 * Created a class named as FixedStack it implements the interface Stack
 */
public class FixedStack implements Stack {
	 final int arr[];
	 final int size;
	 int top;
	 
	public  FixedStack (int size){
		 this.size=size;
		 arr=new int[size];
		 top = -1;
	 }

	/**
	 * These are the two methods from the interface Stack
	 */
	
	
	@Override
	public void push(int i) {
		// TODO Auto-generated method stub
		  if (top == size - 1) {
	            System.out.println("Stack overflow while pushing " + i + " in fixed stack");
	            //throw new UnsupportedOperationException();
	            return;
	        }
	        arr[++top] = i;
	    }	
	

	@Override
	public int pop() {
		// TODO Auto-generated method stub
		if (top < 0) {
            System.out.println("Stack underflow");
            //throw new UnsupportedOperationException();
            return -999;
        }
        return arr[top --];
    }
		
	}


