import org.testng.annotations.Test;

public class SkipATestCase {
			@Test(priority=0)
	public void startTheCar() {
		System.out.println("Start the car");
	}
		@Test(priority=5, enabled=false)
		public void turnMusicOn() {
			System.out.println("Music is turned on");
		}
		@Test(priority=1)
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
