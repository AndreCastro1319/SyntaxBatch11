package Class24.Task1;

public interface WebDriver {
    //Create a WebDriver Interface that will have the following unimplemented
    // behaviour: openBrowser(), closeBrowser(), maximizeWindow(), findElement().
    // Create 2 classes that implements WebDriver
    // interface: ChromeDriver and FirefoxDriver.

    void openBrowser();
    void closeBrowser();
    void maximizeWindow();
    void findElement();
}

class ChromeDriver implements WebDriver{
    @Override
    public void openBrowser() {
        System.out.println("Open");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Close");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("Maximize");
    }

    @Override
    public void findElement() {
        System.out.println("Find");
    }
}
class FireDriver implements WebDriver{
    @Override
    public void openBrowser() {
        System.out.println("Fire Open");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Fire Close");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("Fire Maximize");
    }

    @Override
    public void findElement() {
        System.out.println("Fire Find");
    }
}
