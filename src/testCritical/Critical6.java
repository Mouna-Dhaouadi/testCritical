package testCritical;

public class Critical6 {

	
	private String name;
	private String teleNo_secret; 
	
	public void setDeatils(String nom, String _tel)
	{
		this.name = nom;
		this.teleNo_secret = _tel;
	}
	
	public String[] getDeatils()
	{
		String[] details = new String[2];
		details[0] = this.name;
		details[1] = this.teleNo_secret;
		
		return new Critical5().getDeatils();
	}
}
