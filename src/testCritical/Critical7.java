package testCritical;

public class Critical7 {

	
	private String name;
	private String teleNo_secret; 
	
	public String getName() {
	return this.name;
	}
	
	public void  setName(String nom) {
		this.name = nom;
		}
	
	public void setTelephone(String _tel)
	{
	
		this.teleNo_secret = _tel;
	}
	
	public String getTelephone()
	{
		return this.teleNo_secret;
		
	}
}
