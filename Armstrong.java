import java.util.Scanner;
public class Armstrong{
  
  public static void main(String []args) {
    Scanner sc=new Scanner(System.in);
	System.out.println("Enter no. to check for armstrong");
	int num=sc.nextInt();
	armstrong(num);
	
	
	
	}
    static  void armstrong(int num) {
		  int temp=num,dig=0,cub=0;
		   for(int i=0;i<100;i++) {
			   
			   dig=temp%10;
			   cub+=(dig*dig*dig);
			   temp=temp/10;
			   //System.out.println(temp);
			   if(temp==0)
				   break;
		   }
		   if(cub==num)
			    System.out.println("its an armstrong no.");
			else
			 System.out.println("its not an armstrong no.");
}
}