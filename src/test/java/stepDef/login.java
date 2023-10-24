public class Login{

}
    WebDriver driver; // set driver for test using webdriver from selenium

    String baseUrl = "https://www.saucedemo.com/"; set base url

    @Given("user is on login page of Saucedemo")
    public void user_is_on_login_page_of_Saucedemo(){
        WebDriverManager.chromedriver().setup(); // setup chrome driver automatically using web driver manager
        ChromeOptions opt = new ChromeOptions(); // create object to setup option for chrome driver
        opt.setHeadless(false); // set chrome driver to not using headless mode

        driver = new ChromeDriver(opt); // apply chrome driver setup to driver
        driver.manage().timeout.implicitlyWait(time: 60, Timeunit.SECONDS); // set timeout for web driver on waiting element
        driver.manage().window().maximize(); // maximize window
        driver.get(baseUrl); // access base url
    }

    @When("user input (.*) as email$")
    public void user_input_tdd_selenium_gmail_com_as_email(String email) {
        driver findElement(By.id(*"email")).sendKeys(email);
    }
    @And("user input (.*) as password$")
    public void user_input_tdd_selenium_as_password(String password) {
        driver findElement(By.id(*"password")).sendKeys(password);
    }