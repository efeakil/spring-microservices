package com.codersnitch.ps;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.testcontainers.containers.MySQLContainer;
import org.testcontainers.junit.jupiter.Testcontainers;

@SpringBootTest
@Testcontainers
class ProductServiceApplicationTests {

	@SuppressWarnings({ "rawtypes", "unused" })
	private static MySQLContainer mysql = (MySQLContainer) new MySQLContainer("mysql:8.0")
            .withUsername("root")
            .withPassword("Efe12345")
            .withDatabaseName("ps");
	@Test
	void contextLoads() {
	}

}
