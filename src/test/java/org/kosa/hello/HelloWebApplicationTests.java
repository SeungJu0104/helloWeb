package org.kosa.hello;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class HelloWebApplicationTests {

//	@Test
//	void contextLoads() {
//	}
	
	private int add(int a, int b) {
		return a + b;
	}
	
	@Test
	void testAdd() {
		
		int a = 10, b = 20;
		int sum = add(a, b);
		
		assertEquals(30, sum); // 실 테스트 코드
		
	}
	

}
