import java.util.Properties;

import org.junit.Assert;
import org.junit.Test;

import com.google.inject.name.Names;
import domain.EnglishGreeter;
import domain.SpanishGreeter;
import modules.ApplicationPropertiesModule;
import modules.GreetingModule;
import services.GreetingService;
import com.google.inject.Guice;
import com.google.inject.Injector;

public class GreetingTest {
	@Test
	public void spanishGreeting() {
		ApplicationPropertiesModule spanishApplicationPropertiesModule = new ApplicationPropertiesModule() {
			@Override
			protected void configure() {
				Properties properties = new Properties();
				properties.setProperty("settings.language", "Spanish");
				Names.bindProperties(binder(), properties);
			}
		};
		Injector greetingModule = Guice.createInjector(new GreetingModule(), spanishApplicationPropertiesModule);
		GreetingService greetingService = greetingModule.getInstance(GreetingService.class);
		Assert.assertEquals(greetingService.getGreeting(), SpanishGreeter.GREETING);
	}

	@Test
	public void englishGreeting() {
		ApplicationPropertiesModule spanishApplicationPropertiesModule = new ApplicationPropertiesModule() {
			@Override
			protected void configure() {
				Properties properties = new Properties();
				properties.setProperty("settings.language", "English");
				Names.bindProperties(binder(), properties);
			}
		};
		Injector greetingModule = Guice.createInjector(new GreetingModule(), spanishApplicationPropertiesModule);
		GreetingService greetingService = greetingModule.getInstance(GreetingService.class);
		Assert.assertEquals(greetingService.getGreeting(), EnglishGreeter.GREETING);
	}
	
}
