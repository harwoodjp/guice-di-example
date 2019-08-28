import modules.ApplicationPropertiesModule;
import modules.GreetingModule;
import services.GreetingService;
import com.google.inject.Guice;
import com.google.inject.Injector;

public class Main {
	public static void main(String args[]) {
		Injector greetingModule = Guice.createInjector(new ApplicationPropertiesModule(), new GreetingModule());
		GreetingService greetingService = greetingModule.getInstance(GreetingService.class);
		greetingService.printGreeting();
	}
}
