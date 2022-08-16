package pages;

public class LoginPage extends BasePage{
    @FindBy(css = ".login_logo")
    private WebElement logo;

    @FindBy(css = "#user-name")
    private WebElement usernameInput;

    @FindBy(css = "#password")
    private WebElement passwordInput;

    @FindBy(css = "#login-button")
    private WebElement loginBtn;

    public void login(String username, String password) {
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginBtn.click();
    }

    public boolean isLogoDisplayed() {
        return logo.isDisplayed();
    }
}
