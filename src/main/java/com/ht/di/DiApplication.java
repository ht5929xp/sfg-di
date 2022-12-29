package com.ht.di;

import com.ht.di.controllers.AnimalMovementController;
import com.ht.di.controllers.MathOperationController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DiApplication.class, args);

		AnimalMovementController animalController = (AnimalMovementController)ctx.getBean("animalMovementController");

		animalController.run();
		animalController.run();
		animalController.run();
	}

}
