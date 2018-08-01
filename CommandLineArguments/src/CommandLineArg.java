
public class CommandLineArg {

	public static void main(String[] args) {

		int i,total=0;
		for(i=0; i<args.length; i++) {
			total += Integer.parseInt(args[i]);
		}
		
		System.out.println(total);
	}

}
