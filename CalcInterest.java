//Simple interest and compound interest 
import java.util.Scanner;
public class CalcInterest{
  
  public static void main(String []args) {
    Scanner sc=new Scanner(System.in);
	System.out.println("Enter Principal Amount");
	double princ=sc.nextInt();
	double si= simpleInterest(princ);
	double ci=compoundInterest(princ);
	System.out.println("Simple Interest (@rate=10%,time=10yrs) is "+si);
	System.out.println("Compound Interest(annually@rate=10%,time=10yrs) is "+ci);

	}
    static  double simpleInterest(double princ) {
		  int rate=10,time=10;
		  double si=0;
		  si=(princ*rate*time)/100;
		  return si;
	}	
	static  double	compoundInterest(double princ) {
		  int rate=10,time=10;
		  double ci=0,interest;
		  
		  for(int i=0;i<time;i++){
			  
			  interest=(princ*rate)/100;
			  ci+=interest;
			  princ+=interest;
			  
		  }
		  
		  return ci;
	}	  
}