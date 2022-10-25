package testNG;

import org.testng.annotations.Test;

public class GroupingExample {
@Test(groups= {"Apple"})
	public void apple1() {
		System.out.println("I am Apple family");
	}
@Test(groups= {"Apple"})
	public void apple2() {
		System.out.println("I am Apple family");
	}
@Test(groups= {"Vivo"})
	public void vivo1() {
		System.out.println("I am Vivo family");
	}
@Test(groups= {"Vivo"})
	public void vivo2() {
		System.out.println("I am Vivo family");
	}
@Test(groups= {"Moto"})
	public void moto1() {
		System.out.println("I am Moto family");
	}
@Test(groups= {"Moto"})
	public void moto2() {
		System.out.println("I am Moto family");
	}
@Test(groups= {"Sony"})
	public void sony1() {
		System.out.println("I am Sony family");
	}
@Test(groups= {"Sony"})
	public void sony2() {
		System.out.println("I am Sony family");
	}
	
}
