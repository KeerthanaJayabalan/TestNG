package testNG;

import org.testng.annotations.Test;

public class DriveCar {
	@Test(priority=0)
public void startTheCar() {
	System.out.println("Start the car");
}@Test(priority=1)
public void firstGear() {
	System.out.println("First gear");
}@Test(priority=2)
public void secondGear() {
	System.out.println("Second gear");
}@Test(priority=3)
public void thirdGear() {
	System.out.println("Third gear");
}@Test(priority=4)
public void fourthGear() {
	System.out.println("Fourth gear");
}
}

