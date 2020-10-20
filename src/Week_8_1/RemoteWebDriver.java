package Week_8_1;

public abstract class RemoteWebDriver {

	public abstract void get(String URL);

	public abstract void quit();
}

class FirefoxDriver extends RemoteWebDriver {

	@Override
	public void get(String URL) {
		System.out.println("Opening " + URL + " in firefox browser");

	}

	@Override
	public void quit() {
		System.out.println("Closeing  firebox browser");

	}

}

class ChromeDriver extends RemoteWebDriver {

	@Override
	public void get(String URL) {
		System.out.println("Opening " + URL + " in chrome browser");

	}

	@Override
	public void quit() {
		System.out.println("Closeing  chrome browser");

	}

}

class OperaDriver extends RemoteWebDriver {

	@Override
	public void get(String URL) {
		System.out.println("Opening " + URL + " in opera browser");

	}

	@Override
	public void quit() {
		System.out.println("Closeing  opera browser");

	}

}
