package Encapsulation;

public class Encapsulation1 {

	private int ssn;
	private String empname;
	private int empage;

	public void setSsn(int ssn)
	{
	this.ssn = ssn;
	}

	public void setEmpname(String empname)
	{
	this.empname = empname;
	}

	public void setEmpage(int empage)
	{
	this.empage= empage;
	}
	
	public int getSsn()
	{
	return ssn;
	}

	public String getEmpname()
	{
	return empname;
	}

	public int getEmpage()
	{
	return empage;
	}

	
	public static void main(String[] args)
	{
	Encapsulation1 en = new Encapsulation1();
	en.setSsn(22);
	en.setEmpname("Mahesh");
	en.setEmpage(30);

	System.out.println("Employee ssn no is :" +en.getSsn());
	System.out.println("Employee name is :" +en.getEmpname());
	System.out.println("Employee age is :" +en.getEmpage());
    }

}
