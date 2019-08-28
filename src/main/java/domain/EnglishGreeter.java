package domain;

public class EnglishGreeter implements Greeter {
	public static final String GREETING = "Hello!";

	public void printGreeting() {
		System.out.println(GREETING);
	}

	public String getGreeting() {
		return GREETING;
	}
}
