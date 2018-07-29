//Test class to get cost of Corporate and Public Training
public class TestTraining {
	// main method
	public static void main(String[] args) {

		Training training = new PublicTraining("Java", 5000, 50);
		double cost = training.getOrderValue();
		System.out.println("Cost of Public Training: " + cost);

		training = new CorporateTraining("Big Data", 35000, 4);
		cost = training.getOrderValue();
		System.out.println("Cost of Corporate Training: " + cost);
	}

}
