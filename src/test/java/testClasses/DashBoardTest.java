package testClasses;

import org.testng.annotations.Test;

import extentlisteners.Listeners;

public class DashBoardTest extends Listeners{
	
	
	@Test(priority = 3)
	public void selectShare()
	{
		test.info("search shares");
		db.searchShare();
	}
	
	@Test(priority = 4)
	public void buyShares()
	{
		db.buyShare();
	}

}
