package cumuluzeee;

import javax.enterprise.context.RequestScoped;

@RequestScoped

public class Greeter {

	public String sayHello() {

		return "hello from CDI";

	}

}
