package Class21;

public class WebDriverTester {
    public static void main(String[] args) {


   /* WebDriver webDriver=new GoogleChrome();
    webDriver.openWebsite();
    webDriver.singUp();
    webDriver.login();
    webDriver.enterUserPassword();
    webDriver.clickSubmit();
    webDriver.closeBrowser();

    WebDriver [] webDrivers={new GoogleChrome(), new FireFox(), new Safari()};
    for( WebDriver wd:webDrivers) {
        wd.openWebsite();
        wd.singUp();
        wd.login();
        wd.enterUserPassword();
        wd.clickSubmit();
        wd.closeBrowser();*/


        //GoogleChrome googleChrome=new  WebDriverTest(); not allowed
        WebDriver webDriver1 = new GoogleChrome();
        GoogleChrome chrome = (GoogleChrome) webDriver1;

        chrome.specialMethod();
    }
    }