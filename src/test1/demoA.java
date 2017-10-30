package test1;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class demoA {
	@Test
	public void testA() {
		Reporter.log("The is what A is running");
	}
@Test
public void testB()
{
	Reporter.log("TestB is running");
}


}
