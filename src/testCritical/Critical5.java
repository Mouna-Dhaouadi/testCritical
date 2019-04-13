package testCritical;

public class Critical5 {

	
	private String name;
	private String areaCode_secret; 
	private String officeNo_secret;
	
	public void setDeatils(String nom, String _area, String _office)
	{
		this.name = nom;
		this.areaCode_secret = _area;
		this.officeNo_secret = _office;
	}
	
	public String[] getDeatils()
	{
		String[] details = new String[3];
		details[0] = this.name;
		details[1] = this.areaCode_secret;
		details[2] = this.officeNo_secret;
		return details;
	}
}
