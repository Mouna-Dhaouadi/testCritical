package testCritical;
import testCritical.Critical2;

public class Critical1 {
	
	public String areaCode_secret; 
	public String officeNo_secret;
	public String name;
	
	
	public void setName(String nom) {
		this.name=nom;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setOffice(String _office)
	{new Critical2().setOffice(_office);}
	
	public String getOffice()
	{
		return this.officeNo_secret;
	}
	
	public void setArea(String _area)
	{this.areaCode_secret=_area;}
	
	public String getArea()
	{
		return this.areaCode_secret;
	}
	
	public void setTelephone(String _office, String _area)
	{
		this.setArea(_area);
		this.setOffice(_office);
	}
	

	public String getTelephone() {
		return this.areaCode_secret + this.officeNo_secret;
	}

}
