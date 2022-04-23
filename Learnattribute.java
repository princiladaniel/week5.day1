package week5.day1;

import org.testng.annotations.Test;

public class Learnattribute {
@Test(priority=1)
	public void createLead() {
	System.out.println("Create");
}
@Test(priority=2,invocationCount=3)
public void editLead() {
	System.out.println("Edit");
}
@Test(enabled=false)
public void duplicateLead() {
	System.out.println("Delete");

	}

}
