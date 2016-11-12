package com.klogle.domain;

/**
 * boss Bean
 * @author klogle
 *package:com.klogle.domain
 *E-mail:klogle.one@qq.com
 */
public class boss {

	//private String name;
	private office office;
	private Car car;

	public boss() {
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	public office getOffice() {
		return office;
	}

	public void setOffice(office office) {
		this.office = office;
	}

	@Override
	public String toString() {
		return "this boss has " + car.toString() + "and in " + office.toString();
	}
}
