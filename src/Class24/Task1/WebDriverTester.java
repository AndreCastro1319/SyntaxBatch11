package Class24.Task1;

public class WebDriverTester {
    public static void main(String[] args) {
        WebDriver [] webDrivers={new ChromeDriver(),new FireDriver()};
        for(WebDriver webDriver:webDrivers){
            webDriver.openBrowser();
            webDriver.closeBrowser();
            webDriver.maximizeWindow();
            webDriver.findElement();
        }
    }
}
