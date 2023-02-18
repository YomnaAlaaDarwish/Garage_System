package Configuration;

public class FactoreyConfig {
	
	public Configuration create(int configType)
	{
		
		if(configType==1)//break open close while creation
		{
		  return   new FirstConfiguration();
			
		}
		else if(configType==2)
		{
			return new SecondConfiguration();
			
			 
		}
		return null;
	}

}
