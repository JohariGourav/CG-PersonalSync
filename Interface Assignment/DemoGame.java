//class Demo with main & perform methods
public class DemoGame {

	// method to call play method of different Game Objects
	public void perform(Game game) {
		game.play();
	}

	// main method
	public static void main(String[] args) {

		DemoGame demo = new DemoGame();

		Game cricket = new Cricket();
		demo.perform(cricket);

		Game tennis = new Tennis();
		demo.perform(tennis);

		Game football = new Football();
		demo.perform(football);
	}

}
