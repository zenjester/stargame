public class testStargame
{
	public static void main(String[] args)
	{
		
	//create objects
	factor social 	= new factor();
	factor science 	= new factor();
	factor economy 	= new factor();
	factor military	= new factor();
	
	//set initial values
	
	social.setFactor(10);
	science.setFactor(15);
	
	
	//get initial values
	
	System.out.println("The current social value is " + social.getFactor());
	System.out.println("The current science value is " + science.getFactor());
}
}
	
	
	
	
	
