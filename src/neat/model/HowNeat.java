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
}
