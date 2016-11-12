package com.klogle.test;

import java.util.Map;

import org.junit.Test;

import com.klogle.config.Bean;
import com.klogle.config.parse.ConfigManager;
import com.klogle.domain.Car;
import com.klogle.domain.office;
import com.klogle.domain.boss;
import com.klogle.main.ApplicationContext;
import com.klogle.main.ClassPathXmlApplicationContext;

/**
 * 单元测试
 * @author klogle
 *package:com.klogle.test
 *E-mail:klogle.one@qq.com
 */
public class SpringIOCTest {

	@Test
	public void demo4(){
		ApplicationContext context = new ClassPathXmlApplicationContext("/Bean.xml");
		//office office=(office) context.getBean("office");
		//Car car=(Car) context.getBean("carBean");
		//car.toString();
		//office.toString();
		boss boss = (boss) context.getBean("boss");
		//boss.toString();
		System.out.println("this boss has the car is " + boss.getCar().getCarColor() +
		                   " with " + boss.getCar().getCarId() + " and in office " + 
				           boss.getOffice().getOfficeNo());
	}
}
