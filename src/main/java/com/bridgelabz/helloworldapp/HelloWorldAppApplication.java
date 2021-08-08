/**
 * UC1 : Create a Helloworld Spring App to display “Hello from BridgeLabz” using STS
 * 
 * @author DAXIL SAXENA
 * @since 08.08.2021
 */
package com.bridgelabz.helloworldapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloWorldAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloWorldAppApplication.class, args);

		// Prints Hello from Bridgelabz on standard output.
		System.out.println("Hello from Bridgelabz");
	}

}
