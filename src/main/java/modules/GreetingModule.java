package modules;

import domain.Greeter;
import providers.GreeterProvider;
import com.google.inject.AbstractModule;

public class GreetingModule extends AbstractModule {
	protected void configure() {
		bind(Greeter.class).toProvider(GreeterProvider.class);
	}
}
