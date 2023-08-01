package omsore.demo;

import org.springframework.stereotype.Component;

@Component
public class Samosa implements Food {
	public void eat() {
System.out.println("Hi Iam Eating Samosa");
	}
}
