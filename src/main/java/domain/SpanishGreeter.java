package domain;

public class SpanishGreeter implements Greeter {
	public static final String GREETING = "Hola!";
	
	public void printGreeting() {
		System.out.println(GREETING);
	}

	public String getGreeting() {
		return GREETING;
	}
}
