package pages;

public class MainPage extends BasePage{
    @FindBy(css = ".header_secondary_container .title")
    private WebElement pageTitle;

    @FindBy(css = ".shopping_cart_badge")
    private List<WebElement> cartCount;

    @FindBy(css = "#logout_sidebar_link")
    private WebElement logoutBtn;

    @FindBy(css = "#react-burger-menu-btn")
    private WebElement menu;

    public boolean isTitleDisplayed() {
        return pageTitle.isDisplayed();
    }

    public int getProductCountsInCart() {
        if (cartCount.isEmpty())
            return 0;
        return Integer.parseInt(cartCount.get(0).getText());
    }

    public void logout() {
        menu.click();
        logoutBtn.click();
    }
}
