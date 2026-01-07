import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.AppiumBy;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import java.net.URL;
import java.net.URI;
import java.net.MalformedURLException;
import java.net.URISyntaxException;

public class Activity7 {

	AndroidDriver driver;
	WebDriverWait wait;

	@BeforeClass
	public void setUp() throws MalformedURLException, URISyntaxException {
		UiAutomator2Options options = new UiAutomator2Options();
		options.setPlatformName("android");
		options.setAutomationName("UiAutomator2");
		options.setAppPackage("com.android.chrome");
		options.setAppActivity("com.google.android.apps.chrome.Main");
		options.noReset();

		URL serverURL = new URI("http://localhost:4723").toURL();

		driver = new AndroidDriver(serverURL, options);
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		driver.get("https://training-support.net/webelements/lazy-loading");
	}

	@Test
	public void uiScrollableTest() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(
				AppiumBy.className("android.widget.Image")));

		String UiScrollable = "UiScrollable(UiSelector().scrollable(true))";

		List<WebElement> imageElements = driver.findElements(
				AppiumBy.className("android.widget.Image"));
		System.out.println("Before scroll: " + imageElements.size());

		String imageText = driver.findElement(AppiumBy.androidUIAutomator(
				UiScrollable + ".scrollForward(25).getChildByText(className(\"android.widget.Image
