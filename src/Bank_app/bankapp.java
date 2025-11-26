package Bank_app;

public class bankapp {

	public static void main(String[] args) {
	
		
		HDFC u=new HDFC();
		 u.Name();

	}

}
class SBI
{
	private String Name;
	String Contact_No;
	String Addres;
	
	public SBI()
	{
		System.out.println("Bank Of HDFC.!");
	}
	public void Name()
	{
		System.out.println(Name);
	}
}
class HDFC extends SBI
{
	
	
}