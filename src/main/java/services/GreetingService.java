package services;

import javax.inject.Inject;

import domain.Greeter;
import com.google.inject.Provider;

public class GreetingService {
	private Provider<Greeter> greeter;
	
	@Inject
	public GreetingService(Provider<Greeter> greeterProvider) {
		greeter = greeterProvider;
	}

	public void printGreeting() {
		greeter.get().printGreeting();
	}
	
	public String getGreeting() {
		return greeter.get().getGreeting();
	}
}
