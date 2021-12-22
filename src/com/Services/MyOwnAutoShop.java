package com.services;

import com.entities.Car;
import com.entities.Ford;
import com.entities.Sedan;
import com.entities.Truck;

public class MyOwnAutoShop {

	public static void main(String[] args) {

		Sedan sedan = new Sedan(50, 1000, "red", 25);
		System.out.println(" Sedan Price: " + sedan.getSalePrice());

		Ford fordRed = new Ford(50, 1000, "white", 1975, 20);
		System.out.println(" Ford Price: " + fordRed.getSalePrice());

		Ford fordGold = new Ford(50, 1000, "gold", 1968, 3);
		System.out.println(" Ford Price: " + fordGold.getSalePrice());
		
		Truck truck = new Truck(50, 1000, "red", 3000);
		System.out.println(" Truck Price: " + truck.getSalePrice());

		Car car = new Car(50, 1000, "black");
		System.out.println(" Car Price: " + car.getSalePrice());
	}
}