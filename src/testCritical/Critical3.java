package testCritical;

public class Critical3 {

	
	private String name;
	private String areaCode_secret; 
	private String officeNo_secret;
	
	public void setDeatils(String nom, Integer _area, Integer _office)
	{
		this.setName(nom);
		this.setArea(_area);
		this.setOffice(_office);
	}
	
	public String[] getDeatils()
	{
		String[] details = new String[3];
		details[0] = this.getName();
		details[1] = this.getArea();
		details[2] = this.getOffice();
		return details;
	}
	
	private void setName(String nom) {
		this.name=nom;
	}
	
	private String getName() {
		return this.name;
	}
	
	private void setOffice(Integer _office)
	{this.officeNo_secret=parseIntToString(_office);}
	
	private String getOffice()
	{
		return this.officeNo_secret;
	}
	
	private void setArea(Integer _area)
	{
		this.areaCode_secret=parseIntToString(_area);
	}
	
	private String getArea()
	{
		return this.areaCode_secret;
	}
	
	private String parseIntToString(Integer n)
	{
		return String.valueOf(n);
	}
}
