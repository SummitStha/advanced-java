class Vehicle{
	int numSeats, numWheels;
	String model, engineType;
	double price;
	Vehicle(int ns, int nw, String m, String e, double p){
		numSeats = ns;
		numWheels = nw;
		model = m;
		engineType = e;
		price = p;
	}
}

interface VehicleInfo{
	void showDetails();
	double getTax();
}


class Car extends Vehicle implements VehicleInfo{
	Car(int ns, int nw, String m, String e, double p){
		super(ns, nw, m, e, p);
	}
	public void showDetails(){
		System.out.println("Number of Seats: " + numSeats);
		System.out.println("Number of Wheels: " + numWheels);
		System.out.println("Model: " + model);
		System.out.println("Engine Type: " + engineType);
		System.out.println("price: " + price);
	}
	public double getTax(){
		double tax = 15/100 * price;
		return tax;
	}
}


class Bike extends Vehicle implements VehicleInfo{
	Bike(int ns, int nw, String m, String e, double p){
		super(ns, nw, m, e, p);
	}
	public void showDetails(){
		System.out.println("Number of Seats: " + numSeats);
		System.out.println("Number of Wheels: " + numWheels);
		System.out.println("Model: " + model);
		System.out.println("Engine Type: " + engineType);
		System.out.println("price: " + price);
	}
	public double getTax(){
		double tax = (15/100) * price;
		return price;
	}
}

public class VehicleTax{
	public static void main(String[] args){
		Car c = new Car(8, 4, "Ferrari", "AGH-01", 10000000);
		System.out.println("Tax for car is: "+ c.getTax());
		c.showDetails();
		Bike b = new Bike(3, 2, "Honda", "BHD-WW02", 300000);
		System.out.println("Tax for bike is: " + b.getTax());
		b.showDetails();
	}
}