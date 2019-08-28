package providers;

import javax.inject.Named;

import com.google.inject.Inject;
import domain.EnglishGreeter;
import domain.Greeter;
import domain.SpanishGreeter;
import com.google.inject.Provider;

public class GreeterProvider implements Provider<Greeter> {
	@Inject
	@Named("settings.language")
	private String language;
	
	public Greeter get() {
		if (language.equals("Spanish"))
			return new SpanishGreeter();
		
		return new EnglishGreeter();
	}
}
