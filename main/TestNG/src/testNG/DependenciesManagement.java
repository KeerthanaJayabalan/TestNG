package testNG;

import org.testng.annotations.Test;

public class DependenciesManagement {

			// Problem 1: You have to admit student to higher secondary
		// Problem 2: You have to admit a student to engg
@Test	
public void highSchool() {
	System.out.println("High school");
}
@Test		(dependsOnMethods = "highSchool")
public void higherSecondarySchool() {
	System.out.println("Higher Secondary school");
}
@Test	(dependsOnMethods="higherSecondarySchool")	
public void enggCollege() {
	System.out.println("Engineering");
}		
	

}
