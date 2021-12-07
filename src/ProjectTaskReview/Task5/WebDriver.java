package ProjectTaskReview.Task5;

public interface WebDriver {
    void open();
    void close();
    String getTitle();
}
interface TakeScreenShot{
    void getScreenshot();
}
interface  RemoteWebDriver extends TakeScreenShot,WebDriver{
    void navigate();
}

class ChromeDriver implements RemoteWebDriver {
    @Override
    public void open() {
        System.out.println("Opening Chrome Browser");
    }

    @Override
    public void close() {
        System.out.println("Closing Chrome Browser");
    }

    @Override
    public String getTitle() {
        return "Title from Google Chrome";
    }

    @Override
    public void getScreenshot() {
        System.out.println("Taking screenshot from Google Chrome");
    }

    @Override
    public void navigate() {
        System.out.println("Navigating in Google Chrome");
    }
}
class FireFoxDriver implements RemoteWebDriver{
    @Override
    public void open() {
        System.out.println("Opening from FireFox");
    }

    @Override
    public void close() {
        System.out.println("Closing from FireFox");
    }

    @Override
    public String getTitle() {
        return "Title from Firefox";
    }

    @Override
    public void getScreenshot() {
        System.out.println("Taking screenshot from Firefox");
    }

    @Override
    public void navigate() {
        System.out.println("Navigating in Firefox");
    }
}
class Safari implements RemoteWebDriver{
    @Override
    public void open() {
        System.out.println("Opening from Safari");
    }

    @Override
    public void close() {
        System.out.println("Closing from Safari");
    }

    @Override
    public String getTitle() {
        return "Title from Safari";
    }

    @Override
    public void getScreenshot() {
        System.out.println("Taking screenshot from Safari");
    }

    @Override
    public void navigate() {
        System.out.println("Navigating in Safari");
    }
}
