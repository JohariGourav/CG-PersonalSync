import java.util.*;
public class DateDiff {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		Date d1 = new Date(12,3,1956);
		Date d2 = new Date();
		
		 int day, month, year;
		 int [] dateGap = new int[3];
		
		System.out.println("Enter 2nd date(dd-mm-yy) for difference");
		day = scanner.nextInt();
		month= scanner.nextInt();
		year = scanner.nextInt();
		
		d2.setDay(day);
		d2.setMonth(month);
		d2.setYear(year);
		System.out.println(d1+" "+d2);
		dateGap = d1.diff(d1,d2);
		d1.toString();
		d2.toString();
		System.out.println("Difference b/w dates is ");
		
			System.out.print(dateGap[0]+" days "+dateGap[1]+" months "+dateGap[2]+" years");
		
	}

}
