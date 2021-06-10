package week3.day1;

public class Parent extends GrandParent{

	public void apartment() {
		System.out.println("Parent's Apartment");
	}
	public void car() {
		super.car();
		System.out.println("BMW 350 d");
	}
}
