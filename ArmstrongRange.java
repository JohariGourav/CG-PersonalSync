import java.util.Scanner;
public class ArmstrongRange{
  
  public static void main(String []args) {
    
	armstrongRange();
	
	
	
	}
    static  void armstrongRange() {
		  int temp,dig=0,cub=0;
		  for(int j=100;j<1000;j++) {
			  temp=j;dig=0;cub=0;
		   for(int i=0;i<100;i++) {
			   
			   dig=temp%10;
			   cub+=(dig*dig*dig);
			   temp=temp/10;
			   
			   if(temp==0)
				   break;
		   }
		   if(cub==j)
			    System.out.println(j);
			
		  }
		}
}