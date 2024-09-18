package Final_Access;

public class second_final_method {

	 final void display() {
	        System.out.println("This is a final method.");
	    }
	}

	class ChildClass extends second_final_method {
	    // Attempting to override a final method will result in a compile-time error
	    // void display() { // Error
	    //     System.out.println("Trying to override.");
	    // }
}
