package pack2;

public class Org {
	
	private int regNo;
	private int revenue;
	private String orgName;
	
	public Org ( int regNo, String orgName, int revenue) {
		
		this.regNo = regNo;
		this.orgName = orgName;
		this.revenue = revenue;
	}

	
	public void disp() {
		System.out.println("regNo: " + regNo + ", orgName: " + orgName+ ", revenue: " + revenue ); 
	}
}
