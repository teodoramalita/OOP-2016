package models.animlas;

public abstract class Bird extends Animal {
	protected boolean migrates;
	protected float altitude;
	public Bird(boolean migrates,float altitude ,String scientificName, String name, int age){
		super(scientificName,name,age);
		this.migrates = migrates;
		this.altitude = altitude;
	}

	public boolean getIfMigrates()
	{
		return migrates;
	}
	public void setIfMigrates(boolean migrates)
	{
		this.migrates=migrates;
	}
	public float getAltitude()
	{
		return altitude;
	}
	public void setAltitude(float altitude)
	{
		this.altitude=altitude;
	}

}
