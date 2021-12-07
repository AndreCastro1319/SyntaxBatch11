package ProjectTaskReview.Task5;

public class WebDriverTester {
    public static void main(String[] args) {
        RemoteWebDriver [] remoteWebDrivers={new ChromeDriver(),new FireFoxDriver(), new Safari()};
                for (RemoteWebDriver remote:remoteWebDrivers) {


                    remote.open();
                    remote.close();
                    System.out.println(remote.getTitle());
                    remote.getScreenshot();
                    remote.navigate();


                }


    }
}
