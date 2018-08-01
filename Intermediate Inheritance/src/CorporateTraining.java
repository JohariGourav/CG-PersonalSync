//Corporate Training extending Training
public class CorporateTraining extends Training {

	private double days;

	// method to calculate Training Charge
	public double getOrderValue() {

		return fees * days;
	}

	// Arg Ctor
	public CorporateTraining(String subject, double fees, int NumDays) {
		super();
		this.subject = subject;
		this.fees = fees;
		this.days = NumDays;

	}
}
