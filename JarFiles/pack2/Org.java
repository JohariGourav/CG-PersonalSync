//class Org inside pack2 package for jar File creation used for TestOrg.java at other location
package pack2;

public class Org {

	private int regNo;
	private int revenue;
	private String orgName;

	// arg ctor...
	public Org(int regNo, String orgName, int revenue) {

		this.regNo = regNo;
		this.orgName = orgName;
		this.revenue = revenue;
	}

	// method to display contents
	public void disp() {
		System.out.println("regNo: " + regNo + ", orgName: " + orgName + ", revenue: " + revenue);
	}
}
