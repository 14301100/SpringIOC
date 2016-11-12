package com.klogle.domain;

/**
 * carBean
 * @author klogle
 *package:com.klogle.domain
 *E-mail:klogle.one@qq.com
 */
public class Car {

	private String carColor = "red";
	private String carId = "001";

	public Car() {
	}

	public void setCarId(String carId) {
		this.carId = carId;
	}
	
	public String getCarId() {
		return carId;
	}
	
	public String getCarColor() {
		return carColor;
	}
	
	public void setCarColor(String carColor) {
		this.carColor = carColor;
	}
	
	@Override
	public String toString() {
		return " the car is " + carColor + " with " + carId;
	}
}
