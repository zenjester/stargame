

import java.util.*;

public class factor
{
	int factorValue;
	String strFactor;
	
			//generate a random number between 1 and 10
	
	Random generator = new Random();
	    int r = generator.nextInt(10);

	void setFactor(int inFactor)
	{
		factorValue = inFactor +r;
	}
	
	String getFactor()
	{
		
    String strFactor = Integer.toString(factorValue);
		return(strFactor);
	}
	
	void updateFactor(int upFactor)
	{
		factorValue+=upFactor;
	}
 }
