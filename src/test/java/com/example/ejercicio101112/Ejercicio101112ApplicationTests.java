package com.example.ejercicio101112;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Ejercicio101112ApplicationTests {

	@Test
	void contextLoads() {

		System.getenv().forEach((key,value)-> System.out.println(key+""+value));
	}

}
