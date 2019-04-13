package testCritical;

public class Critical4 {

	
	private String name;
	private String areaCode_secret; 
	private String officeNo_secret;
	
	public void setTelephone(Integer _area, Integer _office)
	{
		this.setArea(parseIntToString(_area));
		this.setOffice(parseIntToString(_office));
	}
	
	public String getTelephone()
	{
		return this.getArea() + this.getOffice();
	}
	
	public void setName(String nom) {
		this.name=nom;
	}
	
	public String getName() {
		return this.name;
	}
	
	private void setOffice(String _office)
	{this.officeNo_secret=_office;}
	
	private String getOffice()
	{
		return this.officeNo_secret;
	}
	
	private void setArea(String _area)
	{
		new Critical2().setArea(_area);
	}
	
	private String getArea()
	{
		return new Critical2().getArea();
	}
	
	private String parseIntToString(Integer n)
	{
		return String.valueOf(n);
	}
}
