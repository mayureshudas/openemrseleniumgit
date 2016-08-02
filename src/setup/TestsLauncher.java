package setup;

import org.testng.TestListenerAdapter;
import org.testng.TestNG;

import tests.Test1;




public class TestsLauncher {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String url=args[0];
		String browser=args[1];
		TestListenerAdapter tla = new TestListenerAdapter();
		TestNG testng = new TestNG();
		testng.setTestClasses(new Class[] { Test1.class });
		testng.addListener(tla);
		LaunchBrowser.launchBrowser(url,browser);
		testng.run();
	}

}
