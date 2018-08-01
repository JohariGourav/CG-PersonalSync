//PublicTraining extending Training
public class PublicTraining extends Training {

	private int participants;

	// method to calculate Training Charge
	public double getOrderValue() {

		return fees * participants;
	}

	// Arg Ctor
	public PublicTraining(String subject, double fees, int NumParticipants) {
		super();
		this.subject = subject;
		this.fees = fees;
		this.participants = NumParticipants;

	}
}
