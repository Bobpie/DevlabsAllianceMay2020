package week3.day2;

public class MyHouse {
public static void main(String[] args) {
	BuildHouse myHouse = new BuildHouse();
	myHouse.buildBedroom();
	myHouse.buildHall();
	myHouse.buildKitchen();
	
	// Scope Restriction
	HousePlan myHouse1 = new BuildHouse();
	// HousePlan myH = new HousePlan(); -> Not Possible
	myHouse1.buildBedroom();
	myHouse1.buildHall();
	// myHouse1.buildKitchen();
}
}
