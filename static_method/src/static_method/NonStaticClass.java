package static_method;

//non static --> create obj --> call that method

public class NonStaticClass {
	
	
	void add() {
		System.out.println("Non static Method ");
	}
	public static void main(String[] args) {
		
		NonStaticClass  obj = new NonStaticClass ();
		obj.add();
		
	}
	
	
  
}
