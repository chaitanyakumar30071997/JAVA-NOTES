package Final_Access;

public class there_final_Variable {
	final int MAX_VALUE = 100;

    void display() {
       // MAX_VALUE = 200; // Error: cannot assign a value to final variable
        System.out.println("MAX_VALUE: " + MAX_VALUE);
    }

    public static void main(String[] args) {
    	there_final_Variable obj = new there_final_Variable();
        obj.display();
    }

}
