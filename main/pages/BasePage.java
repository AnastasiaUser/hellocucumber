package pages;

import java.utils.PageLoader;

public class BasePage {
    @Getter
    private WebDriver driver;

    @Getter
    private PageLoader pageLoader;

    public BasePage() {
        driver = LocalWebDriverManager.getDriver();
        pageLoader = new PageLoader(driver);
        PageFactory.initElements(driver, this);
    }
}
