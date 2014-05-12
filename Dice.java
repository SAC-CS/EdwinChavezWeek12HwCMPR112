package hw13;

public class Dice 
{
	int value;
	int mybounces;
	
	public Dice(int bounces)
	{
		value = -1;
		mybounces = bounces;
	}
	public void mybounces()
	{
		int avg=0;
		for(int i = mybounces; i>0;i--)
			avg+= (1+(int)(Math.random()*6));
			avg/= mybounces;
			value=avg;
			
	}
	
	public int trippledice()
	{
		int D1=value;
		int D2=value;
		int D3=value;
		return(D1+D2+D3);
	}
}
