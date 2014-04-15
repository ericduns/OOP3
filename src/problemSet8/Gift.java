package problemSet8;

public class Gift {

	private String name;
	private String description;
	private double price;

	public Gift()
	{
		name = "No Name";
		description = "No Description";
		price = 0.0;
	}
	public Gift(String description,String name,double price)
	{
		this.name = name;
		this.description = description;
		this.price = price;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public void setDescription(String description)
	{
		this.description = description;
	}
	public void setPrice(double price)
	{
		this.price = price;
	}
	public String getName()
	{
		return name;
	}
	public String getDescription()
	{
		return description;
	}
	public double getPrice()
	{
		return price;
	}

	public String toString()
	{
		return  description + " is getting " +  name 
				+ " worth " + "€"+price;
	}
}