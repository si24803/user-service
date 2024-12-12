package org.psantos.demo.userservice;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest(classes = UserServiceApplication.class)
class UserServiceApplicationTests {

	@Test
	void contextLoads(ApplicationContext appCtx) {
		assertNotNull(appCtx);
	}

}
