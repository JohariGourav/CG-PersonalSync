//TestClass FunctionOverriding using Classes 'Parent' & 'Child' from SingleLevel.java
public class FunctionOverriding {
	// main method
	public static void main(String[] args) {
		
		Child child = new Child(10, 20);
		Parent boy = new Child(20, 10);
		
		child.disp();
		boy.disp();
	}

}


