package sample.helloworld.test;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import sample.helloworld.controller.HelloWorldController;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringBootHelloWorldTests.class)
@ContextConfiguration(classes = HelloWorldController.class)
public class SpringBootHelloWorldTests {

	@Autowired
	private HelloWorldController helloWorld;

	@Test
	public void TestSayHello() {

		String response = helloWorld.sayHello();
		Assert.assertEquals("Hi Welcome to Spring Boot!!!", response);
	}

}