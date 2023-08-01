package omsore.demo;

import org.springframework.stereotype.Component;

@Component
public class Kachori implements Food {
	public void eat() {
		System.out.println("I am eating Kachori");
	}

}
