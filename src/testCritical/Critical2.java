package testCritical;

public class Critical2 {

	private String areaCode_secret; 
	private String officeNo_secret;
	private String name;
	
	
	public void Critical2(String _name, String _area, String _office)
	{
		this.setName(_name);
		this.setArea(_area);
		this.setOffice(_office);
	}
	
	public String[] getDeatils()
	{
		String[] details = new String[3];
		details[0] = this.getName();
		details[1] = this.getArea();
		details[2] = this.getOffice();
		return new Critical5().getDeatils();
	}
	
	private void setName(String nom) {
		this.name=nom;
	}
	
	private String getName() {
		return this.name;
	}
	
	public  void setOffice(String _office)
	{this.officeNo_secret=_office;}
	
	private String getOffice()
	{
		return this.officeNo_secret;
	}
	
	public  void setArea(String _area)
	{
		this.areaCode_secret=_area;
	}
	
	public String getArea()
	{
		return this.areaCode_secret;
	}
	
}
