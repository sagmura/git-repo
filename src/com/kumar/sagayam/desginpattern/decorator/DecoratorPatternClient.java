package com.kumar.sagayam.desginpattern.decorator;


interface Car{
	void assembel();
}

class BasicCar implements Car{
	@Override
	public void assembel() {
		System.out.println("Basic Car Model");
	}
}


/*** Important Class in the Decorato Patttern**/
class CarDecorator implements Car{
	protected Car car;
	
	public CarDecorator(Car car) {
		this.car = car;
	}
	
	@Override
	public void assembel() {
		this.car.assembel();
		
	}
}

class ElectronicCar extends CarDecorator{

	public ElectronicCar(Car car) {
		super(car);
	}
	
	@Override
	public void assembel() {
		super.assembel();
		System.out.println("Calling Electronic Car for Test Drive");
	}
}

class PetrolCar extends CarDecorator{
  	public PetrolCar(Car car) {
		super(car);
	}
  	
  	@Override
  	public void assembel() {
  		super.assembel();
  		System.out.println("Calling Petrol Car for Test Drive");
  	}
}


class  DieselCar extends CarDecorator{
	public DieselCar(Car car) {
		super(car);
	}
	
	@Override
	public void assembel() {
		super.assembel();
		System.out.println("Calling Deisel Car for Test Drive");
	}
}



public class DecoratorPatternClient {

	public static void main(String[] args) {

		Car eleCar = new ElectronicCar(new BasicCar());
		eleCar.assembel();
		
		Car petCar = new PetrolCar(new BasicCar());
		petCar.assembel();
		
		Car dieCar = new DieselCar(new BasicCar());
		dieCar.assembel();
		
		Car petrolElectricCar = new ElectronicCar(new PetrolCar(new BasicCar()));
		petrolElectricCar.assembel();
	}

}
