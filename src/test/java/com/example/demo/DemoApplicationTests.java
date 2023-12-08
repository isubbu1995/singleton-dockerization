package com.example.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

	@Test
	void testMainMethod(){
		DemoApplication demoApplication = new DemoApplication();
		String test = demoApplication.test();
		Assertions.assertEquals("hello there",test);
	}

	@Test
	void contextLoads() {
		Assertions.assertTrue(true);
	}

}
