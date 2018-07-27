import java.util.Scanner;
public class Square{
  
  public static void main(String []arge) {
    Scanner sc=new Scanner(System.in);
	System.out.println("Enter no. for squaring");
	int rollno=sc.nextInt();
	int sqr=square(rollno);
	System.out.println(sqr);
	
	
	}
    static  int square(int rollno) {
		  int sq= rollno*rollno;
			return sq;
}
}