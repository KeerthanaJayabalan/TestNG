package testNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class ParameterizationExample {

	@Test
	@Parameters("Name")
	public void printname(String name) {
		System.out.println("Name is: "+name);
	}
}
