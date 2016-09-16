package neat.model;

public class HowNeat 
{
	private String name;
	private double hairCount;
	private int eyeCount;
	private int armCount;
	private int noseCount;
	private boolean hasBellyButton;
	
	public HowNeat()
	{
		this.name = "no name";
		this.hairCount = -2345.23;
		this.eyeCount = -2345;
		this.armCount = -324;
		this.noseCount = -2355;
		this.hasBellyButton = false;
	}
	
	public HowNeat(String name, double hairCount, int eyeCount, int armCount, int noseCount, boolean hasBellyButton)
	{
		this.name = name;
		this.hairCount = hairCount;
		this.eyeCount = eyeCount;
		this.armCount = armCount;
		this.noseCount = noseCount;
		this.hasBellyButton = false;
	}
	
	public String toString()
	{
		String description = "Monster says: My name is " + name;
		
		return description;
	}
	
	public String getName()
	{
		return name;
	
	}
	
	public boolean getHasBellyButton()
	{
		return hasBellyButton;
	}
	
	public int getArmCount()
	{
		return armCount;
	}
	
	public int getNoseCount()
	{
		return noseCount;
	}
	
	public double getHairCount()
	{
		return hairCount;
	}
	
	public int getEyeCount()
	{
		return eyeCount;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setHasBellyButton(boolean hasBellyButton)
	{
		this.hasBellyButton = hasBellyButton;
	}
	
	public void setArmCount(int armCount)
	{
		this.armCount = armCount;
	}
	
	public void setNoseCount(int noseCount)
	{
		this.noseCount = noseCount;
	}
	
	public void setHairCount(double hairCount)
	{
		this.hairCount = hairCount;
	}
	
	public void setEyeCount(int eyeCount)
	{
		this.eyeCount = eyeCount;
	}
}


