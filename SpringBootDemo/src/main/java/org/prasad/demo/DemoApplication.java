package org.prasad.demo;

import org.prasad.demo.Model.Alien;
import org.prasad.demo.Model.Laptop;
import org.prasad.demo.service.LaptopService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(DemoApplication.class, args);

		LaptopService service = context.getBean(LaptopService.class);

		Laptop lap = context.getBean(Laptop.class);
		service.addLaptop(lap);

		//		Alien obj = context.getBean(Alien.class);
//		System.out.println(obj.getAge());
//		obj.code();

	}

}
