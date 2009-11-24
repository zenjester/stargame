import java.util.*;

public class factor
{
	int factorValue;
	
			//generate a random number between 1 and 10
	
	Random generator = new Random();
	    int r = generator.nextInt(10);

	void setFactor(int inFactor)
	{
		factorValue = inFactor +r;
	}
	
	int getFactor()
	{
		return(factorValue);
	}
	
	void updateFactor(int upFactor)
	{
		factorValue+=upFactor;
	}
 }
